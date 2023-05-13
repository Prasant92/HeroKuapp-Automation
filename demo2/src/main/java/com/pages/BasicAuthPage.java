package com.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasicAuthPage extends HomePage {

	public BasicAuthPage(WebDriver driver) {
		super(driver);
	}

	By BasicAuth_Option=By.xpath("//*[contains(text(),'Basic Auth')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'Basic Auth')]");
	
	By pageTitleDefinition=By.xpath("//*[contains(text(), 'Congratulations! You must have the proper credentials.')]");
	
	public void clickOnBasicAuthPageLink()  {
		if(driver.findElement(BasicAuth_Option).isEnabled())
		{
			new WebDriverWait(driver,Duration.ofSeconds(10)).until(
					ExpectedConditions.elementToBeClickable(BasicAuth_Option)).click();
			driver.findElement(BasicAuth_Option).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void acceptBasicAuthAlertPageLink()
	{
		String username = "admin";
		String password = "admin";
		String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void dismissBasicAuthAlertPageLink(String heading1)
	{
		String username = "admin";
		String password = "admin";
		String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void titleOfBasicAuthPage(String heading1)
	{
		try {
			Thread.sleep(4000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Basic Auth Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void contentOfBasicAuthPage(String content1)
	{
		try {
			Thread.sleep(4000);
			String content2=driver.findElement(pageTitleDefinition).getText();
			Assert.assertEquals(content1, content2,"Page content assertion is not successful on Basic Auth page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
