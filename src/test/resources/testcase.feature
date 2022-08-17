@tag
Feature: login

  @tag1
  Scenario: Login with valid credentials
    Given Open the browser and enter the valid URL
    When user eneters valid username
    And user eneters valid password
    When click on login button
    Then user should in homepage of the application
 