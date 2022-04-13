package com.pages;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileDownloadPage extends HomePage{


    private static String fileDownloadpath = "C:\\Users\\prasa\\Downloads";

    public FileDownloadPage(WebDriver rdriver) {
        super(rdriver);
    }

    By FileDownload_Option=By.xpath("//*[contains(text(),'File Download')]");

    By pageTitle=By.xpath("//*[contains(text(),'File Downloader')]");

    ArrayList<String> al=new ArrayList<String>();

    public void clickOnFileDownloadLink()  {
        if(driver.findElement(FileDownload_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(FileDownload_Option));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(FileDownload_Option).click();
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfFileDownloadPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on File Downloader Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadSelectedFile(String filename)
    {
        try {
            Thread.sleep(5000);
            List<WebElement> wb=driver.findElements(By.tagName("a"));
            Iterator<WebElement> itr=wb.iterator();
            while(itr.hasNext())
            {
                String fileName=itr.next().getAttribute("href");
                URL url=new URL(fileName);
                String fname="";
                fname=FilenameUtils.getName(url.getPath());
                if(filename.equals(fname))
                {
                    al.add(fname);
                    Thread.sleep(3000);
                    if(driver.findElement(By.xpath("//*[contains(text(),"+"'"+fname+"'"+")]")).isEnabled())
                    driver.findElement(By.xpath("//*[contains(text(),"+"'"+fname+"'"+")]")).click();
                    Thread.sleep(5000);
                    System.out.println("---------------------------------Step Passed---------------------------------");
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public boolean isFileDownloaded(String fileDownloadpath, String fileName) {
        boolean flag = false;
        File directory = new File(fileDownloadpath);
        File[] content = directory.listFiles();
        for (int i = 0; i < content.length; i++) {
            if (content[i].getName().equals(fileName))
                return flag=true;
        }
        return flag;
    }

    public void verifyDownloadedFile(String filename)
    {
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).equals(filename))
            {
                Assert.assertTrue(isFileDownloaded(fileDownloadpath,al.get(i)));
                System.out.println("---------------------------------Step Passed---------------------------------");
            }
        }
    }
}
