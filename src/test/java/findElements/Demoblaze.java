package findElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> Categories=driver.findElements(By.cssSelector("div[class='list-group']>a"));
        System.out.println("List of Categories:"+Categories.size());
        List<String> ExpectedCat=new ArrayList<String>();
        ExpectedCat.add("CATEGORIES");
        ExpectedCat.add("Phones");
        ExpectedCat.add("Laptops");
        ExpectedCat.add("Monitors");
        //Logic to get one by one element from list and performing validation on that
        for(int i=0; i<Categories.size();i++) {
        	WebElement cat=Categories.get(i);
        	System.out.println("******List Element:"+cat.getText()+"***********");
        	System.out.println(cat.isDisplayed());
        	System.out.println(cat.isEnabled());
        	System.out.println(cat.getText().equals(ExpectedCat.get(i)));
        }
        //Print all mobiles name
        List<WebElement> mobiles=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h4>a"));
        System.out.println("Count of Mobliles:"+mobiles.size());
        //Get the one by one element from liost and validate it
        for(int j=0;j<mobiles.size();j++) {
        	WebElement mob=mobiles.get(j);
        	System.out.println(mob.getText());
        	System.out.println(mob.isDisplayed());
        	System.out.println(mob.isEnabled());
        	System.out.println(mob.isSelected());
        	driver.close();
        }
      
	}

}
