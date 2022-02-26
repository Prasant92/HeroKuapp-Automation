package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddRemoveElementsPage extends HomePage{

	public AddRemoveElementsPage(WebDriver rdriver) {
		super(driver);
	}

By AddRemoveElements_Option=By.xpath("//*[contains(text(),'Add/Remove Elements')]");	
	
By pageTitle=By.xpath("//*[contains(text(),'Add/Remove Elements')]");
	
By addElementButton=By.xpath("//*[contains(text(), 'Add Element')]");
	
By deleteButton=By.xpath("//*[contains(text(), 'Delete')]");


	public void clickOnAddRemoveElementsPageLink()  {
		if(driver.findElement(AddRemoveElements_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(AddRemoveElements_Option));
			driver.findElement(AddRemoveElements_Option).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void titleOfAddRemoveElementsPage(String heading1)
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
	
	public void clickOnAddElementButtonAddRemoveElementsPage(int n)
	{
		try {
			if(driver.findElement(AddRemoveElements_Option).isEnabled())
			{
				for(int i=1;i<=n;i++)
				{
					WebDriverWait w=new WebDriverWait(driver, 5);
					w.until(ExpectedConditions.elementToBeClickable(addElementButton));
					driver.findElement(addElementButton).click();
					Thread.sleep(2000);
				}
				System.out.println("---------------------------------Step Passed---------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnDeletebuttonAddRemoveElementsPage(int n)
	{
		for(int i=n;i>=1;i--)
		{
			WebDriverWait w=new WebDriverWait(driver, 5);
			w.until(ExpectedConditions.elementToBeClickable(deleteButton));
			driver.findElement(By.xpath("//*[contains(text(), 'Delete')]["+i+"]")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
}