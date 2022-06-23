package com.pages;

import basePkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

public class DigestAuthPage extends BaseClass {

    public DigestAuthPage(WebDriver rdriver) {
        super(driver);
    }

    By DigestAuth_Option=By.xpath("//*[contains(text(),'Digest Authentication')]");

    By pageTitle=By.xpath("//*[contains(text(),'Digest Auth')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'Congratulations! You must have the proper credentials.')]");

    public void clickOnDigestAuthPageLink()  {
        if(driver.findElement(DigestAuth_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(DigestAuth_Option));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DigestAuth_Option).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void acceptDigestAuthAlertPageLink()
    {
        try {
            Runtime.getRuntime().exec("C:\\Users\\hp\\IdeaProjects\\HeroKuapp-Automation\\demo2\\src\\test\\resources\\Authentication_PopUP Automation code.exe");
            Thread.sleep(5000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void titleOfDigestAuthPage(String heading1)
    {
        try {
            Thread.sleep(4000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Digest Auth Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfDigestAuthPage(String content1)
    {
        try {
            Thread.sleep(4000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Digest Auth page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

