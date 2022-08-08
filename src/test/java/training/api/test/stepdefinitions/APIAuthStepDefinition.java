package training.api.test.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import training.api.test.controller.BearerController;

public class APIAuthStepDefinition {

    private BearerController bearerController = new BearerController();
    private Response response = null;
    private String bodyResponse;

    private String authority;

    @Given("I have a AUTH Request")
    public void iHaveAAuthRequest() {
        this.authority = "ace93b81-7db2-4a48-804d-e1a62e2dd230";
    }

    @Given("I have a unauthorized Request")
    public void iHaveUnauthorizedRequest() {
        this.authority = "";
    }

    @When("I GET the Bearer endpoint status {string}")
    public void iTheEndpoint(String status) {
        this.response = this.bearerController.useGETMethodOnBearerURL("Bearer "+this.authority);
        this.response.then().statusCode(Integer.parseInt(status));
        this.bodyResponse = this.response.prettyPrint();
    }

    @When("I {string} the Bearer endpoint unauthorized")
    public void UnauthorizedEndpoint(String method) {
        this.response = this.bearerController.useGETMethodOnBearerURL("Bearer "+this.authority);
        this.response.then().statusCode(401);
        this.bodyResponse = this.response.prettyPrint();
    }

    @Then("I verify the Bearer response")
    public void iVerifyTheBearerResponse() {
        Assert.assertTrue(this.bodyResponse.contains("\"authenticated\": true"));
        Assert.assertTrue(this.bodyResponse.contains("\"token\": \""+authority+"\""));
    }

    @Then("I verify the Bearer response is empty")
    public void iVerifyTheBearerResponseIsEmpty() {
        Assert.assertTrue(this.bodyResponse.isEmpty());
    }
}
