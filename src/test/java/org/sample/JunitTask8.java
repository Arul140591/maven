package org.sample;

import java.util.Date;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.pom.LoginPOJOTask6;

public class JunitTask8 extends BaseClass {
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch();
		toMaximize();
	}
	@Before
	public void startDate() {
       Date d = new Date();
       System.out.println(d);
	}
	@Test
	public void page1() throws IOException, InterruptedException 
	
	{
		launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		LoginPOJOTask6 lp = new LoginPOJOTask6();
		toPassText(lp.getUsername(), excelRead("Sheet1", 1, 0));
		toPassText(lp.getPassword(), excelRead("Sheet1", 1, 1));
		toTakeScreenShot("A1.png");
		toClick(lp.getLoginBtn());
		Thread.sleep(5000);
	}

	}

	