package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.pom.LoginPOJO;

public class SamplePojoPom extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserLaunch();
		toMaximize();
		launchUrl("https://www.facebook.com/");
		LoginPOJO l = new LoginPOJO();
		toClick(l.getEnglish());
		toPassText(l.getEmail(), "arulkalya@gmail.com");
		toTakeScreenShot("fb1.png");
		toPassText(l.getPassword(),"Arul$123");
		toTakeScreenShot("fb2.png");
		//toClick(l.getLoginBtnFindAll());
		//toTakeScreenShot("fb3.png");
		
	}

}
