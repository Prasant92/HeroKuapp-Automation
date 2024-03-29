@HomePage_Tests
Feature: To verify the different functionalities present on the HomePage of Herokuapp website

	Scenario Outline: To verify the heading title of the herokuapp website
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And Close the browser session
		Examples:
			| browser      |
			| Firefox      |
			| GoogleChrome |
			| Edge         |

	Scenario Outline: To validate whether there any broken links on the herokuapp website
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And Validate the broken links on the homepage
		And Close the browser session
		Examples:
			| browser      |
			| Firefox      |
			| GoogleChrome |
			| Edge         |