package testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excell.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;				
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import jun28NG.LogTest;
import listener.EventListener;
import pages.Authen;
import pages.Contactpage;
import pages.Homepage;
import pages.Myaccountpage;
import pages.Signinpage;

public class Testbase1 {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	public static WebDriver driver;
	protected Homepage hmpgobj;
	//protected Signinpage sinpgobj;
	protected Authen aupgobj;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public Properties prop;
	public FileInputStream fis;
	public static ExcelReader excelReader;
	protected Myaccountpage myaccobj;
	protected Contactpage contactobj;
	
	@BeforeMethod(groups= {"smoke","regression","login","contactus","search","create"})
	public void beforetest() throws IOException 
	{
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");

		//load the file using below command
		prop.load(fis); 
		
		if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(prop.getProperty("browser").equals("chrome")) {

			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\jun5selenium\\chrdriv\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("no browser is applicable");
			System.exit(0);
		}
			
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\jun5selenium\\chrdriv\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "C:\\firefox\\geckodriver.exe");
		
	//	driver = new ChromeDriver();
		//driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("url is => "+prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));
		
		EventListener capture = new EventListener();
		
		EventFiringWebDriver eventHandler =  new EventFiringWebDriver(driver);
		
		eventHandler.register(capture);	
		
		hmpgobj = new Homepage(eventHandler);
		//sinpgobj = new Signinpage(eventHandler);
		aupgobj = new Authen(eventHandler);
		myaccobj = new Myaccountpage(eventHandler);
		contactobj = new Contactpage(eventHandler);
		
		excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Book1.xlsx");
  }

	@AfterMethod(groups= {"smoke","regression","login","contactus","search","create"})
	public void aftertest()   
	{
		driver.quit();
		extent.endTest(logger);
		extent.flush();
		
	}
	@BeforeTest(groups= {"smoke","regression","login","contactus","search","create"})
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}
	
	@AfterTest(groups= {"smoke","regression","login","contactus","search","create"})
	public void testafter() {
		 
		extent.close();
	}


	
}
