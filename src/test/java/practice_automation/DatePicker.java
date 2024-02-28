package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Datepicker/index.html");

		driver.manage().window().maximize();

		WebElement datepickerInput = driver.findElement(By.xpath("//td[@data-day='15' and @data-month='4' and @data-year='2022']"));
		

		datepickerInput.click();

		datepickerInput.sendKeys("02/01/2024");

		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();

		datepickerInput.click();

		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		// Close the browser
		driver.quit();

		
	}
}
