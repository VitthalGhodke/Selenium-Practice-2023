package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
  @Test
  public void testng_demo() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
      WebElement uname=driver.findElement(By.name("username"));
      uname.sendKeys("admin");
      
      WebElement pwd=driver.findElement(By.name("pwd"));
      pwd.sendKeys("manager");
      
      driver.findElement(By.id("loginButton")).click();
      WebElement logoutBtn=driver.findElement(By.cssSelector("a[id='logoutLink']"));
      // Explicit Wait
      WebDriverWait wait=new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
      logoutBtn.click();
      System.out.println("Title:"+driver.getTitle());
     Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); 
      
  }
}
