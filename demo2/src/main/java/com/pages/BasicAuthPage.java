package com.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasicAuthPage extends HomePage {

	public BasicAuthPage(WebDriver rdriver) {
		super(driver);
	}

	By BasicAuth_Option=By.xpath("//*[contains(text(),'Basic Auth')]");
	
	By BasicAuth_AlertDismiss=By.xpath("//*[contains(text(),'Not authorized')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'Basic Auth')]");
	
	By pageTitleDefinition=By.xpath("//*[contains(text(), 'Congratulations! You must have the proper credentials.')]");
	
	public void clickOnBasicAuthPageLink()  {
		if(driver.findElement(BasicAuth_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(BasicAuth_Option));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(BasicAuth_Option).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void acceptBasicAuthAlertPageLink()
	{	
		try {
			Runtime.getRuntime().exec("C:\\Users\\hp\\IdeaProjects\\HeroKuapp-Automation\\demo2\\src\\test\\resources\\Authentication_PopUP Automation code.exe");
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void dismissBasicAuthAlertPageLink(String heading1)
	{
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
		String alertMsg=a.getText();
		System.out.println("The alert message is "+alertMsg);
		try {
			Thread.sleep(4000);
			a.dismiss();
			try {
				Thread.sleep(4000);
				String heading2=driver.findElement(BasicAuth_AlertDismiss).getText();
				Assert.assertEquals(heading1, heading2,"Page Content assertion is not successful after the dissmisal of pop up");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
