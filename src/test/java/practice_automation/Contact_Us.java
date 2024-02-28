package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		driver.manage().window().maximize();
		
		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
		
        usernameInput.sendKeys("Anubhav");
        
        usernameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
        
        usernameInput.sendKeys("Jha");
        
        usernameInput = driver.findElement(By.xpath("//input[@name='email']"));
        
        usernameInput.sendKeys("anubhavjha.cse@gmail.com");
        
        usernameInput = driver.findElement(By.xpath("//textarea[@name='message']"));
        
        usernameInput.sendKeys("Comment Here");
        
        WebElement resetButton = driver.findElement(By.xpath("//input[@type='reset' and @value='RESET']"));

     // Click the reset button
        resetButton.click();
        
        usernameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
		
        usernameInput.sendKeys("Anubhav");
        
        usernameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
        
        usernameInput.sendKeys("Jha");
        
        usernameInput = driver.findElement(By.xpath("//input[@name='email']"));
        
        usernameInput.sendKeys("anubhavjha.cse@gmail.com");
        
        usernameInput = driver.findElement(By.xpath("//textarea[@name='message']"));
        
        usernameInput.sendKeys("Comment Here");
        
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        // Click the reset button
           submitButton.click();
           //driver.quit();
	}

}
