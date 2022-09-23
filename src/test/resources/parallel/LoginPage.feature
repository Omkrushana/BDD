Feature: Login page feature

  @Login
  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

  @Login
  Scenario: Sign Up Password link
    Given user is on login page
    Then Sign up link should be displayed

  @Login
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "jack123"
    And user enters password "Admin@123"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "Shibnobi Play"
