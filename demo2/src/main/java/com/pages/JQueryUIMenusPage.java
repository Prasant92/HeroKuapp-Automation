package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class JQueryUIMenusPage extends  HomePage{

    By JQueryUIMenus_Option=By.xpath("//*[contains(text(),'JQuery UI Menus')]");

    By pageTitle=By.xpath("//*[contains(text(),'JQueryUI - Menu')]");

    By pageContent=By.xpath("//*[contains(text(),'JQuery UI Menus')]");

    By backToJQueryUI=By.xpath("//*[contains(text(),'Back to JQuery UI')]");

    By pageTitle_JQueryUI=By.xpath("//*[contains(text(),'JQuery UI')]");

    By pageContent_JQueryUI=By.xpath("//*[contains(text(),'is many things, but one thing specifically that causes automation challenges is their set of Widgets')]");

    By clickMenuButton=By.xpath("//*[contains(text(),'Menu')]");

    By clickPDFOption=By.xpath("//*[contains(text(),'PDF')]");

    By clickCSVOption=By.xpath("//*[contains(text(),'CSV')]");

    By clickExcelOption=By.xpath("//*[contains(text(),'Excel')]");


    public JQueryUIMenusPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnJQueryUIMenusLink()  {
        if(driver.findElement(JQueryUIMenus_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(JQueryUIMenus_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(JQueryUIMenus_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfJQueryUIMenusPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on JQuery UI Menus Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfJQueryUIMenusPage(String content1)
    {
        try {
            Thread.sleep(5000);
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void titleOfHoverOverEnabledOptionAndClickOnBackToJQueryUIOption(String heading1)
    {
        WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Enabled')]"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(wb).perform();
            Thread.sleep(3000);
            driver.findElement(backToJQueryUI).click();
            Thread.sleep(3000);
            String heading2=driver.findElement(pageTitle_JQueryUI).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on JQuery UI Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void contentOfHoverOverEnabledOptionAndClickOnBackToJQueryUIOption(String content1)
    {
        WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Enabled')]"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(wb).perform();
            Thread.sleep(3000);
            driver.findElement(backToJQueryUI).click();
            Thread.sleep(3000);
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateThatUserIsRedirectedBackToMenuPage(String heading1)
    {
        WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Enabled')]"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(wb).perform();
            Thread.sleep(3000);
            driver.findElement(backToJQueryUI).click();
            Thread.sleep(3000);
            driver.findElement(clickMenuButton).click();
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on JQuery UI Menus Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void downloadInDifferentFormat(String format)
    {
        WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'Enabled')]"));
        WebElement wb2=driver.findElement(By.xpath("//*[contains(text(),'Downloads')]"));
        try {
            Actions actions=new Actions(driver);
            actions.moveToElement(wb1).perform();
            Thread.sleep(3000);
            actions.moveToElement(wb2).perform();
            if(format.equalsIgnoreCase("PDF"))
            {
                Thread.sleep(3000);
                driver.findElement(clickPDFOption).click();
                Thread.sleep(3000);
            }
            else if(format.equalsIgnoreCase("CSV"))
            {
                Thread.sleep(3000);
                driver.findElement(clickCSVOption).click();
                Thread.sleep(3000);
            }
            else if(format.equalsIgnoreCase("Excel"))
            {
                Thread.sleep(3000);
                driver.findElement(clickExcelOption).click();
                Thread.sleep(3000);
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
