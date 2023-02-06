package brosersOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenActitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
        WebElement uname=driver.findElement(By.name("username"));
        uname.sendKeys("admin12356");
        Thread.sleep(2000);
        uname.clear();
        Thread.sleep(3000);
        uname.sendKeys("admin");
        Thread.sleep(1000);
        WebElement pwd=driver.findElement(By.name("pwd"));
        pwd.sendKeys("manager123456");
        Thread.sleep(3000);
        pwd.clear();
        Thread.sleep(2000);
        pwd.sendKeys("manager");
        Thread.sleep(1000);
        driver.findElement(By.id("loginButton")).click();
        WebElement logoutBtn=driver.findElement(By.cssSelector("a[id='logoutLink']"));
        // Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
        Thread.sleep(3000);
        driver.close();
	}

}
