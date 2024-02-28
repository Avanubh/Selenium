package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		
		driver.manage().window().maximize();
 
		Thread.sleep(1000);
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0 , 800)", "");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0 , -800)", "");
		 Thread.sleep(1000);
		 
		 WebElement scroll=driver.findElement(By.xpath("//div[@id='zone4']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		 
		 Thread.sleep(1000);
			
		 driver.quit();

	}

}
