package com.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
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

	By BasicAuth_Option=By.xpath("//*[contains(text(),'Basic Auth')]");

	By BrokenImages_Option=By.xpath("//*[contains(text(),'Broken Images')]");

	By ChallengingDOM_Option=By.xpath("//*[contains(text(),'Challenging DOM')]");

	By Checkboxes_Option=By.xpath("//*[contains(text(),'Checkboxes')]");

	By ContextMenu_Option=By.xpath("//*[contains(text(),'Context Menu')]");

	By DigestAuthentication_Option=By.xpath("//*[contains(text(),'Digest Authentication')]");
	
	By DisappearingElements_Option=By.xpath("//*[contains(text(),'Disappearing Elements')]");
	
	By DragAndDrop_Option=By.xpath("//*[contains(text(),'Drag and Drop')]");
	
	public void titleOfWebsite() 
	{
		try {
			System.out.println("The title is: "+driver.getTitle());
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void assertHomePageHeading(String heading1)
	{
		try {
			String heading2=driver.findElement(homepage_Header).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on HomePage");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkForBrokenLinks()
	{
		HttpURLConnection huc = null;
		int respCode = 200;
		List<WebElement> l=driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr=l.iterator();
		while(itr.hasNext())
		{
			String url=itr.next().getAttribute("href");
			if(url.isEmpty()||url==null)
			{
				System.out.println("url is empty or null");
				continue;
			}
			try
			{
				huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode=huc.getResponseCode();
				if(respCode>=400)
				{
					System.out.println(url+" is a broken link");
				}
				else
				{
					System.out.println(url+" isn't a broken link");
				}
			}
			catch (MalformedURLException mue) {
				mue.printStackTrace();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
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