package myjavaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		String appURL = "https://www.google.com"; 
		driver.get(appURL);
				
	}

}
