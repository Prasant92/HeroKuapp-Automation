package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesPage extends FramesPage{

    By NestedFrames_Option=By.xpath("//*[contains(text(),'Nested Frames')]");

    public NestedFramesPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnNestedFramesLink()  {
        if(driver.findElement(NestedFrames_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(NestedFrames_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(NestedFrames_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }
}
