package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4_Webtables_rowcount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/auto");
		driver.manage().window().maximize();
		//creating webelement for table
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		//counting rows in table
		List<WebElement> table_rows=table.findElements(By.tagName("tr"));
		System.out.println(table_rows.size());
		driver.close();
		

	}

}
