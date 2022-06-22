package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InfiniteScrollPage extends HomePage{

    By InfiniteScroll_Option=By.xpath("//*[contains(text(),'Infinite Scroll')]");

    By pageTitle=By.xpath("//*[contains(text(),'Infinite Scroll')]");

    public InfiniteScrollPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnInfiniteScrollLink()  {
        if(driver.findElement(InfiniteScroll_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(InfiniteScroll_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(InfiniteScroll_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfInfiniteScrollPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Infinite Scroll Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void infiniteScrollToBottomPage(String s)
    {
        int x=Integer.parseInt(s);
        for(int i=0;i<x;i++)
        {
            try {
                JavascriptExecutor js=(JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
