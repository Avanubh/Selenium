package Axis_Bank.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContextClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement doubleClickele = driver.findElement(By.xpath("//input[@id = 'double-click']"));
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(doubleClickele).perform();
		
		//Informational alerts
		
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		alert.dismiss();
		builder.contextClick(doubleClickele);
		
		

	}
}
