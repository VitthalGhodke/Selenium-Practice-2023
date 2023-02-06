package windowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindoHandelind {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		
		//Get current window unique id
		String homepagewindoid=driver.getWindowHandle();
		System.out.println("Home page windo id:"+homepagewindoid);
		
		//Perform click operation to open another window
		driver.findElement(By.cssSelector("i[class='icon-linkedin']")).click();

		//Get all window unique id which are open by selenium instance
		Set<String> allwindowid=driver.getWindowHandles();
		System.out.println("All window id:"+allwindowid);
		
		//Remove home window id from all window id then we get child window id
		allwindowid.remove(homepagewindoid);
		System.out.println("After remove home window id , all window id :"+allwindowid);
		
		//get child window id using iterator
		Iterator<String> itr=allwindowid.iterator();
		String childwid=itr.next();
		// go to child window
		driver.switchTo().window(childwid);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		System.out.println("Linked in page title:"+driver.getTitle());
		System.out.println("Linked in page url:"+driver.getCurrentUrl());
		//driver.close();
		
		driver.switchTo().window(homepagewindoid);
		System.out.println("etrain page title:"+driver.getTitle());
		System.out.println("etrain page url:"+driver.getCurrentUrl());
		
		//driver.close();
		
		//close all windows open by driver instancs
		driver.quit(); 
		
	}

}
