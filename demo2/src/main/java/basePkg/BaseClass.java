package basePkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

	public static WebDriver driver;
	String host = System.getProperty("host", "localhost");
	public BaseClass()
	{
		
	}
	
	public BaseClass(WebDriver driver)
	{
		BaseClass.driver=driver;
	}
	
	public void startBrowser(String browserName, String URL, String mName)
	{
		switch (host) {
			case "saucelabs": {
				MutableCapabilities mutableCapabilities = new MutableCapabilities();
				mutableCapabilities.setCapability("username", System.getenv("SAUCE_USERNAME"));
				mutableCapabilities.setCapability("accessKey", System.getenv("SAUCE_ACCESS_KEY"));
				mutableCapabilities.setCapability("build", "selenium-build-UVQ2C");
				mutableCapabilities.setCapability("name", mName);

				DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
				desiredCapabilities.setCapability("sauce:options", mutableCapabilities);
				desiredCapabilities.setCapability("browserVersion", "latest");
				desiredCapabilities.setCapability("platformName", "windows 10");
				switch (browserName) {

					case "Firefox":
						WebDriverManager.firefoxdriver().setup();
						desiredCapabilities.setCapability("browserName", "firefox");
						break;

					case "GoogleChrome":
						WebDriverManager.chromedriver().setup();
						desiredCapabilities.setCapability("browserName", "chrome");
						break;

					case "Edge":
						WebDriverManager.edgedriver().setup();
						desiredCapabilities.setCapability("browserName", "MicrosoftEdge");
						break;

					default:
						System.out.println("Unsupported Browser");
						break;
				}

				try {
					driver = new RemoteWebDriver(new URL("https://oauth-prshntmalhotra19-563df:822cedda-47bb-432d-9328-93ddb5736e7b@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), desiredCapabilities);
					loginWithBrowser(URL);
				} catch (MalformedURLException e) {
					throw new RuntimeException(e);
				}
				break;
			}

			case "localhost": {
				switch (browserName) {
					case "Firefox":
						System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\FirefoxDrivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
						driver=new FirefoxDriver();
						driver.get(URL);
						driver.manage().window().maximize();
						System.out.println("From Baseclass: "+driver);
						break;
					case "GoogleChrome":
						ChromeOptions chromeOptions = new ChromeOptions();
						chromeOptions.addArguments("--remote-allow-origins=*");
						System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDrivers\\chromedriver_win32_113v\\chromedriver.exe");
						driver=new ChromeDriver(chromeOptions);
						driver.get(URL);
						driver.manage().window().maximize();
						System.out.println("From Baseclass: "+driver);
						break;
					case "Edge":
						EdgeOptions edgeOptions = new EdgeOptions();
						edgeOptions.addArguments("--remote-allow-origins=*");
						System.setProperty("webdriver.edge.driver", "src\\test\\resources\\EdgeDrivers\\edgedriver_win64_112\\msedgedriver.exe");
						driver=new EdgeDriver(edgeOptions);
						driver.get(URL);
						driver.manage().window().maximize();
						System.out.println("From Baseclass: "+driver);
						break;
					default:
						System.out.println("Unsupported Browser");
						break;
				}
				break;
			}
		}

	}

	protected void loginWithBrowser(String URL){
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("From Baseclass: "+driver);
	}
}