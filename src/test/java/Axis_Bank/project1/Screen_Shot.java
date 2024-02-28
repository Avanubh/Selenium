package Axis_Bank.project1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		// Take screenshot
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Specify the path where you want to save the screenshot
	    String screenshotPath = "E:\\Volume E\\screenshot.png"; // Change the path as needed

	    // Copy the screenshot to the desired location
	    FileUtils.copyFile(screenshotFile, new File(screenshotPath));

	    driver.quit();
		
		
	}

}
