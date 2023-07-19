package base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	private File file;
	private FileInputStream fi;
	private String browser;
	private String url;
	private int time;
	
	private WebDriver driver;
	
	public WebDriver openBrowser(String propertiesPathName) throws Exception {
		file = new File(propertiesPathName);
		fi = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fi);
		
		browser = prop.getProperty("Browser");
		url = prop.getProperty("URL");
		time = Integer.parseInt(prop.getProperty("ImplicitWait"));
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Web Browser name not found");
			driver = null;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	
	public WebDriver closeAllWindows(WebDriver cDriver) {
		cDriver.quit();
		return cDriver;
	}
	
	public WebDriver closeCurrentWindow(WebDriver cDriver) {
		cDriver.close();
		return cDriver;
	}
	
}
