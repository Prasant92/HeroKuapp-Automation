package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FormAuthenticationPage extends HomePage{

    By FormAuthentication_Option=By.xpath("//*[contains(text(),'Form Authentication')]");

    By pageTitle=By.xpath("//*[contains(text(),'Login Page')]");

    By pageContent=By.xpath("//div[@class='example']/h4");

    By populateUsername=By.xpath("//input[@name='username']");

    By populatePassword=By.xpath("//input[@name='password']");

    By clickLoginButton=By.xpath("//button[@type='submit']");

    By retrieveErrorMessage=By.xpath("//div[@id='flash-messages']/div");

    By retrieveSuccessMessage=By.xpath("//div[@id='flash-messages']/div");

    By successPageTitle=By.xpath("//*[contains(text(),'Secure Area')]");

    By successPageContent=By.xpath("//*[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]");

    By clickLogoutButton=By.xpath("//a[@href='/logout']");


    public FormAuthenticationPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnFormAuthenticationLink()  {
        if(driver.findElement(FormAuthentication_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(FormAuthentication_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(FormAuthentication_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfFormAuthenticationPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Form Authentication Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfFormAuthenticationPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Form Authentication Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void populateUsernameOnFormAuthenticationPage(String username)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(populateUsername).sendKeys(username);
    }

    public void populatePasswordOnFormAuthenticationPage(String password)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(populatePassword).sendKeys(password);
    }

    public void clickLoginOnFormAuthenticationPage()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(clickLoginButton).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void retrieveAndValidateErrorMessage(String errMsg1)
    {
        try {
            Thread.sleep(3000);
            String errMsg2=driver.findElement(retrieveErrorMessage).getText();
            errMsg2=errMsg2.substring(0,25);
            Assert.assertEquals(errMsg1, errMsg2,"Error message assertion is not successful on Form Authentication Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void retrieveAndValidateSuccessMessage(String Msg1)
    {
        try {
            Thread.sleep(3000);
            String Msg2=driver.findElement(retrieveSuccessMessage).getText();
            Msg2=Msg2.substring(0,30);
            Assert.assertEquals(Msg1, Msg2,"Success message assertion is not successful on Form Authentication Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void titleOfSecureAreaPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(successPageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Secure Area Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void contentOfSecureAreaPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(successPageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Secure Area Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickLogOutOnSecureAreaPage()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(clickLogoutButton).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void retrieveAndValidateSuccessMessageOnLoginPage(String Msg1)
    {
        try {
            Thread.sleep(3000);
            String Msg2=driver.findElement(retrieveSuccessMessage).getText();
            Msg2=Msg2.substring(0,34);
            Assert.assertEquals(Msg1, Msg2,"Success message assertion is not successful on Form Authentication Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
