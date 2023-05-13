package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DynamicControlsPage extends HomePage{

    public DynamicControlsPage(WebDriver rdriver) {
        super(rdriver);
    }

    By DynamicControls_Option=By.xpath("//*[contains(text(),'Dynamic Controls')]");

    By pageTitle=By.xpath("//*[contains(text(),'Dynamic Controls')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'This example demonstrates when elements (e.g., checkbox, input field, etc.) are changed asynchronously.')]");

    By clickCheckBoxOnDynamicControlsPage=By.xpath("//input[@type='checkbox']");

    By clickRemoveOrAddButtonOnDynamicControlsPage=By.xpath("//form[@id='checkbox-example']/button");

    By messageAfterClickingRemoveOrAddButtonOnDynamicControlsPage=By.xpath("//form[@id='checkbox-example']/p");

    By enterTextIntoInputBoxOnDynamicControlsPage=By.xpath("//input[@type='text']");

    By clickEnableOrDisableButtonOnDynamicControlsPage = By.xpath("//form[@id='input-example']/button");

    By messageAfterClickingEnableOrDisableButtonOnDynamicControlsPage=By.xpath("//form[@id='input-example']/p");


    public void clickOnDynamicControlsLink()  {
        if(driver.findElement(DynamicControls_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(DynamicControls_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DynamicControls_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDynamicControlsPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Dynamic Controls Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfDynamicControlsPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Dynamic Controls Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickingCheckBoxOnDynamicControlsPage()
    {
        try {
            Thread.sleep(4000);
            driver.findElement(clickCheckBoxOnDynamicControlsPage).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickingRemoveOrAddButtonOnDynamicControlsPage()
    {
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(clickRemoveOrAddButtonOnDynamicControlsPage));
        try {
            Thread.sleep(4000);
            driver.findElement(clickRemoveOrAddButtonOnDynamicControlsPage).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void validateMessageAfterClickingRemoveOrAddButtonOnDynamicControlsPage(String message1)
    {
        try {
            Thread.sleep(4000);
            if(driver.findElement(messageAfterClickingRemoveOrAddButtonOnDynamicControlsPage).isDisplayed())
            {
                String message2=driver.findElement(messageAfterClickingRemoveOrAddButtonOnDynamicControlsPage).getText();
                System.out.println("Message After Clicking Remove Or Add Button is "+driver.findElement(messageAfterClickingRemoveOrAddButtonOnDynamicControlsPage).getText());
                Assert.assertEquals(message1, message2,"Message assertion for Add/Remove button is not successful on Dynamic Controls Page");
            }
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void enteringTextIntoInputBoxOnDynamicControlsPage(String text)
    {
        try {
            Thread.sleep(4000);
            driver.findElement(enterTextIntoInputBoxOnDynamicControlsPage).clear();
            driver.findElement(enterTextIntoInputBoxOnDynamicControlsPage).sendKeys(text);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickingEnableOrDisableButtonOnDynamicControlsPage()
    {
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(clickEnableOrDisableButtonOnDynamicControlsPage));
        try {
            Thread.sleep(4000);
            driver.findElement(clickEnableOrDisableButtonOnDynamicControlsPage).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void validateMessageAfterClickingEnableOrDisableButtonOnDynamicControlsPage(String message1)
    {
        try {
            Thread.sleep(4000);
            if(driver.findElement(messageAfterClickingEnableOrDisableButtonOnDynamicControlsPage).isDisplayed())
            {
                String message2=driver.findElement(messageAfterClickingEnableOrDisableButtonOnDynamicControlsPage).getText();
                System.out.println("Message After Clicking Remove Or Add Button is "+message2);
                Assert.assertEquals(message1, message2,"Message assertion for Enable/Disable button is not successful on Dynamic Controls Page");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}