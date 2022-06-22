@Inputs_Tests
Feature: To verify the different functionalities present on the Inputs page of Herokuapp website

  Scenario: To verify that Inputs option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Inputs page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User validates the Page title as "Inputs" on Inputs link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Inputs page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User validates the Page content as "Number" on Inputs link
    And Close the browser session

  Scenario Outline: To verify that user is successfully able to increment the value entered in the Text box on Inputs page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User populates the required value "<value>" and then increments it
    And Close the browser session
    Examples:
    |value|
    |0    |
    |100  |
    |-10  |

  Scenario Outline: To verify that user is successfully able to decrement the value entered in the Text box on Inputs page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Inputs" Inputs link
    Then User populates the required value "<value>" and then decrements it
    And Close the browser session
    Examples:
      |value|
      |0    |
      |100  |
      |-10  |