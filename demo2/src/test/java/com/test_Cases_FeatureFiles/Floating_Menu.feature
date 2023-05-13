@FloatingMenu_Tests
Feature: To verify the different functionalities present on the Floating Menu page of Herokuapp website

  Scenario Outline: To verify that Floating Menu option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Floating Menu page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User validates the Page title as "Floating Menu" on Floating Menu link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to scroll down to bottom of Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User scrolls down to the bottom of the Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to scroll up to top from bottom of Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User scrolls up to the top from bottom of the Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click and validate the Home menu on Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User clicks and asserts the Home menu URL as "https://the-internet.herokuapp.com/floating_menu#home" on Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click and validate the News menu on Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User clicks and asserts the News menu URL as "https://the-internet.herokuapp.com/floating_menu#news" on Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click and validate the Contact menu on Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User clicks and asserts the Contact menu URL as "https://the-internet.herokuapp.com/floating_menu#contact" on Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click and validate the About menu on Floating Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Floating Menu" Floating Menu link
    Then User clicks and asserts the About menu URL as "https://the-internet.herokuapp.com/floating_menu#about" on Floating Menu page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |