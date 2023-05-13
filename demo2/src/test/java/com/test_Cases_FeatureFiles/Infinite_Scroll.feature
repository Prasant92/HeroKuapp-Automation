@InfiniteScroll_Tests
Feature: To verify the different functionalities present on the Infinite Scroll page of Herokuapp website

  Scenario Outline: To verify that Infinite Scroll option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Infinite Scroll page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    Then User validates the Page title as "Infinite Scroll" on Infinite Scroll link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to scroll infinite times on the Infinite Scroll page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Infinite Scroll" Infinite Scroll link
    Then User scrolls down to the bottom of the Infinite Scroll page by "<n>" times
    And Close the browser session
    Examples:
      | browser      |n|
      | Firefox      |1|
      | Firefox      |5|
      | Firefox      |10|
      | Firefox      |20|
      | Firefox      |40|
      | GoogleChrome      |1|
      | GoogleChrome      |5|
      | GoogleChrome      |10|
      | GoogleChrome      |20|
      | GoogleChrome      |40|
      | Edge      |1|
      | Edge      |5|
      | Edge      |10|
      | Edge      |20|
      | Edge      |40|