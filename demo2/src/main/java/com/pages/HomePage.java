package com.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import basePkg.BaseClass;


public class HomePage extends BaseClass{

	
	public HomePage(WebDriver rdriver)
	{
		driver=rdriver;
	}
	
	By homepage_Header=By.xpath("//*[contains(text(),'Welcome to the-internet')]");
	
	public String titleOfWebsite()
	{
		try {
			System.out.println("The title is: "+driver.getTitle());
			System.out.println("---------------------------------Step Passed---------------------------------");
			return driver.getTitle();
		} catch (TimeoutException e) {
			return  "Exception caught";
		}
	}
	
	public boolean assertHomePageHeading(String heading1)
	{
		try {
			String heading2=driver.findElement(homepage_Header).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on HomePage");
			System.out.println("---------------------------------Step Passed---------------------------------");
			return true;
		} catch (TimeoutException e) {
			System.out.println("Exception caught");
			return false;
		}
	}
	
	public void checkForBrokenLinks()
	{
		HttpURLConnection huc;
		int respCode;
		List<WebElement> l=driver.findElements(By.tagName("a"));
		for (WebElement webElement : l) {
			String url = webElement.getAttribute("href");
			if (url.isEmpty()) {
				System.out.println("url is empty or null");
				continue;
			}
			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " isn't a broken link");
				}
			} catch (IOException mue) {
				mue.printStackTrace();
			}
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
	
	public void closeBrowserSession()
	{
		driver.quit();
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
}