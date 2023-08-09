package Genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutility {

	public void scrollby(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public String screenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dst = new File(".Screenshot/failscreenshot" + ".jpg");
		FileUtils.copyFile(dst, src);
		return dst.getAbsolutePath();
	}

	public void selects(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	public String exceltestdata(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("Testdata/Accountcreate.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet1 = workbook.getSheet(sheet);
		DataFormatter dataformat = new DataFormatter();
		String data = dataformat.formatCellValue(sheet1.getRow(row).getCell(cell));
		return data;
//	     Row row1 = sheet1.getRow(row);
//	    Cell cell1 = row1.getCell(cell);
//	     return cell1.getStringCellValue();
//	     
//	    return cell1.getNumericCellValue();

	}

	public void action_method(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
	}
   public void robot_method(KeyEvent key) throws AWTException {
	   
   }
} 
