package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InputsPage extends  HomePage{

    By Inputs_Option=By.xpath("//*[contains(text(),'Inputs')]");

    By pageTitle=By.xpath("//*[contains(text(),'Inputs')]");

    By pageContent=By.xpath("//*[contains(text(),'Number')]");

    By inputTextBox=By.xpath("//input[@type='number']");

    public InputsPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnInputsLink()  {
        if(driver.findElement(Inputs_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(Inputs_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(Inputs_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfInputsPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Inputs Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfInputsPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Inputs Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void incrementingTheValue(String s)
    {
        try {
            Thread.sleep(3000);
            driver.findElement(inputTextBox).sendKeys(s);
            Actions actions=new Actions(driver);
            actions.moveByOffset(902,146).click().perform();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void decrementingTheValue(String s)
    {
        try {
            Thread.sleep(3000);
            driver.findElement(inputTextBox).sendKeys(s);
            Actions actions=new Actions(driver);
            actions.moveByOffset(902,152).click().perform();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
