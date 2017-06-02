package learnAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox {

	static WebDriver driver;// = new FirefoxDriver();
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}

}
