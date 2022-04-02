package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExitIntentPage extends HomePage{

    public ExitIntentPage(WebDriver rdriver) {
        super(rdriver);
    }

    By ExitIntent_Option=By.xpath("//*[contains(text(),'Exit Intent')]");

    By pageTitle=By.xpath("//*[contains(text(),'Exit Intent')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'Mouse out of the viewport pane and see a modal window appear.')]");

    public void clickOnExitIntentLink()  {
        if(driver.findElement(ExitIntent_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(ExitIntent_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(ExitIntent_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfExitIntentPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Exit Intent Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfExitIntentPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Exit Intent Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
