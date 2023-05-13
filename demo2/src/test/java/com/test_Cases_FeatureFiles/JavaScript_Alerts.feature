@JavaScriptAlerts_Tests
Feature: To verify the different functionalities present on the JavaScript Alerts page of Herokuapp website

  Scenario Outline: To verify that Hovers option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript onload event error" JavaScript Alerts link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JavaScript Alerts page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript onload event error" JavaScript Alerts link
    Then User validates the Page title as "JavaScript Alerts" on JavaScript Alerts link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript onload event error" JavaScript Alerts link
    Then User validates the Page content as "Here are some examples of different JavaScript alerts which can be troublesome for automation" on JavaScript Alerts link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to accept the JS alert on the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript Alerts" JavaScript Alerts link
    Then User accepts the JS alert by clicking on JSAlert button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to accept the JS confirm alert on the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript Alerts" JavaScript Alerts link
    Then User accepts the JS alert by clicking on JSConfirm button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to dismiss the JS confirm alert on the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript Alerts" JavaScript Alerts link
    Then User dismisses the JS alert by clicking on JSConfirm button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to accept the JS prompt alert on the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript Alerts" JavaScript Alerts link
    Then User enters the text in prompt alert and accepts the JS alert by clicking on JSPrompt button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to accept the JS prompt alert on the JavaScript Alerts page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "JavaScript Alerts" JavaScript Alerts link
    Then User enters the text in prompt alert and dismisses the JS alert by clicking on JSPrompt button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |