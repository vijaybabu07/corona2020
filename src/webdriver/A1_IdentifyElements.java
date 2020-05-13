package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_IdentifyElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("vijay");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("day")).sendKeys("12");
		driver.findElement(By.id("month")).sendKeys("Aug");
		driver.findElement(By.id("year")).sendKeys("1984");
		driver.findElement(By.id("cookie-use-link")).click();
		driver.close();
		
		
	}

}
