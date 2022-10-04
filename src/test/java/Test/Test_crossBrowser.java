package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_crossBrowser extends BaseClass{
	
	
	
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void testa() {
		System.out.println("Test a");
	}
	@Test
	public void testb() {
		System.out.println("Test b");
	}
	

}
