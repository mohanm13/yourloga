package Genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listenerimplementation implements ITestListener {
	ExtentReports extentReports;
	ExtentTest test;
	Webdriverutility utility;
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {

		test = extentReports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName() + "pass");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		utility = new Webdriverutility();
		try {
			utility.screenshot(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.fail(result.getMethod().getMethodName() + "Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getMethod().getMethodName() + "Skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
