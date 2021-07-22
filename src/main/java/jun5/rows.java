package jun5;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\home\\\\\\\\eclipse-workspace\\\\\\\\jun5selenium\\\\\\\\chrdriv\\\\\\\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
java.util.List<WebElement> contact = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		
		for	(int i=0;i<contact.size();i++)
		{
			System.out.println(contact.get(i).getText());
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}