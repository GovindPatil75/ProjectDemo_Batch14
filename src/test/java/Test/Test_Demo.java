package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Demo {

	public static void main(String[] args) throws Exception {

		  WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
			driver.get("https://data.grampower.com/hes/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			
			WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
			
			
			WebElement login=driver.findElement(By.xpath("//input[contains(@value,'LOG IN')]"));
			username.sendKeys("automationuser");
			pass.sendKeys("grampower");
			login.click();
			Thread.sleep(2000);
	 
	   WebElement alert=driver.findElement(By.xpath("//button[@class='align-right secondary slidedown-button']"));
	   alert.click();
	   //Thread.sleep(40000);
	   driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[3]")));
	   Thread.sleep(4000);
	   WebElement arow=driver.findElement(By.xpath("//img[@alt='arrow']"));
	   arow.click();
	   
	  // JavascriptExecutor js=(JavascriptExecutor)driver;
	   //js.executeScript("document.getElementById('div_site_count').click();");
//try {
//	 WebElement arow=driver.findElement(By.xpath("//div[@title='Click to navigate to MAP View']"));
//	 arow.click();
//}catch(Exception e) {
//	WebElement arow=driver.findElement(By.xpath("//div[@title='Click to navigate to MAP View']"));
//	 arow.click();
//}
	}

}
