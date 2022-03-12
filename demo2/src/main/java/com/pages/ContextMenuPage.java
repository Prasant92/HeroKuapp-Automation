package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContextMenuPage extends HomePage{

	public ContextMenuPage(WebDriver rdriver) {
		super(driver);
	}

	By ContextMenu_Option=By.xpath("//*[contains(text(),'Context Menu')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'Context Menu')]");
	
	By pageTitleDefinition=By.xpath("//*[contains(text(), 'Context menu items are custom additions that appear in the right-click menu.')]");
	
	By performContextClick= By.id("hot-spot");
	
	public void clickOnContextMenuPageLink()  {
		if(driver.findElement(ContextMenu_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(ContextMenu_Option));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(ContextMenu_Option).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void titleOfContextMenuPage(String heading1)
	{
		try {
			Thread.sleep(4000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Context Menu Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void contentOfContextMenuPage(String content1)
	{
		try {
			Thread.sleep(4000);
			String content2=driver.findElement(pageTitleDefinition).getText();
			Assert.assertEquals(content1, content2,"Page content assertion is not successful on Context Menu page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void performContextClickActionOnContextMenuPage()
	{
		Actions a=new Actions(driver);
		WebElement wb=driver.findElement(performContextClick);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.contextClick(wb).perform();
		System.out.println("Successfully right click done");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void acceptContextMenuAlert()
	{
		Alert a=driver.switchTo().alert();
		System.out.println("The alert is "+a.getText());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.accept();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
}
