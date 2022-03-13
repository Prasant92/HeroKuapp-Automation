@Dropdown_Tests
Feature: To verify the different functionalities present on the Dropdown page of Herokuapp website

  Scenario: To verify that Dropdown option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dropdown" Dropdown link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Dropdown page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dropdown" Dropdown link
    Then User validates the Page title as "Dropdown List" on Dropdown link
    And Close the browser session

  Scenario: To verify that user is successfully able to click on the Dropdown and select the first option from it
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dropdown" Dropdown link
    Then User performs the click operation on the Dropdown on Dropdown page
    And User selects the first option from the Dropdown on Dropdown page
    And Close the browser session

  Scenario: To verify that user is successfully able to click on the Dropdown and select the second option from it
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dropdown" Dropdown link
    Then User performs the click operation on the Dropdown on Dropdown page
    And User selects the second option from the Dropdown on Dropdown page
    And Close the browser session
