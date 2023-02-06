package locationValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Location Validation of element 
		WebElement Username=driver.findElement(By.id("username"));
		//Use Point class to get the location
		Point UnameLocation=Username.getLocation();
		//Location of User name
        int Unamelocation_X=UnameLocation.getX();
        int Unamelocation_Y=UnameLocation.getY();
        System.out.println("UserName Location on x-Axis:"+Unamelocation_X);
        System.out.println("UserName Location on y-Axis:"+Unamelocation_Y);
       
        //Location of Password
        WebElement Password=driver.findElement(By.id("password"));
        Point PassLocation=Password.getLocation();
        int Passlocation_X=PassLocation.getX();
        int Passlocation_Y=PassLocation.getY();
        System.out.println("Password Location on x-Axis:"+Passlocation_X);
        System.out.println("Password Location on y-Axis:"+Passlocation_Y);
        
        //Location of Sign in button
        //Find element uniqely
        WebElement sgbtn=driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
        //Use Point class and its getLocation method
        Point btnloc=sgbtn.getLocation();
        //getX and getY method------------> return int
        int sgbtn_x=btnloc.getX();
        int sgbtn_y=btnloc.getY();
        System.out.println("Location of Sign in btn on x-axis:"+sgbtn_x);
        System.out.println("Location of Sign in btn on y-axis:"+sgbtn_y);
	}

}
