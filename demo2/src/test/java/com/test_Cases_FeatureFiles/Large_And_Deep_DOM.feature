@LargeAndDeepDOM_Tests
Feature: To verify the different functionalities present on the Large And Deep DOM page of Herokuapp website

  Scenario Outline: To verify that Large And Deep DOM option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Large And Deep DOM page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User validates the Page title as "Large & Deep DOM" on Large And Deep DOM link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To verify that user is successfully able to validate the Large And Deep DOM page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User validates the Page content as "Some pages have very large and deeply nested page layouts, which can trigger odd rendering issues and test performance bottlenecks (depending on your locator strategy). These examples are nested 50 levels deep." on Large And Deep DOM link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To retrieve the required sibling from the Siblings section on the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the "<n>"th sibling from Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      |n|
      | Firefox      |5|
      | Firefox      |10|
      | Firefox      |29|
      | Firefox      |33|
      | Firefox      |45|
      | Firefox      |50|
      | GoogleChrome      |5|
      | GoogleChrome      |10|
      | GoogleChrome      |29|
      | GoogleChrome      |33|
      | GoogleChrome      |45|
      | GoogleChrome      |50|
      | Edge      |5|
      | Edge      |10|
      | Edge      |29|
      | Edge      |33|
      | Edge      |45|
      | Edge      |50|

  Scenario Outline: To retrieve the complete table headers of given table from the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the headers of the Table on the Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To retrieve the complete table content from the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the complete table content from the Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |
      | Edge         |

  Scenario Outline: To retrieve the specific value from the table from the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves the "<n>" value from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      | n  |
      | Firefox      | 5.25  |
      | Firefox      | 10.36 |
      | Firefox      | 29.18 |
      | Firefox      | 33.39 |
      | Firefox      | 45.20 |
      | Firefox      | 50.12 |
      | Firefox      | 22.29 |
      | GoogleChrome      | 5.25  |
      | GoogleChrome      | 10.36 |
      | GoogleChrome      | 29.18 |
      | GoogleChrome      | 33.39 |
      | GoogleChrome      | 45.20 |
      | GoogleChrome      | 50.12 |
      | GoogleChrome      | 22.29 |
      | Edge      | 5.25  |
      | Edge      | 10.36 |
      | Edge      | 29.18 |
      | Edge      | 33.39 |
      | Edge      | 45.20 |
      | Edge      | 50.12 |
      | Edge      | 22.29 |

  Scenario Outline: To retrieve all the values from specific row of the table from the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves all cell values from "<n>"th row from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      | n  |
      | Firefox      | 5  |
      | Firefox      | 10 |
      | Firefox      | 29 |
      | Firefox      | 33 |
      | Firefox      | 45 |
      | Firefox      | 50 |
      | Firefox      | 22 |
      | GoogleChrome      | 5  |
      | GoogleChrome      | 10 |
      | GoogleChrome      | 29 |
      | GoogleChrome      | 33 |
      | GoogleChrome      | 45 |
      | GoogleChrome      | 50 |
      | GoogleChrome      | 22 |
      | Edge      | 5  |
      | Edge      | 10 |
      | Edge      | 29 |
      | Edge      | 33 |
      | Edge      | 45 |
      | Edge      | 50 |
      | Edge      | 22 |

  Scenario Outline: To retrieve all the row values from specific column of the table from the Large And Deep DOM page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Large & Deep DOM" Large And Deep DOM link
    Then User retrieves all row values from "<n>"th column from the table on Large And Deep DOM page
    And Close the browser session
    Examples:
      | browser      | n  |
      | Firefox      | 5  |
      | Firefox      | 10 |
      | Firefox      | 29 |
      | Firefox      | 33 |
      | Firefox      | 45 |
      | Firefox      | 50 |
      | Firefox      | 22 |
      | GoogleChrome      | 5  |
      | GoogleChrome      | 10 |
      | GoogleChrome      | 29 |
      | GoogleChrome      | 33 |
      | GoogleChrome      | 45 |
      | GoogleChrome      | 50 |
      | GoogleChrome      | 22 |
      | Edge      | 5  |
      | Edge      | 10 |
      | Edge      | 29 |
      | Edge      | 33 |
      | Edge      | 45 |
      | Edge      | 50 |
      | Edge      | 22 |