package calendarHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Pune");
        driver.findElement(By.cssSelector("li[data-id='67159']")).click();
        driver.findElement(By.id("dest")).sendKeys("Goa");
        driver.findElement(By.cssSelector("li[data-id='67123']")).click();
        driver.findElement(By.cssSelector("#onward_cal")).click();
        driver.findElement(By.xpath("//tbody/tr[4]/td[5]")).click();
        driver.findElement(By.id("search_btn")).click();
        driver.findElement(By.cssSelector("ul[class='dept-time at-time-filter']>*:nth-child(4)")).click();
        driver.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-child(3)>input[id='bt_AC']")).click();
        
	}

}
