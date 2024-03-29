package stepDefs;

import com.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.awt.*;

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

	public EntryAdPage EAp=new EntryAdPage(driver);

	public ExitIntentPage EIp=new ExitIntentPage(driver);

	public FileDownloadPage FDp=new FileDownloadPage(driver);

	public FileUploadPage FUp=new FileUploadPage(driver);

	public FloatingMenuPage FMp=new FloatingMenuPage(driver);

	public ForgotPasswordPage FPp=new ForgotPasswordPage(driver);

	public FormAuthenticationPage FAp=new FormAuthenticationPage(driver);

	public FramesPage Fp=new FramesPage(driver);

	public GeolocationPage GLp=new GeolocationPage(driver);

	public HorizontalSliderPage HSp=new HorizontalSliderPage(driver);

	public HoversPage Hp=new HoversPage(driver);

	public InfiniteScrollPage ISp=new InfiniteScrollPage(driver);

	public InputsPage Ip=new InputsPage(driver);

	public JQueryUIMenusPage JQUMp=new JQueryUIMenusPage(driver);

	public JavaScriptAlertsPage JSAp=new JavaScriptAlertsPage(driver);

	public JavaScriptOnloadEventError JOEEp=new JavaScriptOnloadEventError(driver);

	public KeyPressesPage KPp=new KeyPressesPage(driver);

	public LargeAndDeepDOMPage LADDp=new LargeAndDeepDOMPage(driver);

	public MultipleWindowsPage MWp=new MultipleWindowsPage(driver);

	public NestedFramesPage NFp=new NestedFramesPage(driver);

	public NotificationMessagesPage NMp=new NotificationMessagesPage(driver);

	public RedirectLinkPage RLp=new RedirectLinkPage(driver);

	Scenario scenario;

	//************************************************StepDefs for Home Page validation**********************************//

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Start {string} and launch the website {string}")
	public void launchTheWebsite(String browser, String url)
	{
		String mName = scenario.getName();
		System.out.println("-----Scenario Execution Started-----");
		hp.startBrowser(browser,url,mName);
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
		int i= Integer.parseInt(n);
		ARep.clickOnAddElementButtonAddRemoveElementsPage(i);
	}
	
	@Then("User clicks on delete button for {string} times to delete element Add Remove Elements link")
	public void userClickDeleteElementButtonAddRemoveElements(String n)
	{
		int i= Integer.parseInt(n);
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
		BIp.titleOfBrokenImagesPage(heading);
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
		CMp.titleOfContextMenuPage(heading);
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

	//************************************************StepDefs for Entry Ad Page validation**********************************//

	@And("User clicks on the {string} Entry Ad link")
	public void userClickOnEntryAdLink(String s)
	{
		EAp.clickOnEntryAdLink();
	}

	@Then("User validates the Page title as {string} on Entry Ad link")
	public void validatePageTitleAsEntryAdLink(String heading)
	{
		EAp.titleOfEntryAdPage(heading);
	}

	@Then("User validates the Page content as {string} on Entry Ad link")
	public void validatePageContentAsEntryAdLink(String content)
	{
		EAp.contentOfEntryAdPage(content);
	}

	@Then("User clicks on Close link on Modal Window on Entry Ad link")
	public void clickCloseLinkOnModalWindowOfEntryAdLink()
	{
		EAp.clickOnCloseLinkOnModalWindow();
	}

	@Then("User validates the Page title as {string} on Modal Window")
	public void validatePageTitleOnModalWindowOfEntryAdLink(String heading)
	{
		EAp.titleOfModalWindowOnEntryAdPage(heading);
	}

	@Then("User validates the Page content as {string} on Modal Window")
	public void validatePageContentOnModalWindowOfEntryAdLink(String content)
	{
		EAp.contentOfModalWindowOnEntryAdPage(content);
	}

	@Then("User clicks on {string} link on on Entry Ad link")
	public void userClickOnClickHereOnEntryAdLink(String s)
	{
		EAp.clickOnClickHereLinkOnEntryAdPage();
	}

	//************************************************StepDefs for Exit intent Page validation**********************************//

	@And("User clicks on the {string} Exit Intent link")
	public void userClickOnExitIntentLink(String s)
	{
		EIp.clickOnExitIntentLink();
	}

	@Then("User validates the Page title as {string} on Exit Intent link")
	public void validatePageTitleAsExitIntentLink(String heading)
	{
		EIp.titleOfExitIntentPage(heading);
	}

	@Then("User validates the Page content as {string} on Exit Intent link")
	public void validatePageContentAsExitIntentLink(String content)
	{
		EIp.contentOfExitIntentPage(content);
	}

	//************************************************StepDefs for File Download Page validation**********************************//

	@And("User clicks on the {string} File Download link")
	public void userClickOnFileDownloadLink(String s)
	{
		FDp.clickOnFileDownloadLink();
	}

	@Then("User validates the Page title as {string} on File Download link")
	public void validatePageTitleAsFileDownloadLink(String heading)
	{
		FDp.titleOfFileDownloadPage(heading);
	}

	@Then("^User clicks on the \"([^\"]*)\" on File Download link$")
	public void userClicksOnDownloadLink(String downloadLink)
	{
		FDp.downloadSelectedFile(downloadLink);
	}

	@Then("^User verifies the \"([^\"]*)\" in the filepath")
	public void userVerifiesDownloadFileAtDownloadedLocation(String Filename)
	{
		FDp.verifyDownloadedFile(Filename);
	}

	@Then("Validate the broken links on the File Download Page")
	public void validateTheBrokenLinksOnTheFileDownloadPage()
	{
		FDp.checkForBrokenLinks();
	}

	//************************************************StepDefs for File Upload Page validation**********************************//

	@And("User clicks on the {string} File Upload link")
	public void userClickOnFileUploadLink(String s)
	{
		FUp.clickOnFileUploadLink();
	}

	@Then("User validates the Page title as {string} on File Upload link")
	public void validatePageTitleAsFileUploadLink(String heading)
	{
		FUp.titleOfFileUploadPage(heading);
	}

	@Then("User validates the Page content as {string} on File Upload link")
	public void validatePageContentAsFileUploadLink(String content)
	{
		FUp.contentOfFileUploadPage(content);
	}

	@Then("User uploads the required files on File Upload page by clicking on Choose file button")
	public void uploadFilesUsingChooseFileButtonOnFileUploadPage()
	{
		FUp.uploadFileOnFileUploadPageLink();
	}

	@Then("User uploads the required files on File Upload page by using drag and drop functionality")
	public void uploadFilesUsingDragAndDropFunctionalityButtonOnFileUploadPage()
	{
		FUp.uploadFileUsingDragAndDropFeature();
	}

	//************************************************StepDefs for Floating Menu Page validation**********************************//

	@And("User clicks on the {string} Floating Menu link")
	public void userClickOnFloatingMenuLink(String s)
	{
		FMp.clickOnFloatingMenuLink();
	}

	@Then("User validates the Page title as {string} on Floating Menu link")
	public void validatePageTitleAsFloatingMenuLink(String heading)
	{
		FMp.titleOfFloatingMenuPage(heading);
	}

	@Then("User scrolls down to the bottom of the Floating Menu page")
	public void scrollToBottomOfFloatingMenuLink()  {
		FMp.scrollFloatingMenuPageToBottom();
	}

	@Then("User scrolls up to the top from bottom of the Floating Menu page")
	public void scrollToTopFromBottomOfFloatingMenuLink() throws AWTException {
		FMp.scrollFloatingMenuFromBottomToTop();
	}

	@Then("User clicks and asserts the Home menu URL as {string} on Floating Menu page")
	public void clickAndAssertHomeMenuURLAOnFloatingMenuLink(String home)
	{
		FMp.clickAndAssertHomeMenuButton(home);
	}

	@Then("User clicks and asserts the News menu URL as {string} on Floating Menu page")
	public void clickAndAssertNewsMenuURLAOnFloatingMenuLink(String news)
	{
		FMp.clickAndAssertNewsMenuButton(news);
	}

	@Then("User clicks and asserts the Contact menu URL as {string} on Floating Menu page")
	public void clickAndAssertContactMenuURLAOnFloatingMenuLink(String contact)
	{
		FMp.clickAndAssertContactMenuButton(contact);
	}

	@Then("User clicks and asserts the About menu URL as {string} on Floating Menu page")
	public void clickAndAssertAboutMenuURLAOnFloatingMenuLink(String about)
	{
		FMp.clickAndAssertAboutMenuButton(about);
	}

	//************************************************StepDefs for Floating Menu Page validation**********************************//

	@And("User clicks on the {string} Forgot Password link")
	public void userClickOnForgotPasswordLink(String s)
	{
		FPp.clickOnForgotPasswordLink();
	}

	@Then("User validates the Page title as {string} on Forgot Password link")
	public void validatePageTitleAsForgotPasswordLink(String heading)
	{
		FPp.titleOfForgotPasswordPage(heading);
	}

	@Then("^User populates different sets of \"([^\"]*)\"$")
	public void populateDifferentSetsOfEmailIDOnForgotPasswordPage(String emailID)
	{
		FPp.populateEmailIDOnForgotPasswordPage(emailID);
	}

	@Then("User clicks on the retrieve password button")
	public void clickRetrievePasswordOnForgotPasswordLink()
	{
		FPp.clickRetrievePasswordOnForgotPasswordPage();
	}

	//************************************************StepDefs for Form Authentication Page validation**********************************//

	@And("User clicks on the {string} Form Authentication link")
	public void userClickOnFormAuthenticationLink(String s)
	{
		FAp.clickOnFormAuthenticationLink();
	}

	@Then("User validates the Page title as {string} on Form Authentication link")
	public void validatePageTitleAsFormAuthenticationLink(String heading)
	{
		FAp.titleOfFormAuthenticationPage(heading);
	}

	@Then("User validates the Page content as {string} on Form Authentication link")
	public void validatePageContentAsFormAuthenticationLink(String content)
	{
		FAp.contentOfFormAuthenticationPage(content);
	}

	@Then("User populates the username {string} on the Form Authentication link")
	public void userPopulatesUsernameOnFormAuthenticationLink(String username)
	{
		FAp.populateUsernameOnFormAuthenticationPage(username);
	}

	@Then("User populates the password {string} on the Form Authentication link")
	public void userPopulatesPasswordOnFormAuthenticationLink(String password)
	{
		FAp.populatePasswordOnFormAuthenticationPage(password);
	}

	@Then("User clicks on the login button on the Form Authentication link")
	public void userClicksLoginButtonOnFormAuthenticationLink()
	{
		FAp.clickLoginOnFormAuthenticationPage();
	}

	@Then("User validates the {string}")
	public void userValidatesErrorMessageOnFormAuthenticationLink(String emsg)
	{
		FAp.retrieveAndValidateErrorMessage(emsg);
	}

	@Then("User validates the success message {string} on Secure Area Page")
	public void userValidatesSuccessMessageOnFormAuthenticationLink(String smsg)
	{
		FAp.retrieveAndValidateSuccessMessage(smsg);
	}

	@Then("User populates {string} as username on the Form Authentication link")
	public void usernameOnFormAuthenticationLink(String username)
	{
		FAp.populateUsernameOnFormAuthenticationPage(username);
	}

	@Then("User populates {string} as password on the Form Authentication link")
	public void passwordOnFormAuthenticationLink(String password)
	{
		FAp.populatePasswordOnFormAuthenticationPage(password);
	}

	@Then("User validates the Page title as {string} on Secure Area page")
	public void validatePageTitleOnSecureAreaPageLink(String title)
	{
		FAp.titleOfSecureAreaPage(title);
	}

	@Then("User validates the Page content as {string} on Secure Area page")
	public void validatePageContentOnSecureAreaPageLink(String content)
	{
		FAp.contentOfSecureAreaPage(content);
	}

	@Then("User clicks on the logout button the Secure Area page")
	public void clickLogoutButtonOnSecureAreaPageLink()
	{
		FAp.clickLogOutOnSecureAreaPage();
	}

	@Then("User validates the {string} on Form Authentication link")
	public void userValidatesSuccessMessageOnSecureAreaPage(String msg)
	{
		FAp.retrieveAndValidateSuccessMessageOnLoginPage(msg);
	}

	//************************************************StepDefs for Frames Page validation**********************************//

	@And("User clicks on the {string} Frames link")
	public void userClickOnFramesLink(String s)
	{
		Fp.clickOnFramesLink();
	}

	@Then("User validates the Page title as {string} on Frames link")
	public void validatePageTitleAsFramesLink(String heading)
	{
		Fp.titleOfFramesPage(heading);
	}

	@Then("User clicks on the {string} link")
	public void clickOnFramesOptionLinks(String option)
	{
		Fp.clickOnFramesOption(option);
	}

	@Then("User switches to {string} frame and retrieves the {string} as the text in the frame")
	public void switchToFrameAndRetrieveTextOnNestedFramesOptionLink(String frame,String text)
	{
		Fp.switchToFrameAndGetText(frame,text);
	}

	@Then("User validates the Page content as {string}")
	public void validatePageContentAsiFramesLink(String content)
	{
		Fp.contentOfiFramePage(content);
	}

	@Then("User switches to iframe and retrieves the {string} as the text in the frame")
	public void switchToiFrameAndRetrieveTextOniFramesOptionLink(String text)
	{
		Fp.switchToiFrameAndGetText(text);
	}

	//************************************************StepDefs for Geolocation Page validation**********************************//

	@And("User clicks on the {string} Geolocation link")
	public void userClickOnGeolocationLink(String s)
	{
		GLp.clickOnGeolocationLink();
	}

	@Then("User validates the Page title as {string} on Geolocation link")
	public void validatePageTitleAsGeolocationLink(String heading)
	{
		GLp.titleOfGeolocationPage(heading);
	}

	@Then("User validates the Page content as {string} on Geolocation link")
	public void validatePageContentAsGeolocationLink(String content)
	{
		GLp.contentOfGeolocationPage(content);
	}

	//************************************************StepDefs for Horizontal Slider Page validation**********************************//

	@And("User clicks on the {string} Horizontal Slider link")
	public void userClickOnHorizontalSliderLink(String s)
	{
		HSp.clickOnHorizontalSliderLink();
	}

	@Then("User validates the Page title as {string} on Horizontal Slider link")
	public void validatePageTitleAsHorizontalSliderLink(String heading)
	{
		HSp.titleOfHorizontalSliderPage(heading);
	}

	@Then("User validates the Page content as {string} on Horizontal Slider link")
	public void validatePageContentAsHorizontalSliderLink(String content)
	{
		HSp.contentOfHorizontalSliderPage(content);
	}

	@Then("User moves the slider from left to right by {string} times on Horizontal slider page")
	public void moveSliderFromLeftToRight(String maxVal)
	{
		double d=Double.parseDouble(maxVal);
		HSp.moveSliderHorizontallyFromLeftToRight(d);
	}

	@Then("User moves the slider from right to left by {string} times on Horizontal slider page")
	public void moveSliderFromRightToLeft(String maxVal)
	{
		double dmax=Double.parseDouble(maxVal);
		HSp.moveSliderHorizontallyFromRightToLeft(dmax);
	}

	//************************************************StepDefs for Hovers Page validation**********************************//

	@And("User clicks on the {string} Hovers link")
	public void userClickOnHoversLink(String s)
	{
		Hp.clickOnHoversLink();
	}

	@Then("User validates the Page title as {string} on Hovers link")
	public void validatePageTitleAsHoversLink(String heading)
	{
		Hp.titleOfHoversPage(heading);
	}

	@Then("User validates the Page content as {string} on Hovers link")
	public void validatePageContentAsHoversLink(String content)
	{
		Hp.contentOfHoversPage(content);
	}

	@Then("User hovers the mouse on the image figure and retrieves the name of the image number {string}")
	public void hoverOnImageAndRetrieveImageName(String imgNum)
	{
		Hp.hoverOverImageAndRetrieveName(imgNum);
	}

	@Then("User hovers the mouse on the image figure and clicks on the view profile of the image number {string} and validates the profile content of the image as {string}")
	public void hoverOnImageClickOnViewProfileAndValidateProfileContent(String imgNum,String content)
	{
		Hp.clickViewProfileAndValidateSourceText(imgNum,content);
	}

	//************************************************StepDefs for Infinite Scroll Page validation**********************************//

	@And("User clicks on the {string} Infinite Scroll link")
	public void userClickOnInfiniteScrollLink(String s)
	{
		ISp.clickOnInfiniteScrollLink();
	}

	@Then("User validates the Page title as {string} on Infinite Scroll link")
	public void validatePageTitleAsInfiniteScrollLink(String heading)
	{
		ISp.titleOfInfiniteScrollPage(heading);
	}

	@Then("User scrolls down to the bottom of the Infinite Scroll page by {string} times")
	public void validateInfiniteScrollingToBottomOfTheWebPage(String s)
	{
		ISp.infiniteScrollToBottomPage(s);
	}

	//************************************************StepDefs for Inputs Page validation**********************************//

	@And("User clicks on the {string} Inputs link")
	public void userClickOnInputsLink(String s)
	{
		Ip.clickOnInputsLink();
	}

	@Then("User validates the Page title as {string} on Inputs link")
	public void validatePageTitleAsInputsLink(String heading)
	{
		Ip.titleOfInputsPage(heading);
	}

	@Then("User validates the Page content as {string} on Inputs link")
	public void validatePageContentAsInputsLink(String content)
	{
		Ip.contentOfInputsPage(content);
	}

	@Then("User populates the required value {string} and then increments it")
	public void populateAndIncrementValueOnInputsLink(String value)
	{
		Ip.incrementingTheValue(value);
	}

	@Then("User populates the required value {string} and then decrements it")
	public void populateAndDecrementValueOnInputsLink(String value)
	{
		Ip.decrementingTheValue(value);
	}

	//************************************************StepDefs for JQuery UI Menus Page validation**********************************//

	@And("User clicks on the {string} JQuery UI Menus link")
	public void userClickOnJQueryUIMenusLink(String s)
	{
		JQUMp.clickOnJQueryUIMenusLink();
	}

	@Then("User validates the Page title as {string} on JQuery UI Menus link")
	public void validatePageTitleAsJQueryUIMenusLink(String heading)
	{
		JQUMp.titleOfJQueryUIMenusPage(heading);
	}

	@Then("User validates the Page content as {string} on JQuery UI Menus link")
	public void validatePageContentAsJQueryUIMenusLink(String content)
	{
		JQUMp.contentOfJQueryUIMenusPage(content);
	}

	@Then("User hovers over the Enabled option and clicks on back to JQuery UI page and validates page title as {string}")
	public void validatePageTitleAsJQueryUILink(String heading)
	{
		JQUMp.titleOfHoverOverEnabledOptionAndClickOnBackToJQueryUIOption(heading);
	}

	@Then("User hovers over the Enabled option and clicks on back to JQuery UI page and validates page content as {string}")
	public void validatePageContentAsJQueryUILink(String content)
	{
		JQUMp.contentOfHoverOverEnabledOptionAndClickOnBackToJQueryUIOption(content);
	}

	@Then("User hovers over the Enabled option and clicks on back to JQuery UI page and redirects back to the menu page with title as {string}")
	public void validateUserRedirectsFromMenuToJQueryUIPageAndBack(String heading)
	{
		JQUMp.validateThatUserIsRedirectedBackToMenuPage(heading);
	}

	@Then("User hovers over the Enabled option and hovers again on the Downloads option to download the document in {string}")
	public void downloadInRequiredFormatOnJQueryUIMenuPage(String format)
	{
		JQUMp.downloadInDifferentFormat(format);
	}

	//************************************************StepDefs for JavaScript Alerts Page validation**********************************//

	@And("User clicks on the {string} JavaScript Alerts link")
	public void userClickOnJavaScriptAlertsLink(String s)
	{
		JSAp.clickOnJavaScriptAlertsLink();
	}

	@Then("User validates the Page title as {string} on JavaScript Alerts link")
	public void validatePageTitleAsJavaScriptAlertsLink(String heading)
	{
		JSAp.titleOfJavaScriptAlertsPage(heading);
	}

	@Then("User validates the Page content as {string} on JavaScript Alerts link")
	public void validatePageContentAsJavaScriptAlertsLink(String content)
	{
		JSAp.contentOfJavaScriptAlertsPage(content);
	}

	@Then("User accepts the JS alert by clicking on JSAlert button")
	public void acceptJSAlertOnJavaScriptAlertsLink()
	{
		JSAp.acceptTheAlertAndValidateResultOnJSAlertButton();
	}

	@Then("User accepts the JS alert by clicking on JSConfirm button")
	public void acceptJSConfirmOnJavaScriptAlertsLink()
	{
		JSAp.acceptTheAlertAndValidateResultOnJSConfirmButton();
	}

	@Then("User dismisses the JS alert by clicking on JSConfirm button")
	public void dismissJSConfirmOnJavaScriptAlertsLink()
	{
		JSAp.cancelTheAlertAndValidateResultOnJSAlertButton();
	}

	@Then("User enters the text in prompt alert and accepts the JS alert by clicking on JSPrompt button")
	public void acceptJSPromptBySendingTextToAlertBoxOnJavaScriptAlertsLink()
	{
		JSAp.acceptTheAlertAndValidateResultOnJSPromptButton();
	}

	@Then("User enters the text in prompt alert and dismisses the JS alert by clicking on JSPrompt button")
	public void dismissJSPromptBySendingTextToAlertBoxOnJavaScriptAlertsLink()
	{
		JSAp.cancelTheAlertAndValidateResultOnJSPromptButton();
	}

	//************************************************StepDefs for JavaScript onload event error Page validation**********************************//

	@And("User clicks on the {string} JavaScript onload event error link")
	public void userClickOnJavaScriptOnloadEventErrorLink(String s)
	{
		JOEEp.clickOnJavaScriptOnloadEventErrorLink();
	}

	@Then("User validates the Page content as {string} on JavaScript onload event error link")
	public void validatePageContentAsJavaScriptOnloadEventErrorLink(String content)
	{
		JOEEp.contentOfJavaScriptOnloadEventErrorPage(content);
	}

	//************************************************StepDefs for Key Presses Page validation**********************************//

	@And("User clicks on the {string} Key Presses link")
	public void userClickOnKeyPressesLink(String s)
	{
		KPp.clickOnKeyPressesLink();
	}

	@Then("User validates the Page title as {string} on Key Presses link")
	public void validatePageTitleAsKeyPressesLink(String heading)
	{
		KPp.titleOfKeyPressesPage(heading);
	}

	@Then("User validates the Page content as {string} on Key Presses link")
	public void validatePageContentAsKeyPressesLink(String content)
	{
		KPp.contentOfKeyPressesPage(content);
	}

	@Then("User populates the {string} into the textbox and verifies them on the Key pressed page")
	public void populateAndVerifyTextOnKeyPressesLink(String content)
	{
		KPp.populateAndVerifyEnteredTextIntoTextBox(content);
	}

	//************************************************StepDefs for Large And Deep DOM Page validation**********************************//

	@And("User clicks on the {string} Large And Deep DOM link")
	public void userClicksOnLargeAndDeepDOMLink(String s)
	{
		LADDp.clickOnLargeAndDeepDOMLink();
	}

	@Then("User validates the Page title as {string} on Large And Deep DOM link")
	public void validatePageTitleAsLargeAndDeepDOMLink(String heading)
	{
		LADDp.titleOfLargeAndDeepDOMPage(heading);
	}

	@Then("User validates the Page content as {string} on Large And Deep DOM link")
	public void validatePageContentAsLargeAndDeepDOMLink(String content)
	{
		LADDp.contentOfLargeAndDeepDOMPage(content);
	}

	@Then("User retrieves the {string}th sibling from Large And Deep DOM page")
	public void retrieveNthSibling(String x)
	{
		LADDp.retrieveSiblings(x);
	}

	@Then("User retrieves the headers of the Table on the Large And Deep DOM page")
	public void retrieveHeadersFromTable()
	{
		LADDp.retrieveTableHeader();
	}

	@Then("User retrieves the complete table content from the Large And Deep DOM page")
	public void retrieveCompleteInfoFromTable()
	{
		LADDp.retrieveTableContent();
	}

	@Then("User retrieves the {string} value from the table on Large And Deep DOM page")
	public void retrieveNthValueFromTable(String num)
	{
		LADDp.retrieveSpecificValueFromTable(num);
	}

	@Then("User retrieves all cell values from {string}th row from the table on Large And Deep DOM page")
	public void retrieveAllCellValuesFromNthRowOfTable(String row)
	{
		LADDp.retrieveAllCellValuesForSpecificRow(row);
	}

	@Then("User retrieves all row values from {string}th column from the table on Large And Deep DOM page")
	public void retrieveAllRowValuesFromNthColumnOfTable(String col)
	{
		LADDp.retrieveAllColValuesForSpecificCol(col);
	}

	//************************************************StepDefs for Multiple Windows Page validation**********************************//

	@And("User clicks on the {string} Multiple Windows link")
	public void userClicksOnMultipleWindowsLink(String s)
	{
		MWp.clickOnMultipleWindowsLink();
	}

	@Then("User validates the Page title as {string} on Multiple Windows link")
	public void validatePageTitleAsMultipleWindowsLink(String heading)
	{
		MWp.titleOfMultipleWindowsPage(heading);
	}

	@Then("User opens a new tab and validates the Page title as {string} on new page of Multiple Windows link and redirects back to the parent tab")
	public void openNewTabAndValidatePageTitleAsMultipleWindowsLink(String heading)
	{
		MWp.clickHereToOpenNewWindowAndVerifyTheNewWindowTitle(heading);
	}

	//************************************************StepDefs for Nested Frames Page validation**********************************//

	@And("User clicks on the {string} Nested Frames link")
	public void userClicksOnNestedFramesLink(String s)
	{
		NFp.clickOnNestedFramesLink();
	}

	//************************************************StepDefs for Notification Messages Page validation**********************************//

	@And("User clicks on the {string} Notification Messages link")
	public void userClicksOnNotificationMessagesLink(String s)
	{
		NMp.clickOnNotificationMessagesLink();
	}

	@Then("User validates the Page title as {string} on Notification Messages link")
	public void validatePageTitleAsNotificationMessagesLink(String heading)
	{
		NMp.titleOfNotificationMessagesPage(heading);
	}

	@Then("User validates the Page content as {string} on Notification Messages link")
	public void validatePageContentAsNotificationMessagesLink(String content)
	{
		NMp.contentOfNotificationMessagesPage(content);
	}

	@Then("User validates the Notification Message as {string} on Notification Messages link")
	public void validateNotificationMessageAsNotificationMessagesLink(String msg)
	{
		NMp.validateNotificationMessage(msg);
	}

	@Then("User clicks on the Click here hyperlink")
	public void clickOnClickHereNotificationMessagesLink()
	{
		NMp.clickHereToLoadNewMessage();
	}

	//************************************************StepDefs for Redirect Link Page validation**********************************//

	@And("User clicks on the {string} Redirect link")
	public void userClicksOnRedirectLink(String s)
	{
		RLp.clickOnRedirectLinkLink();
	}

	@Then("User validates the Page title as {string} on Redirect link")
	public void validatePageTitleAsRedirectLink(String heading)
	{
		RLp.titleOfRedirectLinkPage(heading);
	}

	@Then("User is redirected to Status codes page and validates the Page title as {string} on Status Codes page")
	public void validatePageTitleAsStatusCodes(String heading)
	{
		RLp.titleOfStatusCodePage(heading);
	}

	@Then("User is redirected to IANA page and retrieves the complete list of status codes from the page")
	public void retrieveStatusCodesListFromIANAPage()
	{
		RLp.viewAllTheHTTPCodes();
	}

	@Then("User selects {string} redirects to that page and validates Page title as {string} and redirects back to Status codes Page")
	public void retrieveAndValidateStatusCodesContent(String code,String title)
	{
		RLp.viewAndRetrieveStatusCodes(code,title);
	}
}