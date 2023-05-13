package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class JavaScriptOnloadEventError extends HomePage{

    By JavaScriptOnloadEventError_Option=By.xpath("//*[contains(text(),'JavaScript onload event error')]");

    By pageContent=By.xpath("//*[contains(text(),' This page has a JavaScript error in the onload event. This is often a problem to using normal Javascript injection techniques. ')]");

    public JavaScriptOnloadEventError(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnJavaScriptOnloadEventErrorLink()  {
        if(driver.findElement(JavaScriptOnloadEventError_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(JavaScriptOnloadEventError_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(JavaScriptOnloadEventError_Option).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void contentOfJavaScriptOnloadEventErrorPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on JavaScript Onload Event Error Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
