package yourloga.scripts;

import org.testng.annotations.Test;

import Genericutility.Baseclass;
import POMClass.Homepage;
import POMClass.LoginorRegister;
import POMClass.Productpage;

public class Automation_TC_04 extends Baseclass {
	
//	Productpage productpage ;
//	LoginorRegister loginorregister;
//	Homepage hpage;
	@Test(priority = 1)
	public void login() {
		LoginorRegister	 loginorregister = new LoginorRegister(driver);
		 Homepage hpage = new Homepage(driver);

		hpage.homepageloginorregister();
		loginorregister.userlogin("mohanm", "mohanm13");

	}

	@Test(priority = 2)
	public void additemtocart() {
		Productpage productpage = new Productpage(driver);
		Homepage hpage = new Homepage(driver);
		LoginorRegister	 loginorregister = new LoginorRegister(driver);

		hpage.homepageloginorregister();

		loginorregister.userlogin("mohanm", "mohanm13");
		hpage.mentab();
		productpage.secondrowprod2();
	}

}
