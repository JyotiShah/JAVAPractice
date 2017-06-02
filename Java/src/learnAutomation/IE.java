package learnAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IE {
	static WebDriver driver;// = new FirefoxDriver();
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.ie.driver", "\\D:\\Automation\\Jars\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		
			driver = new InternetExplorerDriver();
			driver.get("http://cybintranet/sites/home/default.aspx");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Actions builder = new Actions(driver);
			WebElement menu = driver.findElement(By.linkText("Admin"));
			builder.moveToElement(menu).build().perform();
			
			
			
			
//			driver.navigate().to("http://www.arunnathaniblog.com/");
//			String MIStitle = driver.getTitle();
			
//			if(MIStitle.equals(amazontitle)){
//				System.out.println("Same websites - Pass");
//			}else{
//				System.out.println("Different websites - Fail");
//			}
//			
			
			
	}

}
