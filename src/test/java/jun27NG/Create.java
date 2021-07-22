package jun27NG;

import org.testng.annotations.Test;

import testbase.Testbase1;

public class Create extends Testbase1 {
	
	@Test(groups= {"create","regression","smoke"})
	public void createaccountman() throws InterruptedException
	{
		hmpgobj.getSignin().click();
		
		aupgobj.setUsrnme1("cwazy@gmail.com");
		aupgobj.getLock1().click();
		Thread.sleep(4000);
	}
}
