package jun25NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testthing {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  java.util.List<WebElement> sung =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));
		
		for(int i=0;i<sung.size(); i++)
{
			if(sung.get(i).getText().equals("bb Daily"))
			{
				continue;
			}
	System.out.println(sung.get(i).getText());
	
}
  }
  
  @Test
  public void f2() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText().contains("charger"))
		{
			System.out.println("charger is mi ");
		}
		else
		{
			System.out.println("chargerrrrr ");
		}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\home\\\\eclipse-workspace\\\\jun5selenium\\\\chrdriv\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
	    
  }

  @AfterTest
  public void afterTest() {
		driver.quit();
		
  }

}
