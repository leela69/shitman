package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keysex

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
		
		Actions ing = new Actions(driver);
				WebElement gng =  driver.findElement(By.xpath("//input[@id='input']"));
				
				ing.moveToElement(gng).click().sendKeys("TAMATO").doubleClick().build().perform();
				
				//ing.moveToElement(gng).click().keyDown(Keys.SHIFT).sendKeys(tama).build().perform();
				
				
		driver.quit();
				
		
	}
}

      
      //https://www.bigbasket.com/


