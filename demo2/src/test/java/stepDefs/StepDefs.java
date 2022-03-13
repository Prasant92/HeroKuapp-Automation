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

	public DisappearingElementsPage DEp=new DisappearingElementsPage(driver);

	public DragAndDropPage DADp=new DragAndDropPage(driver);

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

	//************************************************StepDefs for Disappearing Elements Page validation**********************************//

	@And("User clicks on the {string} Disappearing Elements link")
	public void userClickOnDisappearingElementsLink(String s)
	{
		DEp.clickOnDisappearingElementsPageLink();
	}

	@And("User validates the Page title as {string} on Disappearing Elements link")
	public void validatePageTitleAsDisappearingElementsLink(String heading)
	{
		DEp.titleOfDisappearingElementsPage(heading);
	}

	@And("User validates the Page content as {string} on Disappearing Elements link")
	public void validatePageContentOnDisappearingElementsLink(String heading)
	{
		DEp.contentOfDisappearingElementsPage(heading);
	}

	@Then("User clicks on the About link on the Disappearing Elements link page then verifies the Page content as {string} and navigates back to the Disappearing Elements link page")
	public void validateAboutLinkContentAndNavigateBackToDisappearingElementsLink(String heading)
	{
		DEp.clickOnAboutLinkOfDisappearingElementsPage(heading);
	}

	@Then("User clicks on the Contact Us link on the Disappearing Elements link page and verifies the Page content as {string} and navigates back to the Disappearing Elements link page")
	public void validateContactUsLinkContentAndNavigateBackToDisappearingElementsLink(String heading)
	{
		DEp.clickOnContactUSLinkOfDisappearingElementsPage(heading);
	}

	@Then("User clicks on the Portfolio link on the Disappearing Elements link page and verifies the Page content as {string} and navigates back to the Disappearing Elements link page")
	public void validatePortFolioLinkContentAndNavigateBackToDisappearingElementsLink(String heading)
	{
		DEp.clickOnPortfolioLinkOfDisappearingElementsPage(heading);
	}

	@Then("User clicks on the Home link on the Disappearing Elements link page and verifies the Page content {string} and navigates back to the Disappearing Elements link page")
	public void validateHomeLinkContentAndNavigateBackToDisappearingElementsLink(String heading)
	{
		DEp.clickOnHomeLinkOfDisappearingElementsPage(heading);
	}

	@Then("Validate the broken links on the Disappearing Elements page")
	public void validateTheBrokenLinksOnTheDisappearingElements()
	{
		hp.checkForBrokenLinks();
	}

	//************************************************StepDefs for Drag And Drop Page validation**********************************//

	@And("User clicks on the {string} Drag And Drop link")
	public void userClickOnDragAndDropLink(String s)
	{
		DADp.clickOnDragAndDropPageLink();
	}

	@Then("User validates the Page title as {string} on Drag And Drop link")
	public void validatePageTitleAsDragAndDropLink(String heading)
	{
		DADp.titleOfDragAndDropPage(heading);
	}

	@Then("User performs the Drag and Drop operation from source A box to target B box on Drag And Drop page and validates that Target is {string}")
	public void performDragAndDropFromAtoB(String expectedTarget)
	{
		DADp.performDragAndDropFromAtoB(expectedTarget);
	}

	@Then("User performs the Drag and Drop operation from source B box to target A box on Drag And Drop page and validates that Target is {string}")
	public void performDragAndDropFromBtoA(String expectedTarget)
	{
		DADp.performDragAndDropFromBtoA(expectedTarget);
	}
}