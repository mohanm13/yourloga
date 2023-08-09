package yourloga.scripts;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genericutility.Baseclass;
import Genericutility.Webdriverutility;
import POMClass.Homepage;
import POMClass.LoginorRegister;
import POMClass.Productlistpage;

public class Automation_TC_03 extends Baseclass {
	Webdriverutility utility;

	@Test
	public void Account() throws InterruptedException, AWTException, EncryptedDocumentException, IOException {

		utility = new Webdriverutility();
		Homepage hpage = new Homepage(driver);
		hpage.accounttab(driver);

		hpage.accounttablogin();
		LoginorRegister loginorregister = new LoginorRegister(driver);
		loginorregister.userlogin("mohanm", "mohanm13");
		hpage.searchbarclick("shirts");
		Productlistpage productlist = new Productlistpage(driver);
		FileInputStream file = new FileInputStream("Testdata/Accountcreate.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet2 = workbook.getSheet("Sheet2");
		Row row2 = sheet2.getRow(0);
//		Cell cell2 = row2.getCell(0);
		int rownum = sheet2.getLastRowNum();
		String button = productlist.outofstock();
		for (int i = 1; i < rownum; i++) {
			if (button.equalsIgnoreCase("Out of Stock")) {
				System.out.println("Product is out of stock");
			} else {
             //utility.exceltestdata("Sheet2", i, 0)	;	
				continue;
				}
		}
	}

}
