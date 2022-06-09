@REGRESSION @API

  @API_METHODS
  Feature: Test the API methods

    @GET_METHOD
    Scenario: Test GET method
      Given I have a Body Request
      When I GET the endpoint
      Then I verify the response

    @POST_METHOD
    Scenario: Test POST method
      Given I have a Body Request
      When I POST the endpoint
      Then I verify the response
