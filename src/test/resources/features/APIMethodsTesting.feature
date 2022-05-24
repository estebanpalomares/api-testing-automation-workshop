@REGRESSION @API

  @API_METHODS
  Feature: Test the API methods

    Scenario: Test GET method
      Given I have a Body Request
      When I GET the endpoint
      Then I verify the response