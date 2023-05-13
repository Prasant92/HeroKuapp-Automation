package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DropdownPage extends HomePage{


    public DropdownPage(WebDriver rdriver) {
        super(rdriver);
    }

    By Dropdown_Option=By.xpath("//a[@href='/dropdown']");

    By pageTitle=By.xpath("//*[contains(text(),'Dropdown List')]");

    By clickDropdown=By.xpath("//select[@id='dropdown']");

    By selectOption1=By.xpath("//*[contains(text(),'Option 1')]");

    By selectOption2=By.xpath("//*[contains(text(),'Option 2')]");

    public void clickOnDropdownPageLink()  {
        if(driver.findElement(Dropdown_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(Dropdown_Option));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(Dropdown_Option).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDropdownPage(String heading1)
    {
        try {
            Thread.sleep(4000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Drag And Drop Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnDropdown()
    {
        try {
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(clickDropdown));
            driver.findElement(clickDropdown).click();
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectFirstOptionFromDropdown()
    {
        try {
            driver.findElement(selectOption1).click();
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectSecondOptionFromDropdown()
    {
        try {
            driver.findElement(selectOption2).click();
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
