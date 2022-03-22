@DynamicContent_Tests
Feature: To verify the different functionalities present on the Dynamic Content page of Herokuapp website

  Scenario: To verify that Dynamic Content option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Content" Dynamic Content link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Dynamic Content page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Content" Dynamic Content link
    Then User validates the Page title as "Dynamic Content" on Dynamic Content link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Dynamic Content page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Content" Dynamic Content link
    Then User validates the Page content as "This example demonstrates the ever-evolving nature of content by loading new text and images on each page refresh." on Dynamic Content link
    And Close the browser session

  Scenario Outline: To verify that user is successfully able to dynamically validate by changing the content on the Dynamic Content page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Content" Dynamic Content link
    Then User clicks on click here link "<n>" times and capturing the image and its description everytime
    And Close the browser session
    Examples:
      | n |
      | 1 |
      | 3 |
      | 5 |

