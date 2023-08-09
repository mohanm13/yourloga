package yourloga.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericutility.Baseclass;
import Genericutility.Webdriverutility;
import POMClass.Cartpage;
import POMClass.Homepage;
import POMClass.LoginorRegister;
import POMClass.Myaccount;
import POMClass.Productpage;

public class Automation_TC_02  extends Baseclass {
	Webdriverutility utility;
	@Test
	public void login() throws InterruptedException, AWTException {
		 utility = new Webdriverutility(); 
		Homepage hpage = new Homepage(driver);
		hpage.Homepageverify();
		hpage.homepageloginorregister();
		LoginorRegister logorregister = new LoginorRegister(driver);
		logorregister.userlogin("mohanm", "mohanm13");
		Myaccount myacc = new Myaccount(driver);
		String myaccountpage = myacc.myaccountpageverify();
		Assert.assertEquals("MY ACCOUNT", myaccountpage);
		hpage.mentab();
		Productpage productpage = new Productpage(driver);
		productpage.productsort();
		//productpage.productscroll();
		WebElement scroll = driver.findElement(By.xpath("//div[@class=\"thumbnails grid row list-inline\"]/descendant::a[1]"));
		utility.scrollby(driver, scroll);
		Thread.sleep(3000);
		WebElement mousehover = driver.findElement(By.xpath("//div[@class=\"thumbnails grid row list-inline\"]/descendant::div[@class=\"thumbnail\"][1]"));
		utility.action_method(driver, mousehover);
		productpage.productview();
		Cartpage cart = new Cartpage(driver);
		cart.quntity("3");
		cart.cartbuttonclick();
		cart.cartitemverify();
		cart.itemdelete();
		cart.continueshopping();
		
		Thread.sleep(6000);
		
		
		
	}

}
