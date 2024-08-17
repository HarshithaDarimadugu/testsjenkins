package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

class test01 {

	@Test
	void test1() {
		String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\selenium\\jenkins_remote\\reports\\jenkinsreport.html";
		File file = new File(path);
		ExtentReports report = new ExtentReports(path);
		ExtentTest test = report.startTest("test_jenkins");
		test.log(LogStatus.INFO, "execution started");
		System.out.println("jenkins is executing");
		test.log(LogStatus.PASS, "output executed");
		test.log(LogStatus.INFO, "execution ended");
		report.endTest(test);
		report.flush();
		report.close();
	}
	@Test
	void test2() {
		System.out.println("jenkins - a CI/CD tool");
	}

}
