package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Techlistc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/");
		 Thread.sleep(2000);
		 String title=driver.getTitle();
		 System.out.println(title);
        driver.findElement(By.xpath("(//a[text()='Java'])[1]")).click();
        Thread.sleep(2000);
       // driver.findElement(By.cssSelector("[id='dismiss-button']")).click();
        String t2=driver.getTitle();
        System.out.println(t2);
	}

}
