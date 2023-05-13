package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ABTestingPage extends HomePage{

	public ABTestingPage(WebDriver driver) {
		super(driver);
	}

	By ABTesting_Option=By.xpath("//*[contains(text(),'A/B Testing')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'A/B Test Control')]");
	
	By pageTitleDefinition=By.xpath("//*[contains(text(), 'Also known as split testing')]");
	
	
	public void clickOnLink()  {
		try {
			Thread.sleep(5000);
			new WebDriverWait(driver,Duration.ofSeconds(10)).until(
					ExpectedConditions.elementToBeClickable(ABTesting_Option)).click();
			Thread.sleep(5000);
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (TimeoutException | InterruptedException e) {
			System.out.println("Exception caught");
		}
	}
	
	public boolean titleOfPage(String heading1)
	{
		try {
			Thread.sleep(5000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on AB Testing Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
			return true;
		} catch (TimeoutException | InterruptedException e) {
			System.out.println("Exception caught");
			return false;
		}
	}
	
	public boolean contentOfPage(String content1)
	{
		try {
			Thread.sleep(5000);
			String content2=driver.findElement(pageTitleDefinition).getText();
			Assert.assertEquals(content1, content2,"Page content assertion is not successful on AB testing page");
			System.out.println("---------------------------------Step Passed---------------------------------");
			return true;
		} catch (TimeoutException | InterruptedException e) {
			System.out.println("Exception caught");
			return false;
		}
	}
}
