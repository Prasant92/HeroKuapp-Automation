@KeyPresses_Tests
Feature: To verify the different functionalities present on the Key Presses page of Herokuapp website

  Scenario Outline: To verify that Key Presses option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Key Presses" Key Presses link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Key Presses page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Key Presses" Key Presses link
    Then User validates the Page title as "Key Presses" on Key Presses link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Key Presses page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Key Presses" Key Presses link
    Then User validates the Page content as "Key presses are often used to interact with a website (e.g., tab order, enter, escape, etc.). Press a key and see what you inputted." on Key Presses link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is able to verify the keys pressed while populated in the text box on the Key Presses page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Key Presses" Key Presses link
    Then User populates the "<text>" into the textbox and verifies them on the Key pressed page
    And Close the browser session
    Examples:
      | browser      | text |
      | Firefox      |qwert12345|
      | Firefox      |@234)$%^&*|
      | Firefox      |ewiurhuhf    5|
      | GoogleChrome      |qwert12345|
      | GoogleChrome      |@234)$%^&*|
      | GoogleChrome      |ewiurhuhf    5|
      | Edge      |qwert12345|
      | Edge      |@234)$%^&*|
      | Edge      |ewiurhuhf    5|