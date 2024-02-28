package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
 
		Thread.sleep(1000);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		WebElement dest = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/p[1]"));
 
		Actions builder = new Actions(driver);
 
		builder.dragAndDrop(src, dest).perform();
 
		System.out.println("The item dragged and dropped");

	}

}