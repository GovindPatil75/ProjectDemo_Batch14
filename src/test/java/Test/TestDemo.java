package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	
	@Test
	public void test1() {
		
		//
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement -- Email,Password 
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.gettxt_email().sendKeys("Test");
		login.gettxt_password().sendKeys("123456789");
		
		
		
		
		
	}
}
