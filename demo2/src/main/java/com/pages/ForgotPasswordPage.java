package com.pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;
import java.util.Map;

public class ForgotPasswordPage extends HomePage{

    By ForgotPassword_Option=By.xpath("//*[contains(text(),'Forgot Password')]");

    By pageTitle=By.xpath("//*[contains(text(),'Forgot Password')]");

    By emailAddress=By.xpath("//input[@id='email']");

    By retrievePassword=By.xpath("//button[@id='form_submit']");


    public ForgotPasswordPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnForgotPasswordLink()  {
        if(driver.findElement(ForgotPassword_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(ForgotPassword_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(ForgotPassword_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfForgotPasswordPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Forgot Password Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void populateEmailIDOnForgotPasswordPage(String emailUserID)
    {
            try
            {
                Thread.sleep(2000);
                driver.findElement(emailAddress).sendKeys(emailUserID);
            }catch (Exception e) {
                e.printStackTrace();
            }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickRetrievePasswordOnForgotPasswordPage()
    {
            WebElement wb=driver.findElement(retrievePassword);
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",wb);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
