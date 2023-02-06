package cssAttributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSAttributValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//VAlidation of Sign in botton
        WebElement Signbtn=driver.findElement(By.cssSelector("button[type='submit']"));
        String fontsize=Signbtn.getCssValue("font-size");
        String fontcolor=Signbtn.getCssValue("color");
        String BackgroundColor=Signbtn.getCssValue("background-image");
        System.out.println("Font Size:"+fontsize);
        System.out.println("Font color:"+fontcolor);
        System.out.println("Background Color:"+BackgroundColor);//RGBA format color code
        //Forgot to password
        String ForgotPassLinkColor=driver.findElement(By.cssSelector("a[class='forgotPasswordLink']")).getCssValue("color");
        System.out.println("Forgot to password link color:"+ForgotPassLinkColor);//RGBA format color code
	}

}
