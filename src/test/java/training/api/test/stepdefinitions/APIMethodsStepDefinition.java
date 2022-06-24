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

    @Then("I verify the response")
    public void iVerifyTheResponse() {
        Assert.assertTrue(this.bodyResponse.contains("Jaime"));
        Assert.assertTrue(this.bodyResponse.contains("Palomares"));
        Assert.assertTrue(this.bodyResponse.contains("34"));
    }
    
    @When("I {string} the endpoint")
    public void iTheEndpoint(String method) {

        switch (method){

            case "GET":
                this.response = this.anythingController.useGETMethodOnAnythingURL(this.bodyExample);
                break;
            case "POST":
                this.response = this.anythingController.usePOSTMethodOnAnythingURL(this.bodyExample);
                break;
            case "PUT":
                this.response = this.anythingController.usePUTMethodOnAnythingURL(this.bodyExample);
                break;
            case "PATCH":
                this.response = this.anythingController.usePATCHMethodOnAnythingURL(this.bodyExample);
                break;
            case "DELETE":
                this.response = this.anythingController.useDELETEMethodOnAnythingURL(this.bodyExample);
                break;
            default:
                Assert.fail("The method: "+method+" does not exist.");
                break;
        }
        this.response.then().statusCode(200);
        this.bodyResponse = this.response.prettyPrint();
    }

    @Given("I have a Body Request with {string} name, {string} last name and {int} age")
    public void iHaveABodyRequestWithNameLastNameAndAge(String name, String lastName, int age) {
        this.bodyExample = this.anythingController.createBodyExample(name,lastName,age);
    }

    @Then("I verify the response the name {string}, last name {string} and {int} age")
    public void iVerifyTheResponseTheNameLastNameAndAge(String name, String lastName, Integer age) {
        Assert.assertTrue(this.bodyResponse.contains(name));
        Assert.assertTrue(this.bodyResponse.contains(lastName));
        Assert.assertTrue(this.bodyResponse.contains(age.toString()));
    }
}
