package brosersOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	@Test
	public void chrome_Driver() {
		WebDriverManager.chromedriver().setup();
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://google.com");
		cdriver.close();
	}
	@Test
	public void firefox_Driver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver=new FirefoxDriver();
		fdriver.manage().window().maximize();
		fdriver.get("https://google.com");
		fdriver.close();
	}
	@Test
	public void edge_Driver() {
		WebDriverManager.edgedriver().setup();
		WebDriver edriver=new EdgeDriver();
		edriver.manage().window().maximize();
		edriver.get("https://google.com");
		edriver.close(); 
	}
	@Test
	public void ie_Driver() {
		WebDriverManager.iedriver().setup();
		WebDriver idriver=new InternetExplorerDriver();
		idriver.manage().window().maximize();
		idriver.get("https://google.com");
		idriver.close(); 
		
	}
	

}
