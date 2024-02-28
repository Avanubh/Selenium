package practice_automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AJAX_Loder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");

		driver.manage().window().maximize();

		// Wait for the AJAX loader to complete
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajax_loader")));
		Thread.sleep(15000);
		WebElement buttonElement = driver.findElement(By.xpath("//span[@class=\"btn btn-default btn-lg dropdown-toggle\"]"));
		buttonElement.click();

		


	}

}
