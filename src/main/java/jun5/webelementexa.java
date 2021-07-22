package jun5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementexa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement newone =  driver.findElement(By.xpath("//a[@class='login']"));   
		
        String thing = newone.getTagName();
        System.out.println("asdfghj : " +thing);
        
        String bling = newone.getText();
        System.out.println("lkjhgfd : " +bling);
        
       String ling =  newone.getCssValue(thing);
       System.out.println("rfvbnjh : " +ling);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}