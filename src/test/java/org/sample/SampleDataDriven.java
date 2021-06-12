package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.pom.LoginPOJO;

public class SampleDataDriven extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserLaunch();
		toMaximize();
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
		
	}

}
