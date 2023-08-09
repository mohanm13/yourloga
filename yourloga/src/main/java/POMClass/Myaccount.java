package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Myaccount {
 @FindBy(xpath="//span[text()=' My Account']")
 private WebElement myaccountpageele;
 
 public Myaccount(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public String myaccountpageverify() {
	 String myaccount = myaccountpageele.getText();
	 return myaccount;
 }
}
