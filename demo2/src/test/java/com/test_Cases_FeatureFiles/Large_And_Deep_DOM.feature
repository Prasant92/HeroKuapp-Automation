@LargeAndDeepDOM_Tests
Feature: To verify the different functionalities present on the Large And Deep DOM page of Herokuapp website

  Scenario: To verify that Large And Deep DOM option is enabled and clickable
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Large And Deep DOM page title
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User validates the Page title as "Large & Deep DOM" on Large And Deep DOM link
    And Close the browser session

  Scenario: To verify that user is successfully able to validate the Large And Deep DOM page content
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User validates the Page content as "Some pages have very large and deeply nested page layouts, which can trigger odd rendering issues and test performance bottlenecks (depending on your locator strategy). These examples are nested 50 levels deep." on Large And Deep DOM link
    And Close the browser session

  Scenario Outline: To retrieve the required sibling from the Siblings section on the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the "<n>"th sibling from Large And Deep DOM page
    And Close the browser session
    Examples:
    |n|
    |5|
    |10|
    |29|
    |33|
    |45|
    |50|

  Scenario: To retrieve the complete table headers of given table from the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the headers of the Table on the Large And Deep DOM page
    And Close the browser session

  Scenario: To retrieve the complete table content from the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the complete table content from the Large And Deep DOM page
    And Close the browser session

  Scenario Outline: To retrieve the specific value from the table from the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the "<n>" value from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | n  |
      | 5.25  |
      | 10.36 |
      | 29.18 |
      | 33.39 |
      | 45.20 |
      | 50.12 |
      | 22.29 |

  Scenario Outline: To retrieve all the values from specific row of the table from the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves all cell values from "<n>"th row from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | n  |
      | 5  |
      | 10 |
      | 29 |
      | 33 |
      | 45 |
      | 50 |
      | 22 |

  Scenario Outline: To retrieve all the row values from specific column of the table from the Large And Deep DOM page
    Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves all row values from "<n>"th column from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | n  |
      | 5  |
      | 10 |
      | 29 |
      | 33 |
      | 45 |
      | 50 |
      | 22 |