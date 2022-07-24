package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class MultipleWindowsPage extends  HomePage{

    By MultipleWindows_Option=By.xpath("//*[contains(text(),'Multiple Windows')]");

    By pageTitle=By.xpath("//*[contains(text(),'Opening a new window')]");

    By clickHere=By.xpath("//*[contains(text(),'Click Here')]");

    By newWinTitle=By.xpath("//div[@class='example']/h3");


    public MultipleWindowsPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnMultipleWindowsLink()  {
        if(driver.findElement(MultipleWindows_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(MultipleWindows_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(MultipleWindows_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfMultipleWindowsPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Multiple Windows Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHereToOpenNewWindowAndVerifyTheNewWindowTitle(String title1)
    {
        driver.findElement(clickHere).click();
        try {
            Thread.sleep(3000);
            String title2=driver.findElement(newWinTitle).getText();
            Assert.assertEquals(title1, title2,"Page title assertion is not successful on new Window of Multiple Windows Page");
            HashSet<Object> tabs2 = new HashSet<>(driver.getWindowHandles());
            Iterator itr = tabs2.iterator();
            while (itr.hasNext())
            {
                Thread.sleep(3000);
                driver.switchTo().window((String) itr.next());
            }
            Thread.sleep(3000);
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
