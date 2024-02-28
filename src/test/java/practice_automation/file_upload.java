package practice_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class file_upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		// Find the file input element
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='myFile']"));
		
		fileInput.sendKeys("E:\\upload.pdf");
		
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();

		Alert alert = driver.switchTo().alert();

	    // Click the OK button on the alert
	    alert.accept();

	    // Switch back to the main window
	    driver.switchTo().defaultContent();

	    // Close the browser
	    //driver.quit();

	}

}
