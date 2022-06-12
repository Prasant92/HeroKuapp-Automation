package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HorizontalSliderPage extends HomePage{

    By HorizontalSlider_Option=By.xpath("//*[contains(text(),'Horizontal Slider')]");

    By pageTitle=By.xpath("//*[contains(text(),'Horizontal Slider')]");

    By pageContent=By.xpath("//*[contains(text(),'Set the focus on the slider (by clicking on it) and use the arrow keys to move it right and left. Or click and drag the slider with your mouse. It will indicate the value of the slider to the right.')]");

    By sliderOption=By.xpath("//div[@class='sliderContainer']/input");


    public HorizontalSliderPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnHorizontalSliderLink()  {
        if(driver.findElement(HorizontalSlider_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(HorizontalSlider_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(HorizontalSlider_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfHorizontalSliderPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Horizontal Slider Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfHorizontalSliderPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on Horizontal Slider Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moveSliderHorizontallyFromLeftToRight(double value)
    {
        WebElement ele =driver.findElement(sliderOption);
        Actions actions=new Actions(driver);
        int width=ele.getSize().width;
        actions.dragAndDropBy(ele, (int) (width+value),0);
        actions.build().perform();
        actions.dragAndDropBy(ele, (int) value,0);
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void moveSliderHorizontallyFromRightToLeft(double value)
    {
        WebElement ele =driver.findElement(sliderOption);
        Actions actions=new Actions(driver);
        int width=ele.getSize().width;
        actions.dragAndDropBy(ele, -(int) (width+value),0);
        actions.build().perform();
        actions.dragAndDropBy(ele, -(int) value,0);
        System.out.println("---------------------------------Step Passed---------------------------------");
    }
}
