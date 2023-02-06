package keyBoardAndMauseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownUsingKeboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		//Pop Handle Using escap btn
		WebElement Element=driver.findElement(By.cssSelector("body"));
		Element.sendKeys(Keys.ESCAPE);
		
		//SCrolling down only once
		Element.sendKeys(Keys.PAGE_DOWN);
		
		//SCrolling down multiple time using for loop
		for(int i=0;i<=7;i++) {
			Element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}
		//SCrolling To home
				Element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
		//SCrolling----Directly goto the end of page
		Element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		//SCrolling To home
		Element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
        
		//To refresh the page
		Element.sendKeys(Keys.F5);
	}

}
