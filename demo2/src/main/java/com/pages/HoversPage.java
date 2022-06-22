package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HoversPage extends HomePage{


    By Hovers_Option=By.xpath("//*[contains(text(),'Hovers')]");

    By pageTitle=By.xpath("//*[contains(text(),'Hovers')]");

    By pageContent=By.xpath("//*[contains(text(),'Hover over the image for additional information')]");

    By imageSourceText=By.xpath("//*[contains(text(),'Not Found')]");

    public HoversPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnHoversLink()  {
        if(driver.findElement(Hovers_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(Hovers_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(Hovers_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfHoversPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Hovers Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfHoversPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Hovers Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverImageAndRetrieveName(String s)
    {
        int n=Integer.parseInt(s);
        WebElement img=driver.findElement(By.xpath("//div[@class='example']/div["+n+"]/img"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(img).perform();
            Thread.sleep(3000);
            String name=driver.findElement(By.xpath("//div[@class='example']/div["+n+"]//div/h5")).getText();
            System.out.println("The name of the image is "+name);
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hoverOverImageAndClickViewProfile(String s)
    {
        int n=Integer.parseInt(s);
        WebElement img=driver.findElement(By.xpath("//div[@class='example']/div["+n+"]/img"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(img).perform();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='example']/div["+n+"]//div/a")).click();
            Thread.sleep(3000);
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickViewProfileAndValidateSourceText(String s,String content1)
    {
        int n=Integer.parseInt(s);
        WebElement img=driver.findElement(By.xpath("//div[@class='example']/div["+n+"]/img"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(img).perform();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='example']/div["+n+"]//div/a")).click();
            Thread.sleep(3000);
            String content2=driver.findElement(imageSourceText).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Image source Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
