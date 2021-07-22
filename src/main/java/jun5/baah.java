package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.telerik.com/support/demos");  
		
		 //         https://www.telerik.com/support/demos
		
		driver.findElement(By.xpath("//body[@id='telerik']")).click();
		driver.findElement(By.xpath("//a[@class='Link--next Text--xl Link--s  u-ff-sans1 u-pr2 js-open-register-panel']")).click();
		driver.findElement(By.xpath("//input[@id='Email-1']")).sendKeys("lelaprakash587@gmail.com");
		driver.findElement(By.xpath("//input[@id='Textbox-1']")).sendKeys("iihaaakk");
		driver.findElement(By.xpath("//input[@id='Textbox-2']]")).sendKeys("asdfghjkl");
		
		driver.close();
		
		
	
	}

}