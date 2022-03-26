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

	public DropdownPage DDp=new DropdownPage(driver);

	public DynamicContentPage DCp=new DynamicContentPage(driver);

	public DynamicControlsPage DCop=new DynamicControlsPage(driver);

	public DynamicLoadingPage DLp=new DynamicLoadingPage(driver);


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

	//************************************************StepDefs for Dropdown Page validation**********************************//

	@And("User clicks on the {string} Dropdown link")
	public void userClickOnDropdownLink(String s)
	{
		DDp.clickOnDropdownPageLink();
	}

	@Then("User validates the Page title as {string} on Dropdown link")
	public void validatePageTitleAsDropdownLink(String heading)
	{
		DDp.titleOfDropdownPage(heading);
	}

	@Then("User performs the click operation on the Dropdown on Dropdown page")
	public void performClickOperationOnDropdown()
	{
		DDp.clickOnDropdown();
	}

	@And("User selects the first option from the Dropdown on Dropdown page")
	public void selectFirstOptionFromDropdownOnDropdownPage()
	{
		DDp.selectFirstOptionFromDropdown();
	}

	@And("User selects the second option from the Dropdown on Dropdown page")
	public void selectSecondOptionFromDropdownOnDropdownPage()
	{
		DDp.selectSecondOptionFromDropdown();
	}

	//************************************************StepDefs for Dynamic Content Page validation**********************************//

	@And("User clicks on the {string} Dynamic Content link")
	public void userClickOnDynamicContentLink(String s)
	{
		DCp.clickOnDynamicContentLink();
	}

	@Then("User validates the Page title as {string} on Dynamic Content link")
	public void validatePageTitleAsDynamicContentLink(String heading)
	{
		DCp.titleOfDynamicContentPage(heading);
	}

	@Then("User validates the Page content as {string} on Dynamic Content link")
	public void validatePageContentAsDynamicContentLink(String content)
	{
		DCp.contentOfDynamicContentPage(content);
	}

	@Then("^User clicks on click here link \"(.*)\" times and capturing the image and its description everytime$")
	public void validatePageDetailsByClickingNTimesOnDynamicContentLink(String s)
	{
		int i=Integer.parseInt(s);
		DCp.clickToChangePageContentOfDynamicContentPage(i);
	}

	//************************************************StepDefs for Dynamic Controls Page validation**********************************//

	@And("User clicks on the {string} Dynamic Controls link")
	public void userClickOnDynamicControlsLink(String s)
	{
		DCop.clickOnDynamicControlsLink();
	}

	@Then("User validates the Page title as {string} on Dynamic Controls link")
	public void validatePageTitleAsDynamicControlsLink(String heading)
	{
		DCop.titleOfDynamicControlsPage(heading);
	}

	@Then("User validates the Page content as {string} on Dynamic Controls link")
	public void validatePageContentAsDynamicControlsLink(String content)
	{
		DCop.contentOfDynamicControlsPage(content);
	}

	@And("User clicks on Remove button without ticking the checkbox")
	public void clickRemoveButtonWithoutTickingCheckbox()
	{
		DCop.clickingRemoveOrAddButtonOnDynamicControlsPage();
	}

	@Then("User validates the {string} message")
	public void validateMessageOnClickingAddOrRemoveButton(String message)
	{
		DCop.validateMessageAfterClickingRemoveOrAddButtonOnDynamicControlsPage(message);
	}

	@And("User ticks on the Checkbox")
	public void userTicksOnCheckbox()
	{
		DCop.clickingCheckBoxOnDynamicControlsPage();
	}

	@And("User clicks on Remove button after ticking the checkbox")
	public void userClicksRemoveButtonAfterTickingCheckbox()
	{
		DCop.clickingRemoveOrAddButtonOnDynamicControlsPage();
	}

	@And("User clicks on Add button")
	public void userClicksAddButton()
	{
		DCop.clickingRemoveOrAddButtonOnDynamicControlsPage();
	}

	@And("User clicks on Enable button")
	public void userClicksEnableButton()
	{
		DCop.clickingEnableOrDisableButtonOnDynamicControlsPage();
	}

	@And("User verifies the status as {string}")
	public void userValidatesStatusAfterClickingEnableOrDisableButtons(String message)
	{
		DCop.validateMessageAfterClickingEnableOrDisableButtonOnDynamicControlsPage(message);
	}

	@Then("User populates desired text {string} into textbox")
	public void userPopulatesContentIntoTextBox(String text)
	{
		DCop.enteringTextIntoInputBoxOnDynamicControlsPage(text);
	}

	@And("User clicks on the Disable button")
	public void userClicksDisableButton()
	{
		DCop.clickingEnableOrDisableButtonOnDynamicControlsPage();
	}

	@Then("^User performs the removal and addition of checkbox multiple times by ticking the checkbox \"(.*)\" times$")
	public void performRemovalAndAdditionOfCheckboxMultipleTimes(String s)
	{
		int i=Integer.parseInt(s);
		for(int j=1;j<=i+1;j++)
		{
			DCop.clickingCheckBoxOnDynamicControlsPage();
			DCop.clickingRemoveOrAddButtonOnDynamicControlsPage();
			DCop.clickingRemoveOrAddButtonOnDynamicControlsPage();
		}
	}

	//************************************************StepDefs for Dynamic Loading Page validation**********************************//

	@And("User clicks on the {string} Dynamic Loading link")
	public void userClickOnDynamicLoadingLink(String s)
	{
		DLp.clickOnDynamicLoadingLink();
	}

	@Then("User validates the Page title as {string} on Dynamic Loading link")
	public void validatePageTitleAsDynamicLoadingLink(String heading)
	{
		DLp.titleOfDynamicLoadingPage(heading);
	}

	@Then("User validates the Page content as {string} on Dynamic Loading link")
	public void validatePageContentAsDynamicLoadingLink(String content)
	{
		DLp.contentOfDynamicLoadingPage(content);
	}

	@Then ("User clicks on the {string} Example 1 link on Dynamically Loaded Page Elements page")
	public void userClickOnExample1LinkOnOnDynamicLoadingPage(String s)
	{
		DLp.clickOnExample1LinkOfDynamicLoadingPage();
	}

	@Then("User validates the Page title as {string} on Example 1 of Dynamic Loading link")
	public void validatePageTitleOnExample1OnDynamicLoadingPage(String heading)
	{
		DLp.titleOfExample1PageOfDynamicLoadingPage(heading);
	}

	@Then("User validates the Page content as {string} on Example 1 of Dynamic Loading link")
	public void validatePageContentOnExample1OnDynamicLoadingPage(String content)
	{
		DLp.contentOfExample1PageOfDynamicLoadingPage(content);
	}

	@Then ("User clicks on the {string} Example 2 link on Dynamically Loaded Page Elements page")
	public void userClickOnExample2LinkOnOnDynamicLoadingPage(String s)
	{
		DLp.clickOnExample2LinkOfDynamicLoadingPage();
	}

	@Then("User validates the Page title as {string} on Example 2 of Dynamic Loading link")
	public void validatePageTitleOnExample2OnDynamicLoadingPage(String heading)
	{
		DLp.titleOfExample2PageOfDynamicLoadingPage(heading);
	}

	@Then("User validates the Page content as {string} on Example 2 of Dynamic Loading link")
	public void validatePageContentOnExample2OnDynamicLoadingPage(String content)
	{
		DLp.contentOfExample2PageOfDynamicLoadingPage(content);
	}

	@Then("User clicks Start button and validates the text as {string} on Example 1 of Dynamic Loading link")
	public void clickStartButtonAndValidateTextOnExample1OnDynamicLoadingPage(String text)
	{
		DLp.clickOnStartButtonOnExample1AndExample2PagesOfDynamicLoadingPage();
		DLp.validateTextOnExample1PagesAfterClickingStartButton(text);
	}

	@Then("User clicks Start button and validates the text as {string} on Example 2 of Dynamic Loading link")
	public void clickStartButtonAndValidateTextOnExample2OnDynamicLoadingPage(String text)
	{
		DLp.clickOnStartButtonOnExample1AndExample2PagesOfDynamicLoadingPage();
		DLp.validateTextOnExample2PagesAfterClickingStartButton(text);
	}
}