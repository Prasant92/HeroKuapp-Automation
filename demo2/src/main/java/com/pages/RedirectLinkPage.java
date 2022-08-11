package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.Key;
import java.util.List;

public class RedirectLinkPage extends HomePage{

    By RedirectLink_Option=By.xpath("//*[contains(text(),'Redirect Link')]");

    By pageTitle=By.xpath("//*[contains(text(),'Redirection')]");

    By clickOnHereHyperlink=By.xpath("//a[@id='redirect']");

    By pageTitleOfStatusCode=By.xpath("//*[contains(text(),'Status Codes')]");

    By clickOnHereHyperlinkToViewAllHTTPCodes=By.xpath("//a[@href='http://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml']");

    By pageContentFor200Code=By.xpath("//*[contains(text(),'Status Codes')]");

    By pageContentFor301Code=By.xpath("//*[contains(text(),'Status Codes')]");

    By pageContentFor404Code=By.xpath("//*[contains(text(),'Status Codes')]");

    By pageContentFor500Code=By.xpath("//*[contains(text(),'Status Codes')]");

    By clickHereToGotoStatusCodePage=By.xpath("//a[@href='/status_codes']");


    public RedirectLinkPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnRedirectLinkLink()  {
        if(driver.findElement(RedirectLink_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(RedirectLink_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(RedirectLink_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfRedirectLinkPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Redirect Link Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfStatusCodePage(String heading1)
    {
        try {
            driver.findElement(clickOnHereHyperlink).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            String heading2=driver.findElement(pageTitleOfStatusCode).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Status Code Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void viewAllTheHTTPCodes()
    {
        try {
            driver.findElement(clickOnHereHyperlink).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            driver.findElement(clickOnHereHyperlinkToViewAllHTTPCodes).sendKeys(Keys.ENTER);
            Thread.sleep(15000);
            WebElement table=driver.findElement(By.xpath("//table[@id='table-http-status-codes-1']/tbody"));
            List<WebElement> tab_rows=table.findElements(By.tagName("tr"));
            for(int i=0;i<tab_rows.size();i++)
            {
                List<WebElement> tab_cells=tab_rows.get(i).findElements(By.tagName("td"));
                for(int j=0;j<tab_cells.size();j++)
                {
                    System.out.print(tab_cells.get(j).getText()+" ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewAndRetrieveStatusCodes(String code,String content)
    {
       try {
           driver.findElement(clickOnHereHyperlink).sendKeys(Keys.ENTER);
           Thread.sleep(3000);
        for(int i=1;i<5;i++)
        {
            String st="";
            st=driver.findElement(By.xpath("//div[@class='example']/ul/li["+i+"]")).getText();
            if(code.equals(st)){
                switch(st)
                {
                    case "200":
                        driver.findElement(By.xpath("//div[@class='example']/ul/li[1]/a")).click();
                        Thread.sleep(3000);
                        contentOfStatusCodesPageFor200(content);
                        clickHereToRedirectToStatusCodePage();
                        break;
                    case "301":
                        driver.findElement(By.xpath("//div[@class='example']/ul/li[2]/a")).click();
                        Thread.sleep(3000);
                        contentOfStatusCodesPageFor301(content);
                        clickHereToRedirectToStatusCodePage();
                        break;
                    case "404":
                        driver.findElement(By.xpath("//div[@class='example']/ul/li[3]/a")).click();
                        Thread.sleep(3000);
                        contentOfStatusCodesPageFor404(content);
                        clickHereToRedirectToStatusCodePage();
                        break;
                    case "500":
                        driver.findElement(By.xpath("//div[@class='example']/ul/li[4]/a")).click();
                        Thread.sleep(3000);
                        contentOfStatusCodesPageFor500(content);
                        clickHereToRedirectToStatusCodePage();
                        break;
                }
            }
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void contentOfStatusCodesPageFor200(String content1)
    {
        try {
            Thread.sleep(3000);
            String content2=driver.findElement(pageContentFor200Code).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Status Codes Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void contentOfStatusCodesPageFor301(String content1)
    {
        try {
            Thread.sleep(3000);
            String content2=driver.findElement(pageContentFor301Code).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Status Codes Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void contentOfStatusCodesPageFor404(String content1)
    {
        try {
            Thread.sleep(3000);
            String content2=driver.findElement(pageContentFor404Code).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Status Codes Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void contentOfStatusCodesPageFor500(String content1)
    {
        try {
            Thread.sleep(3000);
            String content2=driver.findElement(pageContentFor500Code).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Status Codes Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void clickHereToRedirectToStatusCodePage() {
        try {
            Thread.sleep(3000);
            driver.findElement(clickHereToGotoStatusCodePage).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
