@EntryAd_Tests
Feature: To verify the different functionalities present on the Entry Ad page of Herokuapp website

  Scenario: To verify that Entry Ad option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Entry Ad" Entry Ad link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Entry Ad page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Entry Ad" Entry Ad link
    Then User clicks on Close link on Modal Window on Entry Ad link
    Then User validates the Page title as "Entry Ad" on Entry Ad link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Entry Ad page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Entry Ad" Entry Ad link
    Then User clicks on Close link on Modal Window on Entry Ad link
    Then User validates the Page content as "Displays an ad on page load." on Entry Ad link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Modal Window title on Entry Ad page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Entry Ad" Entry Ad link
    Then User validates the Page title as "THIS IS A MODAL WINDOW" on Modal Window
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Modal Window content on Entry Ad page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Entry Ad" Entry Ad link
    Then User validates the Page content as "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker)." on Modal Window
    And Close the browser session

    Scenario: To verify that user is not able to launch the modal window after clicking on the click here link on Entry Ad page
      Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
      When User is on the homePage of the website
      Then Validate that heading of the homepage is "Welcome to the-internet"
      And User clicks on the "Entry Ad" Entry Ad link
      Then User clicks on Close link on Modal Window on Entry Ad link
      Then User clicks on "click here" link on on Entry Ad link
      And Close the browser session

