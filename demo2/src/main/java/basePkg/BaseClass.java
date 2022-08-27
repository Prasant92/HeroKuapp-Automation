package basePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public BaseClass()
	{
		
	}
	
	public BaseClass(WebDriver driver)
	{
		BaseClass.driver=driver;
	}
	
	public void startBrowser(String browserName,String URL)
	{
		switch (browserName) {
		case "InternetExplorer":
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			System.out.println("From Baseclass: "+driver);
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Firefox Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			System.out.println("From Baseclass: "+driver);
			break;
		case "GoogleChrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			System.out.println("From Baseclass: "+driver);
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "D:\\Edge Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			System.out.println("From Baseclass: "+driver);
			break;
		default:
			System.out.println("Unsupported Browser");
			break;
		}
	}
}