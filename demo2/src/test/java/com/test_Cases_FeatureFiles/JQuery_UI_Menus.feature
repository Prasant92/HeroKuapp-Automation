@JQueryUIMenus_Tests
Feature: To verify the different functionalities present on the JQuery UI Menus page of Herokuapp website

  Scenario Outline: To verify that JQuery UI Menus option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JQuery UI Menus page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User validates the Page title as "JQueryUI - Menu" on JQuery UI Menus link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JQuery UI Menus page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User validates the Page content as "JQuery UI Menus" on JQuery UI Menus link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JQuery UI page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User hovers over the Enabled option and clicks on back to JQuery UI page and validates page title as "JQuery UI"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JQuery UI page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User hovers over the Enabled option and clicks on back to JQuery UI page and validates page content as "is many things, but one thing specifically that causes automation challenges is their set of Widgets"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to redirect to the JQuery UI page and back to JQueryUI - Menu page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User hovers over the Enabled option and clicks on back to JQuery UI page and redirects back to the menu page with title as "JQueryUI - Menu"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to download in required format on the JQueryUI - Menu
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JQuery UI Menus" JQuery UI Menus link
    Then User hovers over the Enabled option and hovers again on the Downloads option to download the document in "<format>"
    And Close the browser session
    Examples:
      | browser      |format|
      | Firefox      |PDF   |
      | Firefox      |CSV   |
      | Firefox      |Excel |
      | GoogleChrome      |PDF   |
      | GoogleChrome      |CSV   |
      | GoogleChrome      |Excel |
      | Edge      |PDF   |
      | Edge      |CSV   |
      | Edge      |Excel |