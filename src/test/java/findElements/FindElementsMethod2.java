package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
        List<WebElement> phones=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		//Print All Elements Using For each loop
        for(WebElement Elements:phones) {
        	System.out.println(Elements.getText());
        }
        System.out.println("Size of Elements:"+ phones.size());
	}

}
