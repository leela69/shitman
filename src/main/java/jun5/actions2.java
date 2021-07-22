package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions2
{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions put = new Actions(driver);
		WebElement in = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		put.moveToElement(in).build().perform();
		
		if(in.isDisplayed() && in.isEnabled())
		{
			driver.findElement(By.xpath("(//a[text()='Baby Care'])[2]")).click();
		}
		else
		{
			System.out.println("it is ushh ");
		}
		
		driver.findElement(By.xpath("//html[@class='ng-scope']")).click();
		driver.findElement(By.xpath("//html[@class='ng-scope']")).click();
		
		driver.quit();
				
		
	}
}

      
      //https://www.bigbasket.com/


