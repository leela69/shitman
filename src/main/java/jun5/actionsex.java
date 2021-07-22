package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\home\\\\eclipse-workspace\\\\jun5selenium\\\\chrdriv\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		
		Actions big = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
        big.moveToElement(search).build().perform();
        
        Thread.sleep(3000);
        
        if(search.isDisplayed() && search.isEnabled())
        {
        driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
        }
        else    //https://www.bigbasket.com/
        {
        	System.out.println("it is not ");
        	
        	 driver.quit();
        }
	
	}
}

      
    


