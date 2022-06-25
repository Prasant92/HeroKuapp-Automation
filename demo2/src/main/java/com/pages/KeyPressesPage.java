package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KeyPressesPage extends  HomePage{

    By KeyPresses_Option=By.xpath("//*[contains(text(),'Key Presses')]");

    By pageTitle=By.xpath("//*[contains(text(),'Key Presses')]");

    By pageContent=By.xpath("//*[contains(text(),'Key presses are often used to interact with a website (e.g., tab order, enter, escape, etc.). Press a key and see what you inputted.')]");

    By textBox=By.xpath("//input[@id='target']");

    By resultOfKeyPressed=By.xpath("//p[@id='result']");

    public KeyPressesPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnKeyPressesLink()  {
        if(driver.findElement(KeyPresses_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(KeyPresses_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(KeyPresses_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfKeyPressesPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Key Presses Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfKeyPressesPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Key Presses Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void populateAndVerifyEnteredTextIntoTextBox(String text)  {
        char[] ch={};
        ch=text.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            try {
                String s="";
                s=Character.toString(ch[i]);
                driver.findElement(textBox).sendKeys(s);
                Thread.sleep(3000);
                String st="";
                st=driver.findElement(KeyPresses_Option).getText();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }
}
