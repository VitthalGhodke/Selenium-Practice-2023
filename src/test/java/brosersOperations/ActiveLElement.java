package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveLElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		//Validate by default cursor is poiting  username input field
		WebElement Activeobject=driver.switchTo().activeElement();
		String activeobjplaceholder=Activeobject.getAttribute("placeholder");
		String ExpectedActiveobj="Username";
		if(activeobjplaceholder.equals(ExpectedActiveobj)) {
			System.out.println("cursor pointer validation succesful");
		}else {
			System.out.println("cursor pointer validation Unsuccesful");
		}
	//Log in without finding any element
		Activeobject.sendKeys("admin", Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager", Keys.ENTER);

	}

}
