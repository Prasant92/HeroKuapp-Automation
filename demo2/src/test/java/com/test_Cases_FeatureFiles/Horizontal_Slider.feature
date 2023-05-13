@HorizontalSlider_Tests
Feature: To verify the different functionalities present on the Horizontal Slider page of Herokuapp website

  Scenario Outline: To verify that Geolocation option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Horizontal Slider" Horizontal Slider link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Horizontal Slider page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Horizontal Slider" Horizontal Slider link
    Then User validates the Page title as "Horizontal Slider" on Horizontal Slider link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Horizontal Slider page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Horizontal Slider" Horizontal Slider link
    Then User validates the Page content as "Set the focus on the slider (by clicking on it) and use the arrow keys to move it right and left. Or click and drag the slider with your mouse. It will indicate the value of the slider to the right." on Horizontal Slider link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to move the slider Horizontally from left to right on Horizontal Slider page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Horizontal Slider" Horizontal Slider link
    Then User moves the slider from left to right by "<max>" times on Horizontal slider page
    And Close the browser session
    Examples:
      | browser      |max |
      | Firefox      | 1 |
      | Firefox      | 0.5   |
      | GoogleChrome      | 1 |
      | GoogleChrome      | 0.5   |
      | Edge      | 1 |
      | Edge      | 0.5   |

  Scenario Outline: To verify that user is successfully able to move the slider Horizontally from right to left on Horizontal Slider page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Horizontal Slider" Horizontal Slider link
    Then User moves the slider from left to right by "<max>" times on Horizontal slider page
    Then User moves the slider from right to left by "<min>" times on Horizontal slider page
    And Close the browser session
    Examples:
      | browser      | max | min |
      | Firefox      | 3   | 2   |
      | Firefox      | 4.5 | 1   |
      | GoogleChrome      | 3   | 2   |
      | GoogleChrome      | 4.5 | 1   |
      | Edge      | 3   | 2   |
      | Edge      | 4.5 | 1   |
