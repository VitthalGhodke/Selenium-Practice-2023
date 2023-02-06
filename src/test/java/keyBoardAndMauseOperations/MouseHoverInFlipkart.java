package keyBoardAndMauseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverInFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		// Pop Handle Using escap btn
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);// body is tagname
		
		// Find Element
		List<WebElement> Menu = driver.findElements(By.cssSelector("div[class='_37M3Pb']>div>a>*:nth-child(2)"));
		
		// Creat instance of Actions Class
		Actions act = new Actions(driver);
		System.out.println("Element size:" + Menu.size());

		// Hover the mouse on all element using foe loop
		for (int i = 0; i <= Menu.size() - 1; i++) {
			WebElement option = Menu.get(i);
			act.moveToElement(option).build().perform();
			Thread.sleep(1000);
			System.out.println("Menu name:"+i+" "+option.getText());
		}
		
	 

	}

}
