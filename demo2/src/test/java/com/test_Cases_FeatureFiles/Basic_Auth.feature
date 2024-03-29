@BasicAuth_Tests
	#Note-: Implemented the cross browser testing functionality for same feature across all possible browsers in Windows

Feature: To verify the different functionalities present on the Basic Auth page of Herokuapp website

	Scenario Outline: To verify that user is successfully able to dismiss the alert without entering the credentials
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		Then User dismisses the alert by clicking on Cancel button of authentication popup and validates "Not authorized"
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that user is successfully able to accept the alert without entering the credentials
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		Then User accepts the alert by sending the correct credentials
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that user is successfully able to validate the page title
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		Then User accepts the alert by sending the correct credentials
		And User validates the Page title as "Basic Auth" on Basic Auth link
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that user is successfully able to validate the page content
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		Then User accepts the alert by sending the correct credentials
		And User validates the Page content as "Congratulations! You must have the proper credentials." on Basic Auth link
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |