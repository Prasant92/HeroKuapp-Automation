package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DynamicContentPage extends HomePage {

    public DynamicContentPage(WebDriver rdriver) {
        super(rdriver);
    }

    By DynamicContent_Option=By.xpath("//*[contains(text(),'Dynamic Content')]");

    By pageTitle=By.xpath("//*[contains(text(),'Dynamic Content')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'This example demonstrates the ever-evolving nature of content by loading new text and images on each page refresh.')]");

    By clickHereToChangeContentOnPage=By.xpath("//*[contains(text(),'click here')]");

    public void clickOnDynamicContentLink()  {
        if(driver.findElement(DynamicContent_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(DynamicContent_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DynamicContent_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDynamicContentPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Dynamic Content Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfDynamicContentPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Dynamic Content Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickToChangePageContentOfDynamicContentPage(int n)
    {
        int i=1;
        while(i<=n)
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(clickHereToChangeContentOnPage));
            driver.findElement(clickHereToChangeContentOnPage).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int a=1;
            for(;a<=3;a++)
            {
                int b=1;
                String img=driver.findElement(By.xpath("//div[@class='example']/div/div/div["+a+"]/div["+b+"]/img")).getAttribute("src");
                int c=2;
                String img_desc= driver.findElement(By.xpath("//div[@class='example']/div/div/div["+a+"]/div["+c+"]")).getText();
                System.out.println("Image is "+img+" and its description is "+img_desc);
            }
            i++;
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
