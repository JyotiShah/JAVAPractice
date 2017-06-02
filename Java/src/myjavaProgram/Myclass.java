package myjavaProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myclass {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.google.com";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
    }
}