package jun5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keydown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjw2ZaGBhBoEiwA8pfP_r_P2_8P0fdBS4kUNSP5rFSMUH0b7au8Qk6Wt_QY4pH0-5a5nvPtvxoC6q4QAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjw2ZaGBhBoEiwA8pfP_r_P2_8P0fdBS4kUNSP5rFSMUH0b7au8Qk6Wt_QY4pH0-5a5nvPtvxoC6q4QAvD_BwE");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earphones");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText().contains("charger"))
{
	System.out.println("bluetooth ");
}
else
{
	System.out.println("not at all ");
}
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}