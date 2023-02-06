package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyApplogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		 System.out.println("Befor login title:"+driver.getTitle());
        driver.findElement(By.name("UserName")).sendKeys("execution");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[name='Login']")).click();
        //Validaton
        String title=driver.getTitle();
        System.out.println("title:"+title);
        String actTitle="Execute Automation";
        if(title.equals(actTitle)) {
        	System.out.println("Page open Successfully");
        }else {
        	System.out.println("Something wrong");
        }
        
      WebElement logoutbtn= driver.findElement(By.cssSelector("a[href='Login.html']"));
      //Explicit Wait
      WebDriverWait wait=new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));
      System.out.println("After login title:"+driver.getTitle());
      logoutbtn.click();
      
       driver.close();
	}

}
