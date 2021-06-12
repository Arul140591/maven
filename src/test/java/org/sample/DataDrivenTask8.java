package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.pom.LoginPOJO;

public class DataDrivenTask8 extends BaseClass {
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
		//WebElement element = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		//String text = element.getText();
		//System.out.println(text);
		
		createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\Details.xlsx", "Sheet1", 1, 2, gettingText(l.getErrorMsg()));
	}

}
