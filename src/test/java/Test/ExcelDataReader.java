package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {

    String filepath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch13_Eve\\TestData\\Data.xlsx";

    // Object- FileinputSTream
    FileInputStream fis=new FileInputStream(filepath);
    
    // Object -XSSFWorkbook
    
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    
    // data call
    
    String data1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    
    String data2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    String data3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
    
    System.out.println(data1); //  Test 0,0
    System.out.println(data2); // 0,1
    System.out.println(data3); // 0,2
    
    String url=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
    
    // Browser open
    
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    
    
   // identify --WebElement
    
    WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
    txt_email.sendKeys(data1);
    
    WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
    txt_password.sendKeys(data2);
    
    
    String datanew=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
    System.out.println(datanew);
    
//   double data4=wb.getSheet("Sheet1").getRow(0).getCell(4).getNumericCellValue(); // 123456789.0
//  System.out.println(data4); //1.23456789E8
//  
//  String data4_a=String.valueOf(data4); // 1.23456789E8
//  
//  String data4_b=data4_a.replace("E8", "").replace(".", "");
//  System.out.println(data4_b);
//  
 
    
//    Library.getExcelData("Sheet1", 0, 0);
//    Library.getExcelData("Sheet1", 0, 1);
//    Library.getExcelData("Sheet1", 0, 2);
 
 
	}

}
