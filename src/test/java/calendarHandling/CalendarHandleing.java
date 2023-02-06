package calendarHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandleing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Handle the login popup
		driver.findElement(By.cssSelector("span[data-cy='handleSnackbarClose']")).click();
	
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//Select the date
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>div.DayPicker-Body>*:nth-child(3)>*:nth-child(3) p")).click();

	}

}
