package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DisappearingElementsPage extends HomePage{


    public DisappearingElementsPage(WebDriver rdriver) {
        super(rdriver);
    }

    By DisappearingElements_Option=By.xpath("//*[contains(text(),'Disappearing Elements')]");

    By pageTitle=By.xpath("//*[contains(text(),'Disappearing Elements')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'This example demonstrates when elements on a page change by disappearing/reappearing on each page load.')]");

    By DisappearingElements_HomeLink= By.xpath("//div[@id='content']/div/ul/li[1]/a");

    By DisappearingElements_AboutLink= By.xpath("//div[@id='content']/div/ul/li[2]/a");

    By DisappearingElements_ContactUs= By.xpath("//div[@id='content']/div/ul/li[3]/a");

    By DisappearingElements_PortfolioLink= By.xpath("//div[@id='content']/div/ul/li[4]/a");

    By ResultOfEveryPage=By.xpath("//*[contains(text(),'Not Found')]");

    public void clickOnDisappearingElementsPageLink()  {
        if(driver.findElement(DisappearingElements_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(DisappearingElements_Option));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DisappearingElements_Option).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDisappearingElementsPage(String heading1)
    {
        try {
            Thread.sleep(4000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Disappearing Elements Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfDisappearingElementsPage(String content1)
    {
        try {
            Thread.sleep(4000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Disappearing Elements page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnAboutLinkOfDisappearingElementsPage(String content1)
    {
        try {
            Thread.sleep(8000);
            String getURL=driver.getCurrentUrl();
            driver.findElement(DisappearingElements_AboutLink).click();
            Thread.sleep(3000);
            String content2=driver.findElement(ResultOfEveryPage).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on About page of Disappearing Elements functionality");
            driver.get(getURL);
            Thread.sleep(8000);
            WebDriverWait w2=new WebDriverWait(driver, 10);
            w2.until(ExpectedConditions.elementToBeClickable(DisappearingElements_AboutLink));
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnContactUSLinkOfDisappearingElementsPage(String content1)
    {
        try {
            Thread.sleep(8000);
            String getURL=driver.getCurrentUrl();
            driver.findElement(DisappearingElements_ContactUs).click();
            Thread.sleep(3000);
            String content2=driver.findElement(ResultOfEveryPage).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Contact Us page of Disappearing Elements functionality");
            driver.get(getURL);
            Thread.sleep(8000);
            WebDriverWait w2=new WebDriverWait(driver, 10);
            w2.until(ExpectedConditions.elementToBeClickable(DisappearingElements_ContactUs));
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnPortfolioLinkOfDisappearingElementsPage(String content1)
    {
        try {
            WebDriverWait w1=new WebDriverWait(driver, 10);
            w1.until(ExpectedConditions.elementToBeClickable(DisappearingElements_PortfolioLink));
            String getURL=driver.getCurrentUrl();
            driver.findElement(DisappearingElements_PortfolioLink).click();
            Thread.sleep(3000);
            String content2=driver.findElement(ResultOfEveryPage).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Portfolio page of Disappearing Elements functionality");
            driver.get(getURL);
            Thread.sleep(8000);
            WebDriverWait w2=new WebDriverWait(driver, 10);
            w2.until(ExpectedConditions.elementToBeClickable(DisappearingElements_PortfolioLink));
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnHomeLinkOfDisappearingElementsPage(String content1)
    {
        try {
            WebDriverWait w1=new WebDriverWait(driver, 10);
            w1.until(ExpectedConditions.elementToBeClickable(DisappearingElements_HomeLink));
            String getURL=driver.getCurrentUrl();
            driver.findElement(DisappearingElements_HomeLink).click();
            Thread.sleep(3000);
            String content2=driver.findElement(homepage_Header).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Home page of Disappearing Elements functionality");
            driver.get(getURL);
            Thread.sleep(8000);
            WebDriverWait w2=new WebDriverWait(driver, 10);
            w2.until(ExpectedConditions.elementToBeClickable(DisappearingElements_HomeLink));
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
