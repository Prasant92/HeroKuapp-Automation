@FormAuthentication_Tests
Feature: To verify the different functionalities present on the Form Authentication page of Herokuapp website

  Scenario Outline: To verify that Form Authentication option is enabled and clickable
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Form Authentication page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User validates the Page title as "Login Page" on Form Authentication link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Form Authentication page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User validates the Page content as "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages." on Form Authentication link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

    Scenario Outline: To verify that user is successfully able to validate the error message for different combinations of username and password
      Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
      When User is on the homePage of the website
      Then Validate that heading of the homepage is "Welcome to the-internet"
      And User clicks on the "Form Authentication" Form Authentication link
      Then User populates the username "<username>" on the Form Authentication link
      Then User populates the password "<password>" on the Form Authentication link
      Then User clicks on the login button on the Form Authentication link
      Then User validates the "<ErrorMessage>"
      And Close the browser session
      Examples:
      |username|password            |ErrorMessage             |browser	  |
      |tomsmith|SuperSecretPassword |Your password is invalid!|Firefox	  |
      |tomSmith|SuperSecretPassword!|Your username is invalid!|Firefox	  |
      |12345678|qwerty              |Your username is invalid!|Firefox	  |
      |        |                    |Your username is invalid!|Firefox	  |
      |tomsmith|SuperSecretPassword |Your password is invalid!|GoogleChrome	  |
      |tomSmith|SuperSecretPassword!|Your username is invalid!|GoogleChrome	  |
      |12345678|qwerty              |Your username is invalid!|GoogleChrome	  |
      |        |                    |Your username is invalid!|GoogleChrome	  |

  Scenario Outline: To verify that user is successfully able to login using the correct credentials on Form Authentication page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User populates "tomsmith" as username on the Form Authentication link
    Then User populates "SuperSecretPassword!" as password on the Form Authentication link
    Then User clicks on the login button on the Form Authentication link
    Then User validates the success message "You logged into a secure area!" on Secure Area Page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Secure Area page title
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User populates "tomsmith" as username on the Form Authentication link
    Then User populates "SuperSecretPassword!" as password on the Form Authentication link
    Then User clicks on the login button on the Form Authentication link
    Then User validates the Page title as "Secure Area" on Secure Area page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to validate the Secure Area page content
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User populates "tomsmith" as username on the Form Authentication link
    Then User populates "SuperSecretPassword!" as password on the Form Authentication link
    Then User clicks on the login button on the Form Authentication link
    Then User validates the Page content as "Welcome to the Secure Area. When you are done click logout below." on Secure Area page
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |

  Scenario Outline: To verify that user is successfully able to logout of the Secure Area page
    Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
    When User is on the homePage of the website
    Then Validate that heading of the homepage is "Welcome to the-internet"
    And User clicks on the "Form Authentication" Form Authentication link
    Then User populates "tomsmith" as username on the Form Authentication link
    Then User populates "SuperSecretPassword!" as password on the Form Authentication link
    Then User clicks on the login button on the Form Authentication link
    Then User clicks on the logout button the Secure Area page
    Then User validates the "You logged out of the secure area!" on Form Authentication link
    And Close the browser session
    Examples:
      | browser      |
      | Firefox      |
      | GoogleChrome |