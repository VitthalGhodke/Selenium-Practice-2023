package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BAsicsOperations {
  @Test
  public void basicsOperation() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(600,900));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("9604559219");
		driver.findElement(By.id("pass")).sendKeys("9604559219");
		driver.findElement(By.name("login")).click();
		driver.close();
  }
}
