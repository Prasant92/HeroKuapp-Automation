package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class LargeAndDeepDOMPage extends HomePage{

    By LargeAndDeepDOM_Option=By.xpath("//*[contains(text(),'Large & Deep DOM')]");

    By pageTitle=By.xpath("//*[contains(text(),'Large & Deep DOM')]");

    By pageContent=By.xpath("//*[contains(text(),'Some pages have very large and deeply nested page layouts, which can trigger odd rendering issues and test performance bottlenecks (depending on your locator strategy). These examples are nested 50 levels deep.')]");

    By tabHeader=By.xpath("//table[@id='large-table']/thead");

    By tableContent=By.xpath("//table[@id='large-table']/tbody");

    public LargeAndDeepDOMPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void clickOnLargeAndDeepDOMLink()  {
        if(driver.findElement(LargeAndDeepDOM_Option).isEnabled())
        {
            WebDriverWait w=new WebDriverWait(driver, 10);
            w.until(ExpectedConditions.elementToBeClickable(LargeAndDeepDOM_Option));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(LargeAndDeepDOM_Option).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------------------------Step Passed---------------------------------");
        }
    }

    public void titleOfLargeAndDeepDOMPage(String heading1)
    {
        try {
            Thread.sleep(5000);
            String heading2=driver.findElement(pageTitle).getText();
            Assert.assertEquals(heading1, heading2,"Page title assertion is not successful on Large And Deep DOM Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contentOfLargeAndDeepDOMPage(String content1)
    {
        try {
            Thread.sleep(5000);
            String content2=driver.findElement(pageContent).getText();
            Assert.assertEquals(content1, content2,"Page title assertion is not successful on Large And Deep DOM Page");
            System.out.println("---------------------------------Step Passed---------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void retrieveSiblings(String x)
    {
        try {
            Thread.sleep(3000);
            for(int y=1;y<=3;y++)
            {
                System.out.println(driver.findElement(By.xpath("//div[@id="+"'sibling-"+x+"."+y+"'"+"]")).getText());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void retrieveTableHeader()
    {
        WebElement tabHead= driver.findElement(tabHeader);
        List<WebElement> tr=tabHead.findElements(By.tagName("tr"));
        for(int i=0;i<tr.size();i++)
        {
            List<WebElement> th=tr.get(i).findElements(By.tagName("th"));
            for(int j=0;j<th.size();j++)
            {
                System.out.println(th.get(j).getText()+" ");
            }
            System.out.println();
        }
    }

    public void retrieveTableContent()
    {
        WebElement table=driver.findElement(tableContent);
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
    }

    public void retrieveSpecificValueFromTable(String num)
    {
        WebElement table=driver.findElement(tableContent);
        List<WebElement> tab_rows=table.findElements(By.tagName("tr"));
        for(int i=0;i<tab_rows.size();i++)
        {
            List<WebElement> tab_cells=tab_rows.get(i).findElements(By.tagName("td"));
            for(int j=0;j<tab_cells.size();j++)
            {
                if(num.equals(tab_cells.get(j).getText())) {
                    System.out.println(tab_cells.get(j).getText());
                }
            }
        }
    }

    public void retrieveAllCellValuesForSpecificRow(String row)
    {
        WebElement tab_row=driver.findElement(By.xpath("//table[@id='large-table']/tbody/tr["+row+"]"));
        List<WebElement> tab_cells=tab_row.findElements(By.tagName("td"));
        for(int j=0;j<tab_cells.size();j++)
        {
            System.out.print(tab_cells.get(j).getText()+" ");
        }
    }

    public void retrieveAllColValuesForSpecificCol(String col)
    {
        WebElement table=driver.findElement(tableContent);
        List<WebElement> tab_row=table.findElements(By.tagName("tr"));
        for(int i=1;i<tab_row.size();i++)
        {
            System.out.print(driver.findElement(By.xpath("//table[@id='large-table']/tbody/tr["+i+"]/td["+col+"]")).getText());
        }
        System.out.println();
    }
}
