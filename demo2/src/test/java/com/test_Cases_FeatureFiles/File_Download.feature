@FileDownload_Tests
Feature: To verify the different functionalities present on the File Download page of Herokuapp website

  Scenario: To verify that File Download option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Download" File Download link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the File Download page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Download" File Download link
    Then User validates the Page title as "File Downloader" on File Download link
    And Close the browser session

  Scenario: To validate whether there any broken links on the File Download page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Download" File Download link
    And Validate the broken links on the File Download Page
    And Close the browser session

  Scenario Outline: To verify that user is successfully able to download and validate the file
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "File Download" File Download link
    Then User clicks on the "<download link>" on File Download link
    Then User verifies the "<downloaded filename>" in the filepath
    And Close the browser session
    Examples:
      |download link |downloaded filename|
      |LambdaTest.txt|LambdaTest.txt     |
      #|sample.pdf    |sample.pdf         |