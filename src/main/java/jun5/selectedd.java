package jun5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectedd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
         driver.findElement(By.xpath("//a[@class='login']")).click();
        
        driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("B1auto@mailinator.com");
        driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
        WebElement day1 = driver.findElement(By.xpath("//select[@id='days']"));
        day1.sendKeys("10");     
        boolean da = day1.isSelected();
       
        if(da==true) {
            System.out.println("day is gd");
        }
        
        else {
            System.out.println("day is k");
            
        }
            
            Thread.sleep(5000);
            
            driver.close();
        	
        	
        }	
		}

