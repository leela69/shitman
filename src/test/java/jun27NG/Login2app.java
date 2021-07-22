package jun27NG;

import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.Homepage;
import testbase.Testbase1;

public class Login2app extends Testbase1 {
	
	@Test(groups = {"login", "smoke", "regression" })
	public void login69() throws InterruptedException
	{
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		
		String webpagheadin = "Follow us on Facebook";
		String webpagehead = aupgobj.getFacetext().getText();
		
		if(webpagheadin.equals(webpagehead))
		{
			logger.log(LogStatus.PASS, "passed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "failed");
			assertEquals(webpagheadin, webpagehead);
		}
		
		logger.log(LogStatus.INFO, "clicking on the click : " );
		hmpgobj.getSignin().click();
		String authhead = "AUTHENTICATION";	
		String auttexts = myaccobj.getMytext().getText();
		
		if(authhead.equals(auttexts))
		{
			logger.log(LogStatus.PASS, "passed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "failed");
			assertEquals(authhead, auttexts);
		}
		logger.log(LogStatus.INFO, "back2the page");
		myaccobj.getHometext().click();
		contactobj.getContactusthr().click(); //contactobj
		
		String contact = "CUSTOMER SERVICE - CONTACT US";
		String contacttext = contactobj.getContacthead().getText();
		
		if(contact.equals(contacttext))
		{
			logger.log(LogStatus.PASS, "passed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "failed");
			assertEquals(contact, contacttext);
		}
	} 

	@Test(groups = {"search","smoke","regression"})
	public void search () throws InterruptedException
	{
		
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		
		logger.log(LogStatus.INFO, "click on the searchbox");
		hmpgobj.setSearchbox("shirts");
		
		logger.log(LogStatus.PASS, "sucessfully done");
		Thread.sleep(5000);
	
	}
	
	
	@Test(groups = {"create","regression","smoke"})
	public void craete() throws InterruptedException
	{
	hmpgobj.getSignin().click();
	aupgobj.setUsrnme1("leelaprakash789@gmail.com");
	aupgobj.getLock1().click();
	
			} 
	

	@Test(groups = {"login","regression"})
	public void login() throws InterruptedException
	{
		
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		logger.log(LogStatus.INFO, "click on the button");
		hmpgobj.getSignin().click();
		
		aupgobj.setUsrnm3(prop.getProperty("username"));
		aupgobj.setPswd2(prop.getProperty("password"));
		aupgobj.getLock3().click();
		logger.log(LogStatus.PASS, "it is done");
		Thread.sleep(5000);
	}
	

	@Parameters({"UsernamE","PassworD"})	
	@Test(groups = {"login","regression"})
	public void login5  () throws InterruptedException
	{
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		
		logger.log(LogStatus.INFO, "clicking on the click : " );
		hmpgobj.getSignin().click();
		
		logger.log(LogStatus.INFO, "about 2 start");
		String username = excelReader.getCellData("excell-sheet", "username", 2);
		String password = excelReader.getCellData("excell-sheet", "password", 2);
		System.out.println("EX uname is : " +username);
		System.out.println("EX pword is : " +password);
		
		aupgobj.login2that(username, password);
		
		String webpagheadin = "MY ACCOUNT";
		String webpagehead = myaccobj.getMytext().getText();
		
		if(webpagheadin.equals(webpagehead))
		{
			logger.log(LogStatus.PASS, "passed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "failed");
			assertEquals(webpagheadin, webpagehead);
		}
		
		Thread.sleep(3000);
	} 
	
	@Test(groups= {"login","regression"})
	public void login0 () throws InterruptedException
	{
		hmpgobj.getSignin().click();
		
		int rowcount = excelReader.getRowCount("excell-sheet");
		
		for(int i=2; i<=rowcount; i++)
		{
			String username = excelReader.getCellData("excell-sheet", "username", i);
			String password = excelReader.getCellData("excell-sheet", "password", i);
			System.out.println("EX uname is : " +username);
			System.out.println("EX pword is : " +password);
			
			aupgobj.login2that(username, password);
			Thread.sleep(2000);
			aupgobj.getSignoutbutton().click();
		}
		
			} 
	@Test(groups = {"login","regression"})
	public void login6  () throws InterruptedException
	{
		hmpgobj.getSignin().click();
		String username = null;
		String password = null;
		
		aupgobj.login2that(excelReader.getCellData("excell-sheet", "username", 2),excelReader.getCellData("excell-sheet", "password", 2));
		System.out.println(username);
		System.out.println(password);
	
		Thread.sleep(3000);
	}
	

	@Test(groups = {"contactus","regression","smoke"})
	public void conus() throws InterruptedException
	{

		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		
		logger.log(LogStatus.INFO, "click on the button");
		hmpgobj.getContactus().click();
		
		logger.log(LogStatus.PASS, "it is done");
	
	}
	
	

	@Parameters({"UsernamE","PassworD"})	
	@Test(groups = {"smoke","login","regression"})
	public void login(String uname,String pword) throws InterruptedException
	{
		
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");
		logger.log(LogStatus.INFO, "click on the button");
		hmpgobj.getSignin().click();

		aupgobj.login2that(uname, pword);
		logger.log(LogStatus.PASS, "it is done");
		Thread.sleep(5000);
	}
	
}
