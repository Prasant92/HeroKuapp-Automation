@ContextMenu_Tests
Feature: To verify the different functionalities present on the Context Menu page of Herokuapp website

			Scenario: To verify that Context Menu option is enabled and clickable
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Context Menu" Context Menu link 
    		And Close the browser session
  		
    	Scenario: To verify that user is successfully able to validate the Context Menu page title
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Context Menu" Context Menu link 
    		Then User validates the Page title as "Context Menu" on Context Menu link 
    		And Close the browser session
    		
    	Scenario: To verify the content of the Context Menu page 
			  Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Context Menu" Context Menu link
    		Then User validates the Page content that starts as "Context menu items are custom additions that appear in the right-click menu." on Context Menu page 
    		And Close the browser session	
    	
    	Scenario: To verify the context click functionality on the Context Menu page 
			  Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Context Menu" Context Menu link
    		Then User right clicks on Context Menu page 
    		And User receives the alert and accepts it on Context Menu page
    		And Close the browser session	