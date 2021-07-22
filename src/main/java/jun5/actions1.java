package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1
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
		
		Actions doit = new Actions(driver);
	    WebElement itt =  driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
	    doit.moveToElement(itt).build().perform();
	    
	    if(itt.isDisplayed() && itt.isEnabled())
	    		{
	    	driver.findElement(By.xpath("(//a[text()='Beverages'])[2]")).click();
	    		}
	    else
	    {
	    	System.out.println("asdfghjk ");
	    }
		
	}
}

      
      //https://www.bigbasket.com/


