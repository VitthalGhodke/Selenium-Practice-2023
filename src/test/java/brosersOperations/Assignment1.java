package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Open Acti time app	
		driver.get("https://demo.actitime.com/");
	
		//Get and print the title and title length
		String title=driver.getTitle();
		System.out.println("Page Title:"+title);
		System.out.println("Length of title:"+title.length());
	
		//Get and print url and url length
		String actualUrl=driver.getCurrentUrl();
		System.out.println("URL:"+actualUrl);
		System.out.println("Length of url:"+actualUrl.length());
	
		//Validate the app is open or not
		String ExpectedUrl="https://demo.actitime.com/login.do";
		if(actualUrl.equals(ExpectedUrl)) {
			System.out.println("Page open succesfully");
		}else {
			System.out.println("Something wrong");
		}
	  
		//Get and print page source and its length
		System.out.println("Page Source:"+driver.getPageSource());
		System.out.println("Page Source Length:"+driver.getPageSource().length());
		
		//close the browser
		driver.close();

	}

}
