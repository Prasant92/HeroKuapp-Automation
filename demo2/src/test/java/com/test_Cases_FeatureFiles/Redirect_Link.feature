
Feature: To verify the different functionalities present on the Redirect link page of Herokuapp website

  Scenario: To verify that Redirect link option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Redirect Link" Redirect link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Redirect link page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Redirect Link" Redirect link
    Then User validates the Page title as "Redirection" on Redirect link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Status Codes page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Redirect Link" Redirect link
    Then User is redirected to Status codes page and validates the Page title as "Status Codes" on Status Codes page
    And Close the browser session

  Scenario: To verify that user is successfully able to retrieve the Status codes from the IANA page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Redirect Link" Redirect link
    Then User is redirected to IANA page and retrieves the complete list of status codes from the page
    And Close the browser session
  @RedirectLink_Tests
  Scenario Outline: To verify that user is able to view, retrieve, redirect and validate the status code from the list
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Redirect Link" Redirect link
    Then User selects "<Status Code>" redirects to that page and validates Page title as "<Status title>" and redirects back to Status codes Page
    And Close the browser session
    Examples:
      | Status Code | Status title |
      |200          |Status Codes|
      |301          |Status Codes|
      |404          |Status Codes|
      |500          |Status Codes|
