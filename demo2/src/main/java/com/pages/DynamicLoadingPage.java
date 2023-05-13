package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DynamicLoadingPage extends HomePage {

    public DynamicLoadingPage(WebDriver rdriver) {
        super(rdriver);
    }

    By DynamicLoading_Option=By.xpath("//*[contains(text(),'Dynamic Loading')]");

    By pageTitle=By.xpath("//*[contains(text(),'Dynamically Loaded Page Elements')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'It's common to see an action get triggered that returns a ')]");

    By pageTitleOfExample1=By.xpath("//*[contains(text(),'Dynamically Loaded Page Elements')]");

    By clickOnExample1Link=By.xpath("//*[contains(text(),'Example 1: Element on page that is hidden')]");

    By clickOnExample2Link=By.xpath("//*[contains(text(),'Example 2: Element rendered after the fact')]");

    By pageContentOfExample1=By.xpath("//*[contains(text(),'Example 1: Element on page that is hidden')]");

    By clickStartButtonOnExample1AndExample2Pages=By.xpath("//*[contains(text(),'Start')]");

    By pageTitleOfExample2=By.xpath("//*[contains(text(),'Dynamically Loaded Page Elements')]");

    By pageContentOfExample2=By.xpath("//*[contains(text(),'Example 2: Element rendered after the fact')]");

    By validateTextAfterCLickingStartButtonOnExample1AndExample2Pages=By.xpath("//*[contains(text(),'Hello World!')]");

    public void clickOnDynamicLoadingLink()  {
        if(driver.findElement(DynamicLoading_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(DynamicLoading_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DynamicLoading_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDynamicLoadingPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfDynamicLoadingPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnExample1LinkOfDynamicLoadingPage()
    {
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(clickOnExample1Link));
        try {
            Thread.sleep(4000);
            driver.findElement(clickOnExample1Link).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void clickOnExample2LinkOfDynamicLoadingPage()
    {
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(clickOnExample2Link));
        try {
            Thread.sleep(4000);
            driver.findElement(clickOnExample2Link).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void titleOfExample1PageOfDynamicLoadingPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitleOfExample1).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Example 1 page of Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void titleOfExample2PageOfDynamicLoadingPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitleOfExample2).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Example 2 page of Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfExample1PageOfDynamicLoadingPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContentOfExample1).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Example 1 page of Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfExample2PageOfDynamicLoadingPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContentOfExample2).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Example 2 page of Dynamic Loading Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnStartButtonOnExample1AndExample2PagesOfDynamicLoadingPage()
    {
        try {
            Thread.sleep(4000);
            driver.findElement(clickStartButtonOnExample1AndExample2Pages).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void validateTextOnExample1PagesAfterClickingStartButton(String text1)
    {
        try {
            Thread.sleep(4000);
            String text2=driver.findElement(validateTextAfterCLickingStartButtonOnExample1AndExample2Pages).getText();
            Assert.assertEquals(text1, text2,"Text assertion is not successful on Example1/2 page of Dynamic Loading Page after clicking on Start button");
            Thread.sleep(4000);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void validateTextOnExample2PagesAfterClickingStartButton(String text1)
    {
        try {
            Thread.sleep(4000);
            String text2=driver.findElement(validateTextAfterCLickingStartButtonOnExample1AndExample2Pages).getText();
            Assert.assertNotEquals(text1, text2,"Text assertion is successful on Example1/2 page of Dynamic Loading Page after clicking on Start button");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
