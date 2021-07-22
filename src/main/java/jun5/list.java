package jun5;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list
{

	@SuppressWarnings("unused")
	private static Object webelement;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\home\\\\eclipse-workspace\\\\jun5selenium\\\\chrdriv\\\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
	    
		java.util.List<WebElement> sung =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));
		
		for(int i=0;i<sung.size(); i++)
{
			if(sung.get(i).getText().equals("bb Daily"))
			{
				continue;
			}
	System.out.println(sung.get(i).getText());
	
}
		driver.quit();
				
	
		
	}

	public static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

      
      //https://www.bigbasket.com/


