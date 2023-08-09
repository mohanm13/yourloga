package POMClass;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericutility.Webdriverutility;

public class Productpage {
	Webdriverutility utility = new Webdriverutility();
	@FindBy(xpath = "//select[@id=\"sort\"]")
	private WebElement sortdropdown;

	@FindBy(xpath = "//ul[@class=\"thumbnails row\"]/child::li[2]")
	private WebElement prod_select;

	@FindBy(xpath = "//div[@class=\"thumbnails grid row list-inline\"]/descendant::a[@class=\"details\"][1]")
	private WebElement productview_click;

	@FindBy(xpath = "//div[@class=\"thumbnails grid row list-inline\"]/descendant::a[1]")
	private WebElement product_scroll;

	@FindBy(xpath="//div[@class=\"thumbnails grid row list-inline\"]/descendant::div[@class=\"thumbnail\"][1]")
	private WebElement product1;
	
	@FindBy(xpath="//div[@class=\"thumbnails grid row list-inline\"]/descendant::a[@title=\"Add to Cart\"][2]")
	private WebElement product2;
	
	@FindBy(xpath="//a[text()='Dove Men +Care Body Wash']")
	private WebElement dovemenscroll;
	
	WebDriver driver;
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void productsort() {
		sortdropdown.click();

		utility.selects(sortdropdown, "Name A - Z");
	}

	public void productselect() {
		prod_select.click();
	}

//	public void productscroll() {
//		utility.scrollby(driver, product_scroll);
//
//	}

	public void productview() throws AWTException {
	
		productview_click.click();

	}
   public void secondrowprod2() {
	   utility.scrollby(driver, dovemenscroll);
	   product2.click();
   }

}
