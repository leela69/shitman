package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webhead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).click();
		String haee =  driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
		System.out.println("haeding is : " +haee);
		
		String auto = "Automation Practice Website";
		
		if (auto.equals(haee))
		{
			System.out.println("name is : CORRECT ");
		}
			else
			{
				System.out.println("name is : WRONG ");
		}
		}
}
		
	
	



