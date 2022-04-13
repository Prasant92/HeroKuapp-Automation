@ExitIntent_Tests
Feature: To verify the different functionalities present on the Exit Intent page of Herokuapp website

  Scenario: To verify that Exit Intent option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Exit Intent" Exit Intent link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Exit Intent page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Exit Intent" Exit Intent link
    Then User validates the Page title as "Exit Intent" on Exit Intent link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Exit Intent page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Exit Intent" Exit Intent link
    Then User validates the Page content as "Mouse out of the viewport pane and see a modal window appear." on Exit Intent link
    And Close the browser session