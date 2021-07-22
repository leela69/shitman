package jun25NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class buckleup1 {
  @Test
  public void f() throws InterruptedException {
	  

		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("charger");
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
  
  @BeforeClass
  public void beforeClass() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
  }

  @AfterClass
  public void afterClass() {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.quit();
  }

}
