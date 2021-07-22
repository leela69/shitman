package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("leelaprakash333@gmail.com");
		
		String type = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("type");
		
		System.out.println("value is : " +type);
		
		driver.quit();
		
		
	
	}

}

