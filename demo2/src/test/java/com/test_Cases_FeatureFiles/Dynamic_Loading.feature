@DynamicLoading_Tests
Feature: To verify the different functionalities present on the Dynamic Loading page of Herokuapp website

  Scenario: To verify that Dynamic Loading option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Dynamic Loading page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User validates the Page title as "Dynamically Loaded Page Elements" on Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Dynamic Controls page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User validates the Page content as "It's common to see an action get triggered that returns a " on Dynamic Loading link
    And Close the browser session

  Scenario: To validate whether there any broken links on the Dynamic Controls page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    And Validate the broken links on the homepage
    And Close the browser session

  Scenario: To verify that Example 1: Element on page that is hidden option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 1: Element on page that is hidden" Example 1 link on Dynamically Loaded Page Elements page
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Example 1 page title of Dynamic Loading page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 1: Element on page that is hidden" Example 1 link on Dynamically Loaded Page Elements page
    Then User validates the Page title as "Dynamically Loaded Page Elements" on Example 1 of Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Example 1 page content of Dynamic Loading page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 1: Element on page that is hidden" Example 1 link on Dynamically Loaded Page Elements page
    Then User validates the Page content as "Example 1: Element on page that is hidden" on Example 1 of Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to click Start button and validate the text on Example 1 of Dynamic Controls page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 1: Element on page that is hidden" Example 1 link on Dynamically Loaded Page Elements page
    Then User clicks Start button and validates the text as "Hello World!" on Example 1 of Dynamic Loading link
    And Close the browser session

  Scenario: To verify that Example 2: Element rendered after the fact option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 2: Element rendered after the fact" Example 2 link on Dynamically Loaded Page Elements page
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Example 2 page title of Dynamic Loading page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 2: Element rendered after the fact" Example 2 link on Dynamically Loaded Page Elements page
    Then User validates the Page title as "Dynamically Loaded Page Elements" on Example 2 of Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate Example 2 page content of Dynamic Loading page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 2: Element rendered after the fact" Example 2 link on Dynamically Loaded Page Elements page
    Then User validates the Page content as "Example 2: Element rendered after the fact" on Example 2 of Dynamic Loading link
    And Close the browser session

  Scenario: To verify that user is successfully able to click Start button and validate the text on Example 2 of Dynamic Controls page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Loading" Dynamic Loading link
    Then User clicks on the "Example 2: Element rendered after the fact" Example 2 link on Dynamically Loaded Page Elements page
    Then User clicks Start button and validates the text as "Hello World!" on Example 2 of Dynamic Loading link
    And Close the browser session