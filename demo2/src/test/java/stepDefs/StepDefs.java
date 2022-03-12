package stepDefs;

import com.pages.*;
import org.openqa.selenium.WebDriver;

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
	
	public CheckboxesPage CBp=new CheckboxesPage(driver);
	
	public ContextMenuPage CMp=new ContextMenuPage(driver);

	public DigestAuthPage DAp=new DigestAuthPage(driver);

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
	
	//************************************************StepDefs for CheckBoxes Page validation**********************************//
	
	@And("User clicks on the {string} Checkboxes link")
	public void userClickOnCheckboxesLink(String s)
	{
		CBp.clickOnCheckboxesPageLink();
	}
	
	@Then("User validates the Page title as {string} on Checkboxes link")
	public void validatePageTitleAsCheckboxesLink(String heading)
	{
		CBp.assertTitleOfCheckboxesPage(heading);
	}
	
	@Then("User checks the status of checkboxes and checks the checkbox which is unchecked on Checkboxes page")
	public void checkTheUncheckedCheckboxesOnCheckboxesPage()
	{
		CBp.checksOnCheckboxOnCheckboxesPage();
	}
	
	@Then("User checks the status of checkboxes and unchecks the checkbox which is checked on Checkboxes page")
	public void uncheckTheCheckedCheckboxesOnCheckboxesPage()
	{
		CBp.unchecksOnCheckboxOnCheckboxesPage();
	}
	
	//************************************************StepDefs for Context Menu Page validation**********************************//
	
	@And("User clicks on the {string} Context Menu link")
	public void userClickOnContextMenuLink(String s)
	{
		CMp.clickOnContextMenuPageLink();
	}
	
	@Then("User validates the Page title as {string} on Context Menu link")
	public void validatePageTitleAsContextMenuLink(String heading)
	{
		CMp.assertHomePageHeading(heading);
	}
	
	@Then("User validates the Page content that starts as {string} on Context Menu page")
	public void validatePageContentOnContextMenuLink(String content)
	{
		CMp.contentOfContextMenuPage(content);
	}
	
	@Then("User right clicks on Context Menu page")
	public void userRightClicksOnContextMenuPage()
	{
		CMp.performContextClickActionOnContextMenuPage();
	}
	
	@And("User receives the alert and accepts it on Context Menu page")
	public void userReceivesAlertAndAcceptsItOnContextMenuPage()
	{
		CMp.acceptContextMenuAlert();
	}

	//************************************************StepDefs for Digest Authentication Page validation**********************************//

	@And("User clicks on the {string} Digest Auth link")
	public void userClickOnDigestAuthLink(String s)
	{
		DAp.clickOnDigestAuthPageLink();
	}

	@Then("User accepts the alert by sending the correct credentials for Digest Auth")
	public void userAcceptAlertOnDigestAuthLink()
	{
		DAp.acceptDigestAuthAlertPageLink();
	}

	@And("User validates the Page title as {string} on Digest Auth link")
	public void validatePageTitleAsDigestAuthLink(String heading)
	{
		DAp.titleOfDigestAuthPage(heading);
	}

	@And("User validates the Page content as {string} on Digest Auth link")
	public void validatePageContentOnDigestAuthLink(String heading)
	{
		DAp.contentOfDigestAuthPage(heading);
	}
}