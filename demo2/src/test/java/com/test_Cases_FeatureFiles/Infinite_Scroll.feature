@InfiniteScroll_Tests
Feature: To verify the different functionalities present on the Infinite Scroll page of Herokuapp website

  Scenario: To verify that Infinite Scroll option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Infinite Scroll page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    Then User validates the Page title as "Infinite Scroll" on Infinite Scroll link
    And Close the browser session

  Scenario Outline: To verify that user is successfully able to scroll infinite times on the Infinite Scroll page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    Then User scrolls down to the bottom of the Infinite Scroll page by "<n>" times
    And Close the browser session
    Examples:
    |n|
    |1|
    |5|
    |10|
    |20|
    |40|
