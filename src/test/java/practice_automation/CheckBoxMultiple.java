package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxMultiple {

    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));

        
        Thread.sleep(400);
        

        for (WebElement wb : allCheckboxes) {
            wb.click();
        }

        WebElement dropdownElement = driver.findElement(By.id("dropdowm-menu-1"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Select an option by visible text
        dropdown.selectByVisibleText("SQL");
        

        // Close the browser
        driver.quit();
       
    }
}
