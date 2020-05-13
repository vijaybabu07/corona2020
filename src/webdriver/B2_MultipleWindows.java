package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2_MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'terms')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'policy')]")).click();
		
		//Getting all opened windows to Array list
		ArrayList windows=new ArrayList(driver.getWindowHandles());
		System.out.println("No of Windows:"+windows.size());
		
		//get title, links of opened windows and closing windows
		for(int i=0;i<windows.size();i++)
		{
			//System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
			System.out.println("window title "+(i+1)+"= "+driver.switchTo().window((String)windows.get(i)).getTitle());
			List<WebElement> l=driver.findElements(By.tagName("a"));
			System.out.println("No of Links in "+driver.switchTo().window((String)windows.get(i)).getTitle()+" is "+l.size());
			System.out.println("Links Names:");
			for(int j=0;j<l.size();j++)
			{
				String lname=l.get(j).getText();
				System.out.println(lname);
			}
			System.out.println("====================================================");
			String title=driver.switchTo().window((String)windows.get(i)).getTitle();
			System.out.println("title"+(i+1)+"="+title+" AND url: "+driver.switchTo().window((String)windows.get(i)).getCurrentUrl());
			System.out.println("====================================================");
			//Closing the window where title contains "terms"
			if(driver.switchTo().window((String)windows.get(i)).getTitle().contains("Terms")==true)
			{
					driver.switchTo().window((String)windows.get(i)).close();
					System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle()+" is closed");
			}
		}
		
	}

}
