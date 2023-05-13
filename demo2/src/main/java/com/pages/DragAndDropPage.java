package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DragAndDropPage extends HomePage{


    public DragAndDropPage(WebDriver rdriver) {
        super(rdriver);
    }

    By DragAndDrop_Option=By.xpath("//*[contains(text(),'Drag and Drop')]");

    By pageTitle=By.xpath("//*[contains(text(),'Drag and Drop')]");

    By A_DragAndDrop=By.id("column-a");

    By B_DragAndDrop=By.id("column-b");

    public void clickOnDragAndDropPageLink()  {
        if(driver.findElement(DragAndDrop_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(DragAndDrop_Option));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(DragAndDrop_Option).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfDragAndDropPage(String heading1)
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

    public void performDragAndDropFromAtoB(String expectedTarget)
    {
        try {
            Thread.sleep(4000);
            WebElement src=driver.findElement(A_DragAndDrop);
            WebElement target=driver.findElement(B_DragAndDrop);
            Thread.sleep(4000);
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" +"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" +"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" +"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" +"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" + event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) {\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);\n" +"var dropEvent = createEvent('drop');\n" +"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" +"var dragEndEvent = createEvent('dragend');\n" +"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" +"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" +"simulateHTML5DragAndDrop(source,destination);",src,target);
            Thread.sleep(4000);
            String actualTarget=target.getText();
            Assert.assertEquals(expectedTarget, actualTarget,"Target assertion is not successful on Drag And Drop Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void performDragAndDropFromBtoA(String expectedTarget)
    {
        try {
            Thread.sleep(4000);
            WebElement src=driver.findElement(B_DragAndDrop);
            WebElement target=driver.findElement(A_DragAndDrop);
            Thread.sleep(4000);
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" +"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" +"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" +"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" +"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" + event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) {\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);\n" +"var dropEvent = createEvent('drop');\n" +"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" +"var dragEndEvent = createEvent('dragend');\n" +"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" +"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" +"simulateHTML5DragAndDrop(source,destination);",src,target);
            Thread.sleep(4000);
            String actualTarget=target.getText();
            Assert.assertEquals(expectedTarget, actualTarget,"Target assertion is not successful on Drag And Drop Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
