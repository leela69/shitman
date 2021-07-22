package jun5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class craeteanaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("leelaprakash777@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("leel");
		driver.findElement(By.id("customer_lastname")).sendKeys("ilas");
		driver.findElement(By.id("passwd")).sendKeys("leela@2");
		
		driver.findElement(By.id("days")).sendKeys("1");
		driver.findElement(By.id("months")).sendKeys("October");
		driver.findElement(By.id("years")).sendKeys("1998");
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("uniform-optin")).click();
		

		
		
		
		
		
		
		
	}

}