package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericutility.Webdriverutility;

public class Createaccount {
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement lastname;

	@FindBy(xpath = "//div[@class=\"input-group col-sm-4\"]/child::input[@name=\"email\"]")
	private WebElement registeremail;

	@FindBy(xpath = "//input[@name=\"telephone\"]")
	private WebElement telephone;

	@FindBy(xpath = "//input[@name=\"fax\"]")
	private WebElement fax;

	@FindBy(xpath = "//input[@name=\"company\"]")
	private WebElement company;

	@FindBy(xpath = "//input[@name=\"address_1\"]")
	private WebElement address1;

	@FindBy(xpath = "//input[@name=\"address_2\"]")
	private WebElement address2;

	@FindBy(xpath = "//input[@name=\"city\"]")
	private WebElement city;

	@FindBy(xpath = "//select[@name=\"zone_id\"]")
	private WebElement state;

	@FindBy(xpath = "//input[@name=\"postcode\"]")
	private WebElement postcode;

	@FindBy(xpath = "//select[@name=\"country_id\"]")
	private WebElement countryid;

	@FindBy(xpath = "//input[@name=\"loginname\"]")
	private WebElement resgiterloginname;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement registerpassword;

	@FindBy(xpath = "//input[@name=\"confirm\"]")
	private WebElement confirmpassword;

	@FindBy(xpath = "//input[@id=\"AccountFrm_newsletter1\"]")
	private WebElement subscribeyes;

	@FindBy(xpath = "//input[@name=\"agree\"]")
	private WebElement agreecheckbox;

	@FindBy(xpath = "//div[@class=\"col-md-2 mt20 mb40\"]")
	private WebElement newusercontinuebutton;

	@FindBy(xpath = "//span[text()=' Your Account Has Been Created!']")
	private WebElement accountcreatedverify;

	@FindBy(xpath = "//a[@class=\"btn btn-default mr10\"]")
	private WebElement afteraccountcreatecontinuebutton;

	@FindBy(xpath = "//div[@class=\"menu_text\"]")
	private WebElement loginusernameverify;

	public Createaccount(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void newuseraccountcraetion(String fname, String lname, String remail, String telenumber, String faxnum,
			String comapanyname, String addss1, String addss2, String cityname, String zipcode, String loginname,
			String password, String confirmpasswd) {
		Webdriverutility utility = new Webdriverutility();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		registeremail.sendKeys(remail);
		telephone.sendKeys(telenumber);
		fax.sendKeys(faxnum);
		company.sendKeys(comapanyname);
		address1.sendKeys(addss1);
		address2.sendKeys(addss2);
		city.sendKeys(cityname);
		utility.selects(countryid, "India");
		utility.selects(state, "Karnataka");
		postcode.sendKeys(zipcode);
		resgiterloginname.sendKeys(loginname);
		registerpassword.sendKeys(password);
		confirmpassword.sendKeys(confirmpasswd);
		subscribeyes.click();
		agreecheckbox.click();
		newusercontinuebutton.click();
	}

	public void accountcreateverfiy() {
		if (accountcreatedverify.isDisplayed()) {
			System.out.println("Account is created");
		} else {
			System.out.println("Account is not created");

		}
	}

	public void loggeduserverify() {
		afteraccountcreatecontinuebutton.click();
		if (loginusernameverify.isDisplayed()) {
			System.out.println("User name is displayed");
		} else {
			System.out.println("User name is not displayed");
		}
	}
}
