package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VarificationOfActitime {
	@Test(enabled=true, priority=2)
	public void Verify_Acti_Time_On_Chrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		cdriver.get("https://demo.actitime.com/");
		String ActualTitle=cdriver.getTitle();
		//Get Title and its Length
		System.out.println("Page Title: "+ ActualTitle);
		System.out.println("Title Length:"+ActualTitle.length());
		//Verify the page using title
		String ExpectedTitle="actiTIME - Login";
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Page open Succesesfully");
		}else {
			System.out.println("Something wrong");
		}
		//Verify the page using URl
		String ExceptedURl="https://demo.actitime.com/login.do";
		if(cdriver.getCurrentUrl().equals(ExceptedURl)) {
			System.out.println("Page open Succesesfully");
		}else {
			System.out.println("Something wrong");
		}
		cdriver.findElement(By.name("username")).sendKeys("admin");
		cdriver.findElement(By.name("pwd")).sendKeys("manager");
		cdriver.findElement(By.id("loginButtonContainer")).click();
	    Thread.sleep(5000);// First way to wait for open the title
		System.out.println("Home Page Title:"+cdriver.getTitle() );
		//Another way Using Explicitly wait we wait for open the Home page title
		WebElement logoutbtn=cdriver.findElement(By.id("logoutLink"));
		WebDriverWait wait=new WebDriverWait(cdriver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));
		System.out.println("Home Page Title:"+cdriver.getTitle());
		cdriver.close();	
	}
  @Test(enabled=false,priority=1)
  public void Verify_Acti_Time_On_FireFox() throws InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver=new FirefoxDriver();
		fdriver.manage().window().maximize();
		fdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fdriver.get("https://demo.actitime.com/");
		String ActualTitle=fdriver.getTitle();
		//Get Title and its Length
		System.out.println("Page Title: "+ ActualTitle);
		System.out.println("Title Length:"+ActualTitle.length());
		//Verify the page using title
		String ExpectedTitle="actiTIME - Login";
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Page open Succesesfully");
		}else {
			System.out.println("Something wrong");
		}
		//Verify the page using URl
		String ExceptedURl="https://demo.actitime.com/login.do";
		if(fdriver.getCurrentUrl().equals(ExceptedURl)) {
			System.out.println("Page open Succesesfully");
		}else {
			System.out.println("Something wrong");
		}
		fdriver.findElement(By.name("username")).sendKeys("admin");
		fdriver.findElement(By.name("pwd")).sendKeys("manager");
		fdriver.findElement(By.id("loginButtonContainer")).click();
		//Wait for open the home page title
		Thread.sleep(5000);
		System.out.println("Home Page Title: "+ fdriver.getTitle());
		fdriver.close();	
  }
  
}

