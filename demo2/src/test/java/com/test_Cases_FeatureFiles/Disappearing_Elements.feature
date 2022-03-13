@DisappearingElements_Tests
Feature: To verify the different functionalities present on the Disappearing Elements page of Herokuapp website

  Scenario: To verify that Disappearing Elements option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Disappearing Elements page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User validates the Page title as "Disappearing Elements" on Disappearing Elements link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Disappearing Elements page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User validates the Page content as "This example demonstrates when elements on a page change by disappearing/reappearing on each page load." on Disappearing Elements link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the About page Link content of Disappearing Elements functionality
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User clicks on the About link on the Disappearing Elements link page then verifies the Page content as "Not Found" and navigates back to the Disappearing Elements link page
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Contact Us page Link content of Disappearing Elements functionality
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User clicks on the Contact Us link on the Disappearing Elements link page and verifies the Page content as "Not Found" and navigates back to the Disappearing Elements link page
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Portfolio page Link content of Disappearing Elements functionality
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User clicks on the Portfolio link on the Disappearing Elements link page and verifies the Page content as "Not Found" and navigates back to the Disappearing Elements link page
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Home page Link content of Disappearing Elements functionality
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then User clicks on the Home link on the Disappearing Elements link page and verifies the Page content "Welcome to the-internet" and navigates back to the Disappearing Elements link page
    And Close the browser session

  Scenario: To validate whether there any broken links on the Disappearing Elements page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Disappearing Elements" Disappearing Elements link
    Then Validate the broken links on the Disappearing Elements page
    And Close the browser session