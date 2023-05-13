@Inputs_Tests
Feature: To verify the different functionalities present on the Inputs page of Herokuapp website

  Scenario Outline: To verify that Inputs option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Inputs page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User validates the Page title as "Inputs" on Inputs link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Inputs page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User validates the Page content as "Number" on Inputs link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to increment the value entered in the Text box on Inputs page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User populates the required value "<value>" and then increments it
    And Close the browser session
    Examples:
      | browser      |value|
      | Firefox      |0    |
      | Firefox      |100  |
      | Firefox      |-10  |
      | GoogleChrome      |0    |
      | GoogleChrome      |100  |
      | GoogleChrome      |-10  |
      | Edge      |0    |
      | Edge      |100  |
      | Edge      |-10  |
  Scenario Outline: To verify that user is successfully able to decrement the value entered in the Text box on Inputs page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User populates the required value "<value>" and then decrements it
    And Close the browser session
    Examples:
      | browser      |value|
      | Firefox      |0    |
      | Firefox      |100  |
      | Firefox      |-10  |
      | GoogleChrome      |0    |
      | GoogleChrome      |100  |
      | GoogleChrome      |-10  |
      | Edge      |0    |
      | Edge      |100  |
      | Edge      |-10  |