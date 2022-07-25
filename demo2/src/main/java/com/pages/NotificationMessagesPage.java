package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NotificationMessagesPage extends HomePage {

    By NotificationMessages_Option=By.xpath("//*[contains(text(),'Notification Messages')]");

    By pageTitle=By.xpath("//*[contains(text(),'Notification Message')]");

    By pageContent=By.xpath("//*[contains(text(),'The message displayed above the heading is a notification message. It is often used to convey information about an action previously taken by the user.')]");

    By flashMessage=By.id("flash");

    By clickForNewMessage=By.xpath("//*[contains(text(),'Click here')]");

    public NotificationMessagesPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnNotificationMessagesLink()  {
        if(driver.findElement(NotificationMessages_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(NotificationMessages_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(NotificationMessages_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfNotificationMessagesPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Notification Messages Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void contentOfNotificationMessagesPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Notification Messages Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void validateNotificationMessage(String msg1)
    {
        try {
            Thread.sleep(3000);
            String msg2=driver.findElement(flashMessage).getText();
            Assert.assertEquals(msg1, msg2,"Flash message assertion is not successful on Notification Messages Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void clickHereToLoadNewMessage()
    {
        driver.findElement(clickForNewMessage).click();
    }
}
