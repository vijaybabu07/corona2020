package ddt;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class A2_ExcelToApp {

	public static void main(String[] args)throws Exception {
		FileInputStream f=new FileInputStream("E:\\Sel\\DDT\\wb1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		//Sheet s=wb.getSheet("abc");
		Sheet s=wb.getSheet(0);
		String url=s.getCell(2, 1).getContents();
		String loc1=s.getCell(0, 1).getContents();
		String loc2=s.getCell(0, 2).getContents();
		String v1=s.getCell(1, 1).getContents();
		String v2=s.getCell(1, 2).getContents();
		System.out.println("Locator1:"+loc1);
		System.out.println("Locator2:"+loc2);
		System.out.println("Value1:"+v1);
		System.out.println("Value2:"+v2);
		System.out.println("url:"+url);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc1)).sendKeys(v1);
		driver.findElement(By.xpath(loc2)).sendKeys(v2);
		

	}

}
