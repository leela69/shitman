package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\jun5selenium\\chrdriv\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.name("search_query")).sendKeys("best sellers");
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.close();
		
	
	}

}