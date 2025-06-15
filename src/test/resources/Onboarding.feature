Feature: Validate API : "/login" method: GET


  Rule: Validate API : "/login" method: GET with valid credentials

    Example:
        Given User have base URL as AUTHSERVICE
        And User have API as LOGIN

  Scenario:Validate API : "login"  Method: GET with valid credentials
    Given User have headers as below
    |Content-Type|
    |application/json|
    And User have query parameters as below
    |username|password|
    |        |        |
    When User peforms RequestType: "GET" for BASEURL : AUTHSERVICE , API : LOGIN
    Then User should get response code as 200
    And User should get response body as below with MatchType: "EQUAL"
    |status|message|
    |success|Login successful|