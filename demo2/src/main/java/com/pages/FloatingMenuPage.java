package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FloatingMenuPage extends HomePage{

    By FloatingMenu_Option=By.xpath("//*[contains(text(),'Floating Menu')]");

    By pageTitle=By.xpath("//*[contains(text(),'Floating Menu')]");

    By homeMenu=By.xpath("//div[@id='menu']/ul/li[1]/a");

    By newsMenu=By.xpath("//div[@id='menu']/ul/li[2]/a");

    By contactMenu=By.xpath("//div[@id='menu']/ul/li[3]/a");

    By aboutMenu=By.xpath("//div[@id='menu']/ul/li[4]/a");


    public FloatingMenuPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnFloatingMenuLink()  {
        if(driver.findElement(FloatingMenu_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(FloatingMenu_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(FloatingMenu_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfFloatingMenuPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Floating Menu Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollFloatingMenuPageToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            long lastHeight=((Number)js.executeScript("return document.body.scrollHeight")).longValue();
            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(3000);

                long newHeight = ((Number)js.executeScript("return document.body.scrollHeight")).longValue();
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void scrollFloatingMenuFromBottomToTop() throws AWTException {
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_END);
        r.keyRelease(KeyEvent.VK_END);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickAndAssertHomeMenuButton(String homeMenuURL)
    {
        if(driver.findElement(homeMenu).isEnabled())
        {
            driver.findElement(homeMenu).click();
            try {
                String st=driver.getCurrentUrl();
                System.out.println(st);
                Thread.sleep(4000);
                Assert.assertEquals(st,homeMenuURL,"Home Menu assertion is not successful on Floating Menu Page");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickAndAssertNewsMenuButton(String newsMenuURL)
    {
        if(driver.findElement(newsMenu).isEnabled())
        {
            driver.findElement(newsMenu).click();
            try {
                String st=driver.getCurrentUrl();
                System.out.println(st);
                Thread.sleep(4000);
                Assert.assertEquals(st,newsMenuURL,"News Menu assertion is not successful on Floating Menu Page");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickAndAssertContactMenuButton(String contactMenuURL)
    {
        if(driver.findElement(contactMenu).isEnabled())
        {
            driver.findElement(contactMenu).click();
            try {
                String st=driver.getCurrentUrl();
                System.out.println(st);
                Thread.sleep(4000);
                Assert.assertEquals(st,contactMenuURL,"Contact Menu assertion is not successful on Floating Menu Page");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickAndAssertAboutMenuButton(String aboutMenuURL)
    {
        if(driver.findElement(aboutMenu).isEnabled())
        {
            driver.findElement(aboutMenu).click();
            try {
                String st=driver.getCurrentUrl();
                System.out.println(st);
                Thread.sleep(4000);
                Assert.assertEquals(st,aboutMenuURL,"About Menu assertion is not successful on Floating Menu Page");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
