package dropDownHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //BootStrap dropdown means the list is Developed by other than select tag of HTML
        //in that we no need to creat instance of select class dirct uniqely identify the dropdown list
        WebElement dlist=driver.findElement(By.id("bsd1-button"));
       WebDriverWait wait=new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(dlist));
       dlist.click();
       List <WebElement> options=driver.findElements(By.cssSelector("div>a[class='dropdown-item']"));
        //Get all options from list
       for(int i=0;i<=options.size()-1;i++) {
    	   System.out.println("Option "+i+":"+options.get(i).getText());
       }
       //Get Numbers of options
       System.out.println("Numbers of option:"+options.size());
    // If you  want select any option then we need to find it uniqely and perform click operation  on it
      // driver.findElement(By.xpath("(//a[text()='India'])[1]")).click();
       options.get(5).click();
	}
 
	
}
