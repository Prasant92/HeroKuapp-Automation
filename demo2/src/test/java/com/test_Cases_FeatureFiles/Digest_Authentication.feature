@DigestAuth_Tests
Feature: To verify the different functionalities present on the Digest Auth page of Herokuapp website

  Scenario Outline: To verify that DigestAuth option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Digest Auth" Digest Auth link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to accept the alert without entering the credentials for Digest Auth functionality
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Digest Auth" Digest Auth link
    Then User accepts the alert by sending the correct credentials
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Digest Auth page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Digest Auth" Digest Auth link
    Then User accepts the alert by sending the correct credentials for Digest Auth
    And User validates the Page title as "Digest Auth" on Digest Auth link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Digest Auth page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Digest Auth" Digest Auth link
    Then User accepts the alert by sending the correct credentials
    And User validates the Page content as "Congratulations! You must have the proper credentials." on Digest Auth link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |