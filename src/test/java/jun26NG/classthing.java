package jun26NG;

import org.testng.annotations.Test;

import testbase.Testbase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class classthing extends Testbase1  {
	
  @Test
  public void f() {
	  
	  driver.get("https://www.bigbasket.com/");
		java.util.List<WebElement> sung =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));
		
		for(int i=0;i<sung.size(); i++)
{
			if(sung.get(i).getText().equals("bb Daily"))
			{
				continue;
			}
	System.out.println(sung.get(i).getText());
	
}
  }
  
@Test
public void f3() {
	 
	  driver.get("https://www.bigbasket.com/");
		
		Actions ing = new Actions(driver);
				WebElement gng =  driver.findElement(By.xpath("//input[@id='input']"));
				
				ing.moveToElement(gng).click().sendKeys("TAMATO").doubleClick().build().perform();
				
				//ing.moveToElement(gng).click().keyDown(Keys.SHIFT).sendKeys(tama).build().perform();
				
				
}
}
