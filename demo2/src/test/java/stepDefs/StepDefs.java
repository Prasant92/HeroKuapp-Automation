package stepDefs;

import org.openqa.selenium.WebDriver;

import com.pages.ABTestingPage;
import com.pages.AddRemoveElementsPage;
import com.pages.BasicAuthPage;
import com.pages.BrokenImagesPage;
import com.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

	public static WebDriver driver;
	
	public static HomePage hp=new HomePage(driver);
	
	public ABTestingPage ABtp=new ABTestingPage(driver);
	
	public AddRemoveElementsPage ARep=new AddRemoveElementsPage(driver);
	
	public BasicAuthPage BAp=new BasicAuthPage(driver);
	
	public BrokenImagesPage BIp=new BrokenImagesPage(driver);
	
	
	//************************************************StepDefs for Home Page validation**********************************//
	@Given("Start {string} browser and launch the website {string}")
	public void launchTheWebsite(String browser,String url)
	{
		System.out.println("-----Scenario Execution Started-----");
		hp.startBrowser(browser,url);
	}
	
	@When("^User is on the homePage of the website$")
	public void userIsOnTheHomePageOfTheWebsite()
	{
		hp.titleOfWebsite();
	}
	
	@Then("Validate that heading of the homepage is {string}")
	public void validateThatHeadingOfTheHomepage(String heading)
	{
		hp.assertHomePageHeading(heading);
	}
	
	@Then("Validate the broken links on the homepage")
	public void validateTheBrokenLinksOnTheHomepage()
	{
		hp.checkForBrokenLinks();
	}
	
	@And("^Close the browser session$")
	public void closeTheBrowserSession()
	{
		hp.closeBrowserSession();
	}
	
	//************************************************StepDefs for A/B Testing Page validation**********************************//
	
	@And("User clicks on the {string} AB Testing link")
	public void userClicksOnABTestingLink(String heading)
	{
		ABtp.clickOnLink();
	}
	
	@Then("User validates the Page title as {string} on AB Testing link")
	public void validatePageTitleABTesting(String heading)
	{
		ABtp.titleOfPage(heading);
	}
	
	@Then("User validates the Page content that starts as {string} on AB Testing link")
	public void validatePageContentABTesting(String content)
	{
		ABtp.contentOfPage(content);
	}
	
	//************************************************StepDefs for Add/Remove Elements Page validation**********************************//
	
	@And("User clicks on the {string} Add Remove Elements link")
	public void userClicksOnAddRemoveElementsLink(String heading)
	{
		ARep.clickOnAddRemoveElementsPageLink();
	}
	
	@And("User validates the Page title as {string} Add Remove Elements link")
	public void validatePageTitleAsAddRemoveElements(String heading)
	{
		ARep.titleOfAddRemoveElementsPage(heading);
	}
	
	@Then("User clicks on Add Element button for {string} times to add element Add Remove Elements link")
	public void userClickAddElementButtonAddRemoveElements(String n)
	{
		Integer i=Integer.valueOf(n);
		ARep.clickOnAddElementButtonAddRemoveElementsPage(i);
	}
	
	@Then("User clicks on delete button for {string} times to delete element Add Remove Elements link")
	public void userClickDeleteElementButtonAddRemoveElements(String n)
	{
		Integer i=Integer.valueOf(n);
		ARep.clickOnDeletebuttonAddRemoveElementsPage(i);
	}
	
	//************************************************StepDefs for Basic Auth Page validation**********************************//
	
	@And("User clicks on the {string} Basic Auth link")
	public void userClickOnBasicAuthLink(String s)
	{
		BAp.clickOnBasicAuthPageLink();
	}
	
	@Then("User dismisses the alert by clicking on Cancel button of authentication popup and validates {string}")
	public void userDismissAlertOnBasicAuthLink(String heading)
	{
		BAp.dismissBasicAuthAlertPageLink(heading);
	}
	
	@Then("User accepts the alert by sending the correct credentials")
	public void userAcceptAlertOnBasicAuthLink()
	{
		BAp.acceptBasicAuthAlertPageLink();
	}
	
	@And("User validates the Page title as {string} on Basic Auth link")
	public void validatePageTitleAsBasicAuthLink(String heading)
	{
		BAp.titleOfBasicAuthPage(heading);
	}
	
	@And("User validates the Page content as {string} on Basic Auth link")
	public void validatePageCoontentOnBasicAuthLink(String heading)
	{
		BAp.contentOfBasicAuthPage(heading);
	}
	
	//************************************************StepDefs for Broken Images Page validation**********************************//
	
	@And("User clicks on the {string} Broken Images link")
	public void userClickOnBrokenImagesLink(String s)
	{
		BIp.clickOnBrokenImagesPageLink();
	}
	
	@Then("User validates the Page title as {string} on Broken Images link")
	public void validatePageTitleAsBrokenImagesLink(String heading)
	{
		BIp.assertHomePageHeading(heading);
	}
	
	@Then("User validates every image present on Broken Images page to check if it broken or not")
	public void validateBrokenImagesOnBrokenImagesLink()
	{
		BIp.getAllBrokenImagesOnBrokenImagesPage();
	}
}