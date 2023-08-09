package POMClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericutility.Webdriverutility;

public class Homepage {

	@FindBy(xpath = "//img[@title=\"Automation Test Store\"]")
	private WebElement homepagelogo;

	@FindBy(xpath = "//a[text()='Login or register']")
	private WebElement loginorregister;

	@FindBy(xpath = "//a[@href=\"https://automationteststore.com/index.php?rt=product/category&path=58\"]")
	private WebElement mentabclick;

	@FindBy(xpath = "//div[@class=\"topnavbar navbar\"]/descendant::li[@data-id=\"menu_account\"]")
	private WebElement Account_menutab;

	@FindBy(xpath = "//div[@class=\"topnavbar navbar\"]/descendant::a[@class=\"sub menu_login\"]")
	private WebElement Accounttab_login;
   
	@FindBy(xpath="//input[@id=\"filter_keyword\"]")
	private WebElement search_bar;
	
	@FindBy(xpath="//a[@class=\"active menu_home\"]")
	private WebElement activemenu_home;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void homepageloginorregister() {
		loginorregister.click();
		
		
	}

	public void Homepageverify() {
		if (homepagelogo.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}

	}

	public void mentab() {
		mentabclick.click();
	}

	public void accounttab(WebDriver driver) {
		Webdriverutility utility = new Webdriverutility();
		utility.action_method(driver, Account_menutab);
	}

	public void accounttablogin() {
		Accounttab_login.click();
	}
	public void searchbarclick(String item) throws AWTException {
		search_bar.sendKeys(item);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void activetabclick() {
		activemenu_home.click();
	}
}   
