package Axis_Bank.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_selector {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement Date = driver.findElement(By.xpath("//label[@for='departure']"));
		
		Thread.sleep(500);
		
		Date.click();
		
		WebElement dateElement = driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Tue Feb 27 2024']"));
		dateElement.click();
		
		
	}
}
