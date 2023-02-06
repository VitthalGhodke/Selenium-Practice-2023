package keyBoardAndMauseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPaste {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement Fname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		Fname.sendKeys("admin", Keys.chord(Keys.CONTROL,"a"));
		Fname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
        WebElement Lname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        Lname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
