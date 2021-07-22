package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage {
	
	public Signinpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement lock;
	

}
