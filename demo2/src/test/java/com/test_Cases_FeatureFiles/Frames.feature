@Frames_Tests
Feature: To verify the different functionalities present on the Frames page of Herokuapp website

  Scenario Outline: To verify that Frames option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Frames page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User validates the Page title as "Frames" on Frames link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to click and move to the Nested Frames page from Frames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "Nested Frames" link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to switch to left frame and get the corresponding text on Nested Frames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "Nested Frames" link
    Then User switches to "Left" frame and retrieves the "LEFT" as the text in the frame
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to switch to middle frame and get the corresponding text on Nested Frames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "Nested Frames" link
    Then User switches to "Middle" frame and retrieves the "MIDDLE" as the text in the frame
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to switch to right frame and get the corresponding text on Nested Frames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "Nested Frames" link
    Then User switches to "Right" frame and retrieves the "RIGHT" as the text in the frame
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to switch to bottom frame and get the corresponding text on Nested Frames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "Nested Frames" link
    Then User switches to "Bottom" frame and retrieves the "BOTTOM" as the text in the frame
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the iFrame page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "iFrame" link
    Then User validates the Page content as "An iFrame containing the TinyMCE WYSIWYG Editor"
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to switch to iframe and get the corresponding text on iFrames page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Frames" Frames link
    Then User clicks on the "iFrame" link
    Then User switches to iframe and retrieves the "Your content goes here." as the text in the frame
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |