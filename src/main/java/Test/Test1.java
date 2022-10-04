package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPom1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {

//
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// WebElement -- Action -- email ,password ,login btn
		
		LoginPom1 login=PageFactory.initElements(driver, LoginPom1.class);
		
		
		login.gettxt_email().sendKeys("Test");
	}

}
