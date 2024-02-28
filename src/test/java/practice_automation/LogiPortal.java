package practice_automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogiPortal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		driver.manage().window().maximize();
	        
	        
	        WebElement usernameInput = driver.findElement(By.id("text"));
	        usernameInput.sendKeys("AnubhavJha");
	        
			WebElement passwordInput = driver.findElement(By.id("password"));
			passwordInput.sendKeys("PASSWORD");
			
			WebElement loginButton = driver.findElement(By.id("login-button"));
			
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		    // Specify the path where you want to save the screenshot
		    String screenshotPath = "E:\\Volume E\\screenshot.png"; // Change the path as needed

		    // Copy the screenshot to the desired location
		    FileUtils.copyFile(screenshotFile, new File(screenshotPath));
			
			Thread.sleep(1000);
			
			loginButton.click();
			Alert alert = driver.switchTo().alert();

		    // Click the OK button on the alert
		    alert.accept();

		    
		    // Switch back to the main window
		    driver.switchTo().defaultContent();
		    
		    Thread.sleep(1000);
			
		    
			driver.quit();
			
			

	}

}
