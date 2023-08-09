package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	@FindBy(xpath = "//input[@name=\"quantity\"]")
	private WebElement quntitybox;

	@FindBy(xpath = "//a[@class=\"cart\"]")
	private WebElement cartbutton;

	@FindBy(xpath = "//div[@class=\"container-fluid cart-info product-list\"]/child::table[@class=\"table table-striped table-bordered\"]")
	private WebElement cart_item_verify;

	@FindBy(xpath = "//i[@class=\"fa fa-trash-o fa-fw\"]")
	private WebElement item_delete;

	@FindBy(xpath = "//a[@class=\"btn btn-default mr10\"]")
	private WebElement continue_shopping_button;

	public Cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void quntity(String number) {
		quntitybox.clear();
		quntitybox.sendKeys(number);
	}

	public void cartbuttonclick() {
		cartbutton.click();
	}

	public void cartitemverify() {
		if (cart_item_verify.isDisplayed()) {
			System.out.println("Cart item is there");
		} else {
			System.out.println("Cart item is not there");
		}
	}

	public void itemdelete() {
		item_delete.click();
	}
	public void continueshopping() {
		continue_shopping_button.click();	
	}
}
