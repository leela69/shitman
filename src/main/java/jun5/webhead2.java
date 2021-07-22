package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webhead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		String oiuy = driver.findElement(By.xpath("(//div[@class='type-text']/h3)[2]")).getText();
		System.out.println(oiuy);
		
		String cust = driver.findElement(By.xpath("(//div[@class='type-text']/h3)[2]")).getText();
		System.out.println("ghdjd: " +cust);
		
		String ust = "Custom lock";
		
		if(ust.equals(cust))
		{
			System.out.println("TRUE ISZZ ");
		}
		else
		{
		System.out.println("it isnt true");
		}
			
			 driver.quit();
		}
	}

       


       
		



		
	
	



