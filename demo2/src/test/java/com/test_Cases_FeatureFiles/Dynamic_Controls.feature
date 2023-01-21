@DynamicControls_Tests
Feature: To verify the different functionalities present on the Dynamic Controls page of Herokuapp website

  Scenario Outline: To verify that Dynamic Controls option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Dynamic Controls page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    Then User validates the Page title as "Dynamic Controls" on Dynamic Controls link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Dynamic Controls page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    Then User validates the Page content as "This example demonstrates when elements (e.g., checkbox, input field, etc.) are changed asynchronously." on Dynamic Controls link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click on Remove button without ticking the checkbox on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User clicks on Remove button without ticking the checkbox
    Then User validates the "It's gone!" message
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click on Remove button after ticking the checkbox on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User ticks on the Checkbox
    And User clicks on Remove button after ticking the checkbox
    Then User validates the "It's gone!" message
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click on Add button when checkbox is removed without ticking on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User clicks on Remove button without ticking the checkbox
    Then User validates the "It's gone!" message
    And User clicks on Add button
    Then User validates the "It's back!" message
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click on Remove button after ticking the checkbox on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User ticks on the Checkbox
    And User clicks on Remove button after ticking the checkbox
    Then User validates the "It's gone!" message
    And User clicks on Add button
    Then User validates the "It's back!" message
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is able to perform the Removal and Addition of checkbox multiple times by ticking the checkbox on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    Then User performs the removal and addition of checkbox multiple times by ticking the checkbox "<n>" times
    And Close the browser session
    Examples:
      | n  |browser	  |
      | 4  |Firefox	  |
      | 6  |Firefox	  |
      | 10 |Firefox	  |
      | 4  |GoogleChrome|
      | 6  |GoogleChrome|
      | 10 |GoogleChrome|

  Scenario Outline: To verify that user is able to click on Enable button and populate the text into TextBox on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User clicks on Enable button
    And User verifies the status as "It's enabled!"
    Then User populates desired text "Hello World" into textbox
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is able to click on Disable button on Dynamic Controls page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Dynamic Controls" Dynamic Controls link
    And User clicks on Enable button
    And User verifies the status as "It's enabled!"
    Then User populates desired text "Hello World" into textbox
    And User clicks on the Disable button
    Then User verifies the status as "It's disabled!"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |