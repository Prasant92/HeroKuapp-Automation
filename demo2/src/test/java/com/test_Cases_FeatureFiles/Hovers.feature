@Hovers_Tests
Feature: To verify the different functionalities present on the Hovers page of Herokuapp website

  Scenario: To verify that Hovers option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Hovers" Hovers link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Hovers page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Hovers" Hovers link
    Then User validates the Page title as "Hovers" on Hovers link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Hovers page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Hovers" Hovers link
    Then User validates the Page content as "Hover over the image for additional information" on Hovers link
    And Close the browser session

  Scenario Outline: To verify that user is able to hover over the image and retrieve the name of the image on Hovers page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Hovers" Hovers link
    Then User hovers the mouse on the image figure and retrieves the name of the image number "<n>"
    And Close the browser session
    Examples:
      |n|
      |1|
      |2|
      |3|

  Scenario Outline: To verify that user is able to hover over the image and retrieve the profile by clicking on view profile link of the image on Hovers page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Hovers" Hovers link
    Then User hovers the mouse on the image figure and clicks on the view profile of the image number "<n>" and validates the profile content of the image as "Not Found"
    And Close the browser session
    Examples:
      |n|
      |1|
      |2|
      |3|