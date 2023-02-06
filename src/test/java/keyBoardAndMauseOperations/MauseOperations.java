package keyBoardAndMauseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MauseOperations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement Fname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	    WebElement Lname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
       //Creat the instance of Actions Class
	    Actions act=new Actions(driver);
	    Fname.sendKeys("admin");
	    // Copy this First name Using Mouse operation
	   act.moveToElement(Fname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	   
	   //Paste in last name field
	   act.moveToElement(Lname).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
 
	}

}
