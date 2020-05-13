package webdriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_Webtables_DisplayTableRows {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/auto");
		driver.manage().window().maximize();
		//total number of rows
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int rows_count=rows.size();
		System.out.println("No of rows in table:"+rows_count);
		//String val=table.findElement(By.xpath("tr[1]/td[1]")).getText();
		//System.out.println(val);
		FileOutputStream f=new FileOutputStream("E:\\Sel\\DDT\\redif.xls"); 
		WritableWorkbook wb=Workbook.createWorkbook(f);
		WritableSheet s=wb.createSheet("rediffsheet", 1);
		
		for(int i=1;i<=rows_count;i++)
		{
			System.out.println(table.findElement(By.xpath("tr["+i+"]/td[1]")).getText());
			Label b=new Label(0, i, table.findElement(By.xpath("tr["+i+"]/td[1]")).getText());
			s.addCell(b);
			
		}
		wb.write();
		wb.close();
		
		
		
		driver.close();
		
	}

}
