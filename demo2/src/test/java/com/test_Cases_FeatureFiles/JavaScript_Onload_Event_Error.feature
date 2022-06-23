@JavaScriptOnloadEventError_Tests
Feature: To verify the different functionalities present on the JavaScript onload event error page of Herokuapp website

  Scenario: To verify that JavaScript onload event error option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript onload event error" JavaScript onload event error link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the JavaScript onload event error page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript onload event error" JavaScript onload event error link
    Then User validates the Page content as " This page has a JavaScript error in the onload event. This is often a problem to using normal Javascript injection techniques. " on JavaScript onload event error link
    And Close the browser session