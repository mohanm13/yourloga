package Genericutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	protected WebDriver driver;
	@BeforeMethod
	public void chromedriverlaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notofication");
		option.addArguments("chrome.switches", "--disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling --disable-infobars --enable-automation --start-maximized");
		 driver = new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://automationteststore.com/");
	    
	}
	

	@AfterMethod
	public void driverclose() {
		driver.close();
	}
}
