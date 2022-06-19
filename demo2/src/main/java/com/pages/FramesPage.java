package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FramesPage extends HomePage{

    By Frames_Option=By.xpath("//*[contains(text(),'Frames')]");

    By pageTitle=By.xpath("//*[contains(text(),'Frames')]");

    By NestedFrames_Option=By.xpath("//*[contains(text(),'Nested Frames')]");

    By iFrames_Option=By.xpath("//*[contains(text(),'iFrame')]");

    By LeftFrameContent=By.xpath("//*[contains(text(),' LEFT')]");

    By MiddleFrameContent=By.xpath("//div[@id='content']");

    By RightFrameContent=By.xpath("//*[contains(text(),' RIGHT')]");

    By BottomFrameContent=By.xpath("//*[contains(text(),'BOTTOM')]");

    By iFramePageContent=By.xpath("//*[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]");

    By iFrameContent=By.xpath("//*[contains(text(),'Your content goes here.')]");


    public FramesPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnFramesLink()  {
        if(driver.findElement(Frames_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(Frames_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(Frames_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfFramesPage(String heading1)
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

    public void clickOnFramesOption(String Option)
    {
        try {
            Thread.sleep(4000);
            if(Option.equalsIgnoreCase("Nested Frames"))
            {
                driver.findElement(NestedFrames_Option).sendKeys(Keys.ENTER);
                Thread.sleep(4000);
            }
            else if(Option.equalsIgnoreCase("iFrame"))
            {
                driver.findElement(iFrames_Option).sendKeys(Keys.ENTER);
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void switchToFrameAndGetText(String frame,String text)
    {
        String frameText="";
        try {
            if(frame.equalsIgnoreCase("Left"))
            {
                driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-left");
                Thread.sleep(4000);
                frameText=driver.findElement(LeftFrameContent).getText().toUpperCase();
                Assert.assertEquals(text, frameText,"Frame text assertion is not successful on Frame Page");
            }
            else if(frame.equalsIgnoreCase("Middle"))
            {
                driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-middle");
                Thread.sleep(4000);
                frameText=driver.findElement(MiddleFrameContent).getText().toUpperCase();
                Assert.assertEquals(text, frameText,"Frame text assertion is not successful on Frame Page");
            }
            else if(frame.equalsIgnoreCase("Right"))
            {
                driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-right");
                Thread.sleep(4000);
                frameText=driver.findElement(RightFrameContent).getText().toUpperCase();
                Assert.assertEquals(text, frameText,"Frame text assertion is not successful on Frame Page");
            }
            else if(frame.equalsIgnoreCase("Bottom"))
            {
                driver.switchTo().frame("frame-bottom");
                Thread.sleep(4000);
                frameText=driver.findElement(BottomFrameContent).getText().toUpperCase();
                Assert.assertEquals(text, frameText,"Frame text assertion is not successful on Frame Page");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void contentOfiFramePage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(iFramePageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on iFrame Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToiFrameAndGetText(String content1)
    {
        try {
            Thread.sleep(4000);
            driver.switchTo().frame("mce_0_ifr");
            String content2=driver.findElement(iFrameContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on iFrame Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
