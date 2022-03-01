@BrokenImages_Tests
Feature: To verify the different functionalities present on the Broken Images page of Herokuapp website

			Scenario: To verify that Broken Images option is enabled and clickable
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Broken Images" Broken Images link 
    		And Close the browser session
  		
    	Scenario: To verify that user is successfully able to validate the Broken Images page title
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Broken Images" Broken Images link 
    		Then User validates the Page title as "Broken Images" on Broken Images link 
    		And Close the browser session
    		
    	Scenario: To verify that user is successfully able to find and validate the number of broken images on Broken Images page
				Given Start "Firefox" browser and launch the website "https://the-internet.herokuapp.com/" 
    		When User is on the homePage of the website
    		Then Validate that heading of the homepage is "Welcome to the-internet"
    		And User clicks on the "Broken Images" Broken Images link
    		Then User validates every image present on Broken Images page to check if it broken or not
    		And Close the browser session