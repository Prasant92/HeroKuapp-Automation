package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EntryAdPage extends HomePage {

    public EntryAdPage(WebDriver rdriver) {
        super(rdriver);
    }

    By EntryAd_Option=By.xpath("//*[contains(text(),'Entry Ad')]");

    By pageTitle=By.xpath("//*[contains(text(),'Entry Ad')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'Displays an ad on page load.')]");

    By clickOnClickHereLink=By.xpath("//*[contains(text(),'click here')]");

    By modalWindowTitle=By.xpath("//*[contains(text(),'This is a modal window')]");

    By modalWindowTitleDefinition=By.xpath("//div[@class='modal-body']/p");

    By clickCloseButtonOnModalWindow=By.xpath("//div[@id='modal']/div[2]/div[3]/p");

    public void clickOnEntryAdLink()  {
        if(driver.findElement(EntryAd_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(EntryAd_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(EntryAd_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfEntryAdPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Entry Ad Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfEntryAdPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Entry Ad Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnClickHereLinkOnEntryAdPage()  {
        if(driver.findElement(clickOnClickHereLink).isEnabled())
        {
            try {
                WebDriverWait w=new WebDriverWait(driver, 10);
                w.until(ExpectedConditions.elementToBeClickable(clickOnClickHereLink));
                WebElement ele=driver.findElement(clickOnClickHereLink);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].scrollIntoView(true);",ele);
                Actions a=new Actions(driver);
                a.moveToElement(ele).click().perform();
                System.out.println("Done");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfModalWindowOnEntryAdPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(modalWindowTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Modal Window");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfModalWindowOnEntryAdPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(modalWindowTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Modal Window");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCloseLinkOnModalWindow()
    {
        if(driver.findElement(clickCloseButtonOnModalWindow).isEnabled())
        {
            try {
                Thread.sleep(5000);
                driver.findElement(clickCloseButtonOnModalWindow).click();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }
}
