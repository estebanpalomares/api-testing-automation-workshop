package training.api.test.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import training.api.test.controller.AnythingController;
import training.api.test.model.BodyExample;

public class APIMethodsStepDefinition {

    private AnythingController anythingController = new AnythingController();
    private BodyExample bodyExample = new BodyExample();
    private Response response = null;
    private String bodyResponse;

    @Given("I have a Body Request")
    public void iHaveABodyRequest() {
        this.bodyExample = this.anythingController.createBodyExample("Jaime","Palomares",34);
    }

    @When("I GET the endpoint")
    public void iGETTheEndpoint() {
        this.response = this.anythingController.useGETMethodOnAnythingURL(this.bodyExample);
        this.response.then().statusCode(200);
        this.bodyResponse = this.response.prettyPrint();
    }

    @Then("I verify the response")
    public void iVerifyTheResponse() {
        Assert.assertTrue(this.bodyResponse.contains("Jaime"));
        Assert.assertTrue(this.bodyResponse.contains("Palomares"));
        Assert.assertTrue(this.bodyResponse.contains("34"));
    }

    @When("I POST the endpoint")
    public void iPOSTTheEndpoint() {
        this.response = this.anythingController.usePOSTMethodOnAnythingURL(this.bodyExample);
        this.response.then().statusCode(200);
        this.bodyResponse = this.response.prettyPrint();
    }
}
