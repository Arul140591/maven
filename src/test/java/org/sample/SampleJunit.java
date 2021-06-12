package org.sample;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pojo.pom.LoginPOJO;

public class SampleJunit extends BaseClass {
	@After
	public void endDate() {
       Date d = new Date();
       System.out.println(d);
	}
	
	@AfterClass
	public static void close() {
		closeBrowser();
	}
	@Ignore
	@Test
	public void test2() throws IOException {
		launchUrl("https://www.facebook.com/");
		LoginPOJO l = new LoginPOJO();
		toClick(l.getEnglish());
		String dataOne = excelRead("Sheet1", 1, 0);
		String dataTwo = excelRead("Sheet1", 1, 1);
		toPassText(l.getEmail(), dataOne);
		toTakeScreenShot("fb1.png");
		toPassText(l.getPassword(),dataTwo);
		toTakeScreenShot("fb2.png");
		toClick(l.getLoginBtnFindAll());
		toTakeScreenShot("fb3.png");
	}
	@Before
	public void startDate() {
       Date d = new Date();
       System.out.println(d);
	}
	
	@Test
	public void test1() throws IOException {
		launchUrl("https://www.facebook.com/");
		LoginPOJO l = new LoginPOJO();
		toClick(l.getEnglish());
		String dataOne = excelRead("Sheet1", 1, 0);
		String dataTwo = excelRead("Sheet1", 1, 1);
		toPassText(l.getEmail(), dataOne);
		toTakeScreenShot("fb4.png");
		toPassText(l.getPassword(),dataTwo);
		toTakeScreenShot("fb5.png");
		toClick(l.getLoginBtnFindAll());
		toTakeScreenShot("fb6.png");
	}
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch();
		toMaximize();
	}
	@Test
	public void test3() throws IOException {
		launchUrl("https://www.amazon.in/");
		toTakeScreenShot("amz1.png");
	}

	

}
