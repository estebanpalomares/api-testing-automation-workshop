@REGRESSION @API

  @API_METHODS_OUTLINE
  Feature: Use the verbs on a Scenario Outline

    Scenario Outline: Use the Method "<method>" in a Scenario Outline
      Given I have a Body Request with "<name>" name, "<lastName>" last name and 34 age
      When I "<method>" the endpoint
      Then I verify the response the name "<name>", last name "<lastName>" and 34 age

      Examples:
      | method    | name      | lastName  |
      | GET       | Jaime     | Palomares |
      | POST      | Cristian  | Ganan     |
      | PUT       | Laura     | Castro    |
