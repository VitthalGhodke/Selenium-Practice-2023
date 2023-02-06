package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//PAge title before login
		System.out.println("PAge Title Before login:"+driver.getTitle());
       WebElement uname= driver.findElement(By.id("username"));
    	uname.clear();	   
        uname.sendKeys("admin");
        WebElement pass=driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys("Test@123");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        //page Title after login
        System.out.println("Page Title After Login:"+driver.getTitle());
        driver.close();

	}

}
