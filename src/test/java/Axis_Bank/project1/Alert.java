package Axis_Bank.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
		infoalt.click();
		Thread.sleep(500);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement confoalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
		confoalt.click();
		Thread.sleep(500);
		
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		WebElement proalt = driver.findElement(By.xpath("//input[@name='prompt']"));
		infoalt.click();
		Thread.sleep(500);
		
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();
		
	}

}