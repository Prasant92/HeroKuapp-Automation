package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FileUploadPage extends HomePage{

    By FileUpload_Option=By.xpath("//*[contains(text(),'File Upload')]");

    By pageTitle=By.xpath("//*[contains(text(),'File Uploader')]");

    By pageTitleDefinition=By.xpath("//*[contains(text(), 'Choose a file on your system and then click upload. Or, drag and drop a file into the area below.')]");

    By performFileUploadingAction=By.id("file-upload");

    public FileUploadPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnFileUploadLink()  {
        if(driver.findElement(FileUpload_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
            w.until(ExpectedConditions.elementToBeClickable(FileUpload_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(FileUpload_Option).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfFileUploadPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on File Uploader page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfFileUploadPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageTitleDefinition).getText();
            Assert.assertEquals(content1, content2,"Page content assertion is not successful on File Upload Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uploadFileOnFileUploadPageLink()
    {
        try {
            Thread.sleep(5000);
            WebElement  wb= driver.findElement(performFileUploadingAction);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",wb);
            Runtime.getRuntime().exec("C:\\Users\\prasa\\git\\repository\\demo2\\src\\test\\resources\\File_Uploading Automation code.exe");
            Thread.sleep(5000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public void uploadFileUsingDragAndDropFeature()
    {
        try {
            WebElement droparea = driver.findElement(By.cssSelector("#holder"));
            Thread.sleep(5000);
            DropFile(new File("C:\\Users\\prasa\\git\\repository\\demo2\\src\\test\\resources\\LambdaTest.txt"), droparea, 0, 0);
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("---------------------------------Step Passed---------------------------------");
    }

    public static void DropFile(File filePath, WebElement target, int offsetX, int offsetY) throws InterruptedException {
        if(!filePath.exists())
            throw new WebDriverException("File not found: " + filePath);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        String JS_DROP_FILE =
                "var target = arguments[0]," +
                        "    offsetX = arguments[1]," +
                        "    offsetY = arguments[2]," +
                        "    document = target.ownerDocument || document," +
                        "    window = document.defaultView || window;" +
                        "" +
                        "var input = document.createElement('INPUT');" +
                        "input.type = 'file';" +
                        "input.style.display = 'none';" +
                        "input.onchange = function () {" +
                        "  var rect = target.getBoundingClientRect()," +
                        "      x = rect.left + (offsetX || (rect.width >> 1))," +
                        "      y = rect.top + (offsetY || (rect.height >> 1))," +
                        "      dataTransfer = { files: this.files };" +
                        "" +
                        "  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
                        "    var evt = document.createEvent('MouseEvent');" +
                        "    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
                        "    evt.dataTransfer = dataTransfer;" +
                        "    target.dispatchEvent(evt);" +
                        "  });" +
                        "" +
                        "  setTimeout(function () { document.body.removeChild(input); }, 25);" +
                        "};" +
                        "document.body.appendChild(input);" +
                        "return input;";

        WebElement input =  (WebElement)jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
        input.sendKeys(filePath.getAbsoluteFile().toString());
        wait.until(ExpectedConditions.stalenessOf(input));
        Thread.sleep(5000);
    }
}
