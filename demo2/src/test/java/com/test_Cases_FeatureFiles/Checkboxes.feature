@Checkboxes_Tests
Feature: To verify the different functionalities present on the Checkboxes page of Herokuapp website

			Scenario: To verify that Checkboxes option is enabled and clickable
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Checkboxes" Checkboxes link 
    		And Close the browser session
  		
    	Scenario: To verify that user is successfully able to validate the Checkboxes page title
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Checkboxes" Checkboxes link 
    		Then User validates the Page title as "Checkboxes" on Checkboxes link 
    		And Close the browser session
    		
    	Scenario: To verify that user is successfully able to check the unchecked checkboxes if any on Checkboxes page 
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Checkboxes" Checkboxes link 
    		Then User checks the status of checkboxes and checks the checkbox which is unchecked on Checkboxes page  
    		And Close the browser session
    		
    	Scenario: To verify that user is successfully able to uncheck the checked checkboxes if any on Checkboxes page 
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Checkboxes" Checkboxes link 
    		Then User checks the status of checkboxes and unchecks the checkbox which is checked on Checkboxes page  
    		And Close the browser session	