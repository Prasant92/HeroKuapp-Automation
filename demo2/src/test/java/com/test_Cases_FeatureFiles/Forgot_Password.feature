@ForgotPassword_Tests
Feature: To verify the different functionalities present on the Forgot Password page of Herokuapp website

  Scenario: To verify that Forgot Password option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Forgot Password page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    Then User validates the Page title as "Forgot Password" on Forgot Password link
    And Close the browser session

  Scenario Outline: To verify that user is successfully able to validate the result while performing Forgot Password process
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    Then User populates different sets of "<emailID>"
    Then User clicks on the retrieve password button
    And Close the browser session
    Examples:
      |emailID                       |
      |prasantbhagavatula92@gmail.com|
      |123_123@xyz.com               |
      |qwerty123@xyz.com             |
      |123qwerty                     |