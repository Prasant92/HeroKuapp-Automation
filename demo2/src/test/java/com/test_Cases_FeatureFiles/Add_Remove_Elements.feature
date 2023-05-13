@AddRemoveElements_Tests
	#Note-: Implemented the cross browser testing functionality for same feature across all possible browsers in Windows

Feature: To verify the different functionalities present on the Add/Remove Elements page of Herokuapp website

	Scenario Outline: To verify that Add/Remove Elements option is enabled and clickable
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "Add/Remove Elements" Add Remove Elements link
		And Close the browser session
		Examples:
			|browser      |
			|Firefox      |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that the Page title of Add/Remove elements option is Add/Remove Elements
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "Add/Remove Elements" Add Remove Elements link
		Then User validates the Page title as "Add/Remove Elements" Add Remove Elements link
		And Close the browser session
		Examples:
			|browser      |
			|Firefox      |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that the Add element option can be used n times on Add/Remove Elements page
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "Add/Remove Elements" Add Remove Elements link
		Then User clicks on Add Element button for "5" times to add element Add Remove Elements link
		And Close the browser session
		Examples:
			|browser      |
			|Firefox      |
			|GoogleChrome |
			|Edge         |

	Scenario Outline: To verify that the delete option can be used n times on Add/Remove Elements page
		Given Start "<browser>" and launch the website "https://the-internet.herokuapp.com/"
		When User is on the homePage of the website
		Then Validate that heading of the homepage is "Welcome to the-internet"
		And User clicks on the "Add/Remove Elements" Add Remove Elements link
		Then User clicks on Add Element button for "5" times to add element Add Remove Elements link
		Then User clicks on delete button for "5" times to delete element Add Remove Elements link
		And Close the browser session
		Examples:
			|browser      |
			|Firefox      |
			|GoogleChrome |
			|Edge         |