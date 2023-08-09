package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginorRegister {

	@FindBy(xpath = "//button[@title=\"Continue\"]")
	private WebElement newregistercontinue;
	
	@FindBy(xpath="//input[@id=\"loginFrm_loginname\"]")
	private WebElement loginusername;
	 
	@FindBy(xpath="//input[@id=\"loginFrm_password\"]")
	private WebElement loginuserpassword;
	
	@FindBy(xpath="//button[@title=\"Login\"]")
	private WebElement userloginbutton;
	
	public LoginorRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void newuserreigster() {
		newregistercontinue.click();
	}
   public void  userlogin(String name, String password)
   {
	    loginusername.sendKeys(name);
	    loginuserpassword.sendKeys(password);
	    userloginbutton.click();
   }

}
