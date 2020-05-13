package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3_Webtables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/auto");
		driver.manage().window().maximize();
		//to capture a value from table
		String val=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")).getText();
		System.out.println(val);
		driver.close();

	}

}
