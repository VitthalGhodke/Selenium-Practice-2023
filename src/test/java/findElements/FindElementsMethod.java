package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
        List<WebElement> Options=driver.findElements(By.cssSelector("div[class='ds-flex ds-items-center ds-justify-between ds-flex-1']>div>div>a"));
       
		//Print All Elements Using For each loop
        for(WebElement Names:Options) {
        	System.out.println(Names.getText());
        }
        System.out.println("Size of Elements:"+ Options.size());
        driver.close();
	}

}
