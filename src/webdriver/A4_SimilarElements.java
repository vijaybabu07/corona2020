package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int lcount=links.size();
		System.out.println("No of Links:"+lcount);
		List<WebElement> images=driver.findElements(By.tagName("img"));
		for(int i=0;i<lcount;i++)
		{
			if(links.get(i).getText().startsWith("H"))
			System.out.println(links.get(i).getText());
		}
		int imgcount=images.size();
		System.out.println("No of images:"+imgcount);
		driver.close();
	}

}
