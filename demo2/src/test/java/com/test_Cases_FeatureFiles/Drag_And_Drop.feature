@DragAndDrop_Tests
Feature: To verify the different functionalities present on the Drag And Drop page of Herokuapp website

  Scenario Outline: To verify that DragAndDrop option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Drag And Drop" Drag And Drop link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Drag And Drop page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Drag And Drop" Drag And Drop link
    Then User validates the Page title as "Drag and Drop" on Drag And Drop link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to drag A box from source to B box target on the Drag And Drop page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Drag And Drop" Drag And Drop link
    Then User performs the Drag and Drop operation from source A box to target B box on Drag And Drop page and validates that Target is "A"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to drag B box from source to A box target on the Drag And Drop page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Drag And Drop" Drag And Drop link
    Then User performs the Drag and Drop operation from source B box to target A box on Drag And Drop page and validates that Target is "B"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
