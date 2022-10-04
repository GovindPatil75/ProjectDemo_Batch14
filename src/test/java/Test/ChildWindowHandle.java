package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandle {

	public static void main(String[] args) {
		
		// Browser Open
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId); // CDwindow-2B8428DABB97BB7CBC0A2C4EF68463AF /CDwindow-FFC5FB0D8787D76C092F2B549486168D

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		Set<String> Allid=driver.getWindowHandles(); // parent +child window Address 
		System.out.println(Allid);
		
		
		// Set---> List
		
		List<String> list=new ArrayList(Allid);
		
		String parentid=list.get(0);
		System.out.println("Parent Id "+parentid);
		
		String childid=list.get(1);
		System.out.println("Child Id "+childid);
		
		// Child window switch
		
		driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
		
		// driver.close(); ---- current window 
		
		//driver.close();
		
		driver.quit(); // current + All open window 
		
		
//		for(int i=0;i<list.size();i++) {
//			
//			
//			driver.switchTo().window(list.get(i));
//			String title=driver.getTitle();
//			
//			if(title.equals("Guru99 Bank Home Page")) {
//				driver.close();
//			}
//			
//		}
		
		
	}

}
