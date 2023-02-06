package x_Path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependAndIndependElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
        driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
        //Find the price of mobile
        WebElement Moblileprice=driver.findElement(By.xpath("//div[div[h2[a[span[text()='OnePlus Nord 2T 5G (Jade Fog, 8GB RAM, 128GB Storage)']]]]]/div[3]/div[1]/a/span/span[@class='a-offscreen']"));
        System.out.println("Mobile Price:"+Moblileprice.getText());
	}

}
