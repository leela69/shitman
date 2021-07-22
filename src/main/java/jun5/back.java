package jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\j5s\\hothisisdat\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		//title
		//String thing = driver.getTitle();
		//System.out.println("the title is : " +thing);
		
		//url
		//String bling = driver.getCurrentUrl();
	//	System.out.println("the url is : " +bling);
		
		//text
	//	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
//	String dress = 	driver.findElement(By.xpath("//span[@class='lighter']")).getText();
	//System.out.println("dress text is : "+dress);
		
		driver.findElement(By.linkText("Contact us")).click();
		System.out.println(driver.getTitle());
		
	//	String title = driver.getTitle();
		//System.out.println("title is : " +title);
		
//		String url = driver.getCurrentUrl();
	//	System.out.println("url is : " +url);
		
		driver.navigate().back();
		System.out.println("title is : " +driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("url is : " +driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println("page is : "+driver.getPageSource());
		
		driver.quit();
		
		
	
	}

}

