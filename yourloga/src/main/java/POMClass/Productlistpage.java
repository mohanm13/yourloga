package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericutility.Webdriverutility;

public class Productlistpage {

	@FindBy(xpath="//span[text()='Out of Stock']")
	private WebElement out_of_stock;
	
	public Productlistpage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	public String outofstock() {
		 
		 return out_of_stock.getText();
	}
}
