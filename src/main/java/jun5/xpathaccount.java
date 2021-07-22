package jun5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();    
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("leelaprakash747@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

		
	boolean result = driver.findElement(By.xpath("//input[@id='id_gender1']")).isSelected();
	System.out.println(driver.getTitle());
	System.out.println("sdfbnm" +result);
	
	
	if(result == true)
	{
		System.out.println("shit");
	}
		else
		{
			System.out.println("heheheeheh ");
			
	}
		
		driver.quit();
		
		
	}

}