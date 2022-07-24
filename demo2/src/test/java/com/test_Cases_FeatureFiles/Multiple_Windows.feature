@MultipleWindows_Tests
Feature: To verify the different functionalities present on the Multiple Windows page of Herokuapp website

  Scenario: To verify that Multiple Windows option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Multiple Windows" Multiple Windows link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Multiple Windows page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Multiple Windows" Multiple Windows link
    Then User validates the Page title as "Opening a new window" on Multiple Windows link
    And Close the browser session

  Scenario: To verify that user is successfully able to open a new tab and validate the title of the page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Multiple Windows" Multiple Windows link
    Then User opens a new tab and validates the Page title as "Opening a new window" on new page of Multiple Windows link and redirects back to the parent tab
    And Close the browser session