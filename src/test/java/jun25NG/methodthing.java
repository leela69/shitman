package jun25NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class methodthing {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("leelaprakash777@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("leela");
		
  }
  
  @Test
  public void f2() {
	  
	  driver.findElement(By.xpath("//a[@class='login']")).click();    
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("leelaprakash747@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
	boolean result = driver.findElement(By.xpath("//input[@id='id_gender1']")).isSelected();
	System.out.println(driver.getTitle());
	System.out.println("it is : " +result);
	
	if(result == true)
	{
		System.out.println("shit");
	}
		else
		{
			System.out.println("heheheeheh ");
			
	}
  }
  
	  
  
  @BeforeMethod
  public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\jun5selenium\\chrdriv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
  }

  @AfterMethod
  public void afterMethod() {
		driver.quit();
  }

}
