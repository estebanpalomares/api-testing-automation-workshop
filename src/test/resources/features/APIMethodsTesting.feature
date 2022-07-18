@REGRESSION @API

  @API_METHODS
  Feature: Test the API methods

    @GET_METHOD
    Scenario: Test GET method
      Given I have a Body Request
      When I "GET" the endpoint
      Then I verify the response

    @POST_METHOD
    Scenario: Test POST method
      Given I have a Body Request
      When I "POST" the endpoint
      Then I verify the response

    @PUT_METHOD
    Scenario: Test PUT method
      Given I have a Body Request
      When I "PUT" the endpoint
      Then I verify the response

    @PATCH_METHOD
    Scenario: Test PATCH method
      Given I have a Body Request
      When I "PATCH" the endpoint
      Then I verify the response

    @DELETE_METHOD
    Scenario: Test DELETE method
      Given I have a Body Request
      When I "DELETE" the endpoint
      Then I verify the response
