package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckboxesPage extends HomePage{

	public CheckboxesPage(WebDriver rdriver) {
		super(driver);
	}
	
	By Checkboxes_Option=By.xpath("//*[contains(text(),'Checkboxes')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'Checkboxes')]");
	
	By checkbox=By.tagName("input");
	
	public void clickOnCheckboxesPageLink()  {
		if(driver.findElement(Checkboxes_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
			w.until(ExpectedConditions.elementToBeClickable(Checkboxes_Option));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(Checkboxes_Option).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void assertTitleOfCheckboxesPage(String heading1)
	{
		try {
			Thread.sleep(4000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Checkboxes Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checksOnCheckboxOnCheckboxesPage()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		List<WebElement> l=driver.findElements(checkbox);
		int s=l.size();
		for(int i=1;i<=s;i++)
		{
			if(driver.findElement(By.xpath("//form[@id='checkboxes']/input["+i+"]")).isSelected()==false)
			{
				System.out.println("The checkbox "+i+" is not selected");
				driver.findElement(By.xpath("//form[@id='checkboxes']/input["+i+"]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("The checkbox "+i+" is selected");
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void unchecksOnCheckboxOnCheckboxesPage()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		List<WebElement> l=driver.findElements(checkbox);
		int s=l.size();
		for(int i=1;i<=s;i++)
		{
			if(driver.findElement(By.xpath("//form[@id='checkboxes']/input["+i+"]")).isSelected()==true)
			{
				System.out.println("The checkbox "+i+" is not selected");
				driver.findElement(By.xpath("//form[@id='checkboxes']/input["+i+"]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("The checkbox "+i+" is selected");
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
}
