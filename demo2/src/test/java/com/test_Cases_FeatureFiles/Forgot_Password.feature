@ForgotPassword_Tests
Feature: To verify the different functionalities present on the Forgot Password page of Herokuapp website

  Scenario Outline: To verify that Forgot Password option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Forgot Password page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    Then User validates the Page title as "Forgot Password" on Forgot Password link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the result while performing Forgot Password process
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Forgot Password" Forgot Password link
    Then User populates different sets of "<emailID>"
    Then User clicks on the retrieve password button
    And Close the browser session
    Examples:
      |emailID                       |browser	  |
      |prasantbhagavatula92@gmail.com|Firefox	  |
      |123_123@xyz.com               |Firefox	  |
      |qwerty123@xyz.com             |Firefox	  |
      |123qwerty                     |Firefox	  |
      |prasantbhagavatula92@gmail.com|GoogleChrome	  |
      |123_123@xyz.com               |GoogleChrome	  |
      |qwerty123@xyz.com             |GoogleChrome	  |
      |123qwerty                     |GoogleChrome	  |