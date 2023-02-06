package keyBoardAndMauseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MauseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		// Find Element
		List<WebElement> Menu = driver.findElements(By.cssSelector("div#menu>ul>li"));
		// Creat instance of Actions Class
		Actions act = new Actions(driver);
		System.out.println("Element size:" + Menu.size());

		// Hover the mouse on all element using foe loop
		for (int i = 0; i <= Menu.size() - 1; i++) {
			WebElement option = Menu.get(i);
			act.moveToElement(option).build().perform();
			Thread.sleep(1000);
		}

		// Mouse_Hover(act, Menu);
	}

	// Method for mouse hover
	static void Mouse_Hover(Actions act, List<WebElement> Menu) throws InterruptedException {
		for (int i = 0; i <= Menu.size() - 1; i++) {
			WebElement option = Menu.get(i);
			act.moveToElement(option).build().perform();
			Thread.sleep(1000);
		}
	}

}
