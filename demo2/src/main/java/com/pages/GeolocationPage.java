package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class GeolocationPage extends HomePage{

    By Geolocation_Option=By.xpath("//*[contains(text(),'Geolocation')]");

    By pageTitle=By.xpath("//*[contains(text(),'Geolocation')]");

    By pageContent=By.xpath("//*[contains(text(),'Click the button to get your current latitude and longitude')]");

    By clickWhereAMIButton=By.xpath("//*[contains(text(),'Where am I')]");

    By getLatitudeValue=By.id("lat-value");

    By getLongitudeValue=By.id("long-value");


    public GeolocationPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnGeolocationLink()  {
        if(driver.findElement(Geolocation_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(Geolocation_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(Geolocation_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfGeolocationPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Geolocation Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfGeolocationPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Geolocation Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
