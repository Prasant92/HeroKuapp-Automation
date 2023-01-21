@FileUpload_Tests
Feature: To verify the different functionalities present on the File Upload page of Herokuapp website

  Scenario Outline: To verify that File Upload option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Upload" File Upload link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the File Upload page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Upload" File Upload link
    Then User validates the Page title as "File Uploader" on File Upload link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the File Upload page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Upload" File Upload link
    Then User validates the Page content as "Choose a file on your system and then click upload. Or, drag and drop a file into the area below." on File Upload link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to upload the required files on File Upload page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Upload" File Upload link
    Then User uploads the required files on File Upload page by clicking on Choose file button
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to upload the required files by using drag and drop functionality on File Upload page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Upload" File Upload link
    Then User uploads the required files on File Upload page by using drag and drop functionality
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |