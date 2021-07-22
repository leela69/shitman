package jun5;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rows2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
        java.util.List<WebElement> country =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        
        for(int i = 0;i<country.size();i++)
        {
        	if(country.get(i).getText().equals("Austria"))
        	{
        		continue;
        	}
        	System.out.println(country.get(i).getText());
        }
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}