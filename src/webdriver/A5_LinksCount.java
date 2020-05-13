package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_LinksCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of Links "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText()+"        "+links.get(i).getAttribute("href"));
		}
		driver.close();

	}

}
