package alertHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScreipAlert {

	
		/*Java Sript Alert/Java sript Pop-up
		 *  Devided into 3 types
		 *   1-Alert pop-up
		 *     ---Only one btn-- ok -- driver.switchTo().alert().accept(); 
		 *   2-Confirmation pop-up
		 *     ---Two btns --ok and Cancle--for ok-->driver.switchTo().alert().accept(); 
		 *                                  for cancle-->driver.switchTo().alert().dismiss();
		 *   3-Propt pop-up
		 *     two btns and text-ok and Cancle --for ok-->driver.switchTo().alert().accept(); 
		 *                                     for cancle-->driver.switchTo().alert().dismiss();
		 *                                    for get text-->driver.switchTo().alert().getText();
		 *                                    For write the text-->driver.switchTo().alert().senkeys("text"); 
		 * 
		 */
	@Test(enabled=false)
	public void Alert_pop_up() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//Alert is present in frame so we need to switch to frame first
		WebElement frame=driver.findElement(By.cssSelector("[id='iframeResult']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Get text from alert:"+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.close();
	}
		
	@Test(enabled=false)
	public void confirmation_pop_up() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Alert is present in frame so we need to switch to frame first
		WebElement frame=driver.findElement(By.cssSelector("[id='iframeResult']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Get text from alert:"+ driver.switchTo().alert().getText());
		//Two options is there
		//driver.switchTo().alert().accept();
		    //or
		driver.switchTo().alert().dismiss();
		driver.close();
	}	
	@Test
	public void prompt_pop_up() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Alert is present in frame so we need to switch to frame first
		WebElement frame=driver.findElement(By.cssSelector("[id='iframeResult']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Get text from alert:"+ driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("abc");
		//Two options is there
		//driver.switchTo().alert().accept();
		    //or
		driver.switchTo().alert().dismiss();
		//driver.close();
	}		
		
	

}
