@ABTesting_Tests
	#Note-: Implemented the cross browser testing functionality for same feature across all possible browsers in Windows

Feature: To verify the different functionalities present on the A/B Testing page of Herokuapp website

	Scenario Outline: To verify that A/B Testing option is enabled and clickable
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "A/B Testing" AB Testing link
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that the Page title of A/B testing option is A/B Test Variation1
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "A/B Testing" AB Testing link
		Then User validates the Page title as "A/B Test Control" on AB Testing link
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify the content of the A/B Test Variation page
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "A/B Testing" AB Testing link
		Then User validates the Page content that starts as "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)." on AB Testing link
		And Close the browser session
		Examples:
			|browser	  |
			|Firefox	  |
			|GoogleChrome |
			|Edge         |