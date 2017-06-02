package learnAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowser {
	
		static WebDriver driver;// = new FirefoxDriver();
		static WebDriverWait wait;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\D:\\Automation\\Jars\\chromedriver_win32_2.25\\chromedriver.exe");

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String appURL = "https://www.google.co.in/"; //"D:\Automation\Jars\chromedriver_win32_2.25\chromedriver.exe"
		driver.get(appURL);
		
	}

}
