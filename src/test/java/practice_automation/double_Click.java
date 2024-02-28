package practice_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_Click {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Actions/index.html#");
        driver.manage().window().maximize();

        WebElement elementToDoubleClick = driver.findElement(By.id("double-click"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Double click on the element
        actions.doubleClick(elementToDoubleClick).perform();

        // Close the browser
        driver.quit();
    }

}
