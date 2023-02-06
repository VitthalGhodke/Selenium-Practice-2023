package brosersOperations;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssignment {
@Test
public void Assignment_On_Amazon() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String PageTitle=driver.getTitle();
	System.out.println("Page Title:"+PageTitle);
	System.out.println("Page title Length:"+PageTitle.length());
	driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
	driver.findElement(By.xpath("(//a[text()='Best Sellers'])[2]")).click();
	List <WebElement> Department=driver.findElements(By.cssSelector("div>div>div[role='group']>div"));
   System.out.println("Sie of Department:"+Department.size());
   for(WebElement AllDepartment:Department) {
	   System.out.println(AllDepartment.getText());
   }
   
   System.out.println("Title:"+driver.getTitle());
 driver.navigate().back();
 System.out.println("Last title:"+ driver.getTitle());
   //driver.close();
}
}
