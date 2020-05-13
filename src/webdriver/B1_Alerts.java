package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[starts-with(@title,'Sign')]")).click();
		Alert a=driver.switchTo().alert();
		String m=a.getText();
		System.out.println(m);
		a.dismiss();
		driver.close();
	}

}
