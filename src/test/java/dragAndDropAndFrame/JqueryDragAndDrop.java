package dragAndDropAndFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch your control to frame using Webelement
		WebElement Frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(Frame);
		   //or
     //driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
	//Creat the instance of Actions Class
		Actions act=new Actions(driver);
	//Find source and target 	
		WebElement src=driver.findElement(By.cssSelector("#draggable"));
		WebElement trgt=driver.findElement(By.cssSelector("#droppable"));
		act.dragAndDrop(src, trgt).build().perform();
		
		//Get your cotrol to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
	}

}
