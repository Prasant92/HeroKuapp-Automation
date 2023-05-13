package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class JavaScriptAlertsPage extends HomePage{

    By JavaScriptAlerts_Option=By.xpath("//*[contains(text(),'JavaScript Alerts')]");

    By pageTitle=By.xpath("//*[contains(text(),'JavaScript Alerts')]");

    By pageContent=By.xpath("//*[contains(text(),'Here are some examples of different JavaScript alerts which can be troublesome for automation')]");

    By JSAlertButton=By.xpath("//*[contains(text(),'Click for JS Alert')]");

    By JSConfirmButton=By.xpath("//*[contains(text(),'Click for JS Confirm')]");

    By JSPromptButton=By.xpath("//*[contains(text(),'Click for JS Prompt')]");

    By Result=By.id("result");

    public JavaScriptAlertsPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnJavaScriptAlertsLink()  {
        if(driver.findElement(JavaScriptAlerts_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(JavaScriptAlerts_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(JavaScriptAlerts_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfJavaScriptAlertsPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on JavaScript Alerts Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfJavaScriptAlertsPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on JavaScript Alerts Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void acceptTheAlertAndValidateResultOnJSAlertButton()
    {
        driver.findElement(JSAlertButton).click();
        try {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
            System.out.println("The alert says "+alert.getText());
            Thread.sleep(3000);
            alert.accept();
            String result=driver.findElement(Result).getText();
            System.out.println(result);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void acceptTheAlertAndValidateResultOnJSConfirmButton()
    {
        driver.findElement(JSConfirmButton).click();
        try {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
            System.out.println("The alert says "+alert.getText());
            Thread.sleep(3000);
            alert.accept();
            String result=driver.findElement(Result).getText();
            System.out.println(result);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void cancelTheAlertAndValidateResultOnJSAlertButton()
    {
        driver.findElement(JSConfirmButton).click();
        try {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
            System.out.println("The alert says "+alert.getText());
            Thread.sleep(3000);
            alert.dismiss();
            String result=driver.findElement(Result).getText();
            System.out.println(result);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void acceptTheAlertAndValidateResultOnJSPromptButton()
    {
        driver.findElement(JSPromptButton).click();
        try {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
            System.out.println("The alert says "+alert.getText());
            Thread.sleep(3000);
            alert.sendKeys("admin");
            Thread.sleep(3000);
            alert.accept();
            //Runtime.getRuntime().exec("C:\\Users\\hp\\IdeaProjects\\HeroKuapp-Automation\\demo2\\src\\test\\resources\\Prompt_PopUP Accept Automation code.exe");
            Thread.sleep(5000);
            String result=driver.findElement(Result).getText();
            System.out.println(result);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void cancelTheAlertAndValidateResultOnJSPromptButton()
    {
        driver.findElement(JSPromptButton).click();
        try {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
            System.out.println("The alert says "+alert.getText());
            Thread.sleep(3000);
            alert.sendKeys("admin");
            Thread.sleep(3000);
            alert.dismiss();
            //Runtime.getRuntime().exec("C:\\Users\\hp\\IdeaProjects\\HeroKuapp-Automation\\demo2\\src\\test\\resources\\Prompt_PopUP Dismiss Automation code.exe");
            Thread.sleep(5000);
            String result=driver.findElement(Result).getText();
            System.out.println(result);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
