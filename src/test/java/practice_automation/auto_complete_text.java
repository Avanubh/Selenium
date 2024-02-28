package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_complete_text {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.manage().window().maximize();
		
		WebElement userInput = driver.findElement(By.id("myInput"));
		userInput.sendKeys("Cabbage");
		
		WebElement submitButton = driver.findElement(By.id("submit-button"));

        // Click the reset button
           submitButton.click();
		
		
		
		
		
	}

}
