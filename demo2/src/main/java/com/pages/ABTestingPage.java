package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ABTestingPage extends HomePage{

	public ABTestingPage(WebDriver rdriver) {
		super(driver);
	}

	By ABTesting_Option=By.xpath("//*[contains(text(),'A/B Testing')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'A/B Test Variation 1')]");
	
	By pageTitleDefinition=By.xpath("//*[contains(text(), 'Also known as split testing')]");
	
	
	public void clickOnLink()  {
		if(driver.findElement(ABTesting_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(ABTesting_Option));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(ABTesting_Option).click();
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void titleOfPage(String heading1)
	{
		try {
			Thread.sleep(5000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on AB Testing Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void contentOfPage(String content1)
	{
		try {
			Thread.sleep(5000);
			String content2=driver.findElement(pageTitleDefinition).getText();
			Assert.assertEquals(content1, content2,"Page content assertion is not successful on AB testing page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
