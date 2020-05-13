//Counting no of links and click on last but one link
package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_Link_LastButOneClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int lcount=links.size();
		for(int i=0;i<lcount;i++)
		{
			System.out.println("Link no:"+i+"==="+links.get(i).getText());
			if(i==(lcount-2))
			{
				System.out.println("Clicking link "+links.get(i).getText());
				links.get(i).click();
			}
			
		}
		driver.close();
	}

}
