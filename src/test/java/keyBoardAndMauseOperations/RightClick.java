package keyBoardAndMauseOperations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		// Find Element uniqely
		WebElement Menu = driver.findElement(By.cssSelector("li#menu-item-1513"));
		// Creat instance of Actions Class
		Actions act = new Actions(driver);
		
		//Mouse Hover on that element
		act.moveToElement(Menu).build().perform();
		Thread.sleep(3000);
		
		//Right Click on that element
		//act.moveToElement(Menu).contextClick().build().perform();
             //OR
		act.contextClick(Menu).build().perform();
		

	}

}
