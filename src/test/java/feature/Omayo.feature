Feature: Validating the login functionality

  @login
  Scenario Outline: User should able to login to the valid credentials
    Given User navigate to omayo website
    When User enter username <username> and password <password> in the fields
    And User click on the login button
    Then User should able to get the login based expected <status> status

    Examples:
    |username      | password|status  |
    |abc           |123      |failed  |
    |SeleniumByArun|Test143$ |Success |
    |pqr           |144      |failed  |