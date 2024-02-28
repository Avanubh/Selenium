package practice_automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click_Button {
	public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
        driver.manage().window().maximize();

        // Click the button that triggers the Pop-up
        WebElement triggerButton = driver.findElement(By.xpath("//span[@id=\"button1\"]"));
        triggerButton.click();

        // Wait for the Pop-up to be displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[3]/button[1]")));

        // Click the close button on the Pop-up
        WebElement closeButton = popup.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[3]/button[1]"));
        closeButton.click();
        
        Thread.sleep(900);
        
     // Take screenshot
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Specify the path where you want to save the screenshot
	    String screenshotPath = "E:\\Volume E\\screenshot.png"; // Change the path as needed

	    // Copy the screenshot to the desired location
	    FileUtils.copyFile(screenshotFile, new File(screenshotPath));
        
        //BUTTON 2
        
        triggerButton = driver.findElement(By.cssSelector("#button2"));
        triggerButton.click();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(18));
        popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/div[3]/button[1]")));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", closeButton);
        
        //Button 3
        
        triggerButton = driver.findElement(By.xpath("//span[@id=\"button3\"]"));
        triggerButton.click();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(18));
        popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[6]/div[1]/div[1]/div[3]/button[1]")));

        closeButton = popup.findElement(By.xpath("//body/div[1]/div[6]/div[1]/div[1]/div[3]/button[1]"));
        
        driver.quit();
    }
}
