package dragAndDropAndFrame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		//Frame handling
		WebElement Frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(Frame);
		
		//Creat the instance of Actions Class
		
		Actions act=new Actions(driver);
		//Find Source Element from Element is drag
		List<WebElement> sourceElement=driver.findElements(By.cssSelector("ul#gallery>li"));
		
		//Find Target Element where Element is drop
		WebElement targetElement=driver.findElement(By.cssSelector("div#trash"));
	
		//Drag the one by one element from source and drop to target
		act.dragAndDrop(sourceElement.get(0), targetElement).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement.get(1), targetElement).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement.get(2), targetElement).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement.get(3), targetElement).build().perform();
	}

}
