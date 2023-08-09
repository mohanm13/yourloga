package yourloga.scripts;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genericutility.Baseclass;
import Genericutility.Webdriverutility;
import POMClass.Createaccount;
import POMClass.Homepage;
import POMClass.LoginorRegister;

public class Automation_TC_01 extends Baseclass {

	@Test
	public void createaccount() throws EncryptedDocumentException, IOException, InterruptedException {
		Webdriverutility utility = new Webdriverutility();
		Homepage hpage = new Homepage(driver);
		hpage.Homepageverify();
		hpage.homepageloginorregister();
		LoginorRegister loginorregister = new LoginorRegister(driver);
		loginorregister.newuserreigster();
		Createaccount createaccount = new Createaccount(driver);
		String fname = utility.exceltestdata("Sheet1", 1, 0);
		String lname = utility.exceltestdata("Sheet1", 1, 1);
		String remail = utility.exceltestdata("Sheet1", 1, 2);
		int rmail = new Random().nextInt(500);
		String regemail = remail + rmail +"@gmail.com";
		Thread.sleep(4000);
		String telenum = utility.exceltestdata("Sheet1", 1, 3);
		String faxnumb = utility.exceltestdata("Sheet1", 1, 4);
		String compname = utility.exceltestdata("Sheet1", 1, 5);
		String ads1 = utility.exceltestdata("Sheet1", 1, 6);
		String ads2 = utility.exceltestdata("Sheet1", 1, 7);
		String ciname = utility.exceltestdata("Sheet1", 1, 8);
		String zcode = utility.exceltestdata("Sheet1", 1, 9);
		String logname = utility.exceltestdata("Sheet1", 1, 10);
		int no = new Random().nextInt(100);
		String loginname= logname + no;
		Thread.sleep(4000);
		String logpass = utility.exceltestdata("Sheet1", 1, 11);
		String cpass = utility.exceltestdata("Sheet1", 1, 12);
		createaccount.newuseraccountcraetion(fname, lname, regemail, telenum, faxnumb, compname, ads1, ads2, ciname,
				zcode, loginname, logpass, cpass);
		Thread.sleep(5000);
		createaccount.accountcreateverfiy();
		createaccount.loggeduserverify();

	}

}
