Feature: Home Page Test
  Scenario: User successful login into web HRM
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User go to page Dashboard

  Scenario: User invalid login into web HRM
    When User click button logout
    And User enter invalid username
    And User enter invalid password
    And User click button login
    Then User get message invalid credentials

  Scenario: User empty login into web HRM
    When User enter valid username
    And User enter no password
    And User click button login
    Then User get message required
