package Axis_Bank.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	 public static void main(String[] args) throws InterruptedException {
		    
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\Manipal\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.facebook.com/login/");

		 driver.manage().window().maximize();

		 Thread.sleep(500);

		 JavascriptExecutor js = (JavascriptExecutor)driver;

		 js.executeScript("window.scrollBy(0 , 800)", "");

		 js.executeScript("window.scrollBy(0 , -400)", "");

		 Thread.sleep(500);

		 js.executeScript("window.scrollBy(200 , 0)", "");

		 js.executeScript("window.scrollBy(-300 , 0)", "");

		 WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));

		 js.executeScript("arguments[0].scrollIntoView(true);", ele);

		        
		        
		        
		        
		 
		 
	 }

}
