package com.pages;

import java.util.List;

import org.apache.http.client.methods.HttpGet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;


public class BrokenImagesPage extends HomePage {

	public BrokenImagesPage(WebDriver rdriver) {
		super(driver);
	}

	By BrokenImages_Option=By.xpath("//*[contains(text(),'Broken Images')]");
	
	By pageTitle=By.xpath("//*[contains(text(),'Broken Images')]");
	
	public void clickOnBrokenImagesPageLink()  {
		if(driver.findElement(BrokenImages_Option).isEnabled())
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(BrokenImages_Option));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(BrokenImages_Option).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------Step Passed---------------------------------");
		}
	}
	
	public void titleOfBrokenImagesPage(String heading1)
	{
		try {
			Thread.sleep(4000);
			String heading2=driver.findElement(pageTitle).getText();
			Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Broken Images Page");
			System.out.println("---------------------------------Step Passed---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getAllBrokenImagesOnBrokenImagesPage()
	{
		try
		{
			int invalidImgCount=0;
			List<WebElement> imglist=driver.findElements(By.tagName("img"));
			System.out.println("Total number of images on the webpage are "+imglist.size());
			for (WebElement wb:imglist)
			{
				if(wb!=null)
				{
					try {
						   HttpClient hc = (HttpClient) HttpClientBuilder.create().build(); 
						   HttpGet hg = new HttpGet(wb.getAttribute("src")); 
						   org.apache.http.HttpResponse hr =  hc.execute(hg);
						   if(hr.getStatusLine().getStatusCode()!=200)
						   {
							   invalidImgCount++; 
						   }
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			Thread.sleep(3000);
			System.out.println("Number of broken images on the Broken Images page is "+invalidImgCount);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------------Step Passed---------------------------------");
	}
}

