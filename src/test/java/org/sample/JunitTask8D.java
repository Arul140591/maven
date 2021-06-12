package org.sample;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.pojo.pom.BookingConfirmationPOJOTask6;

import junit.framework.Assert;

public class JunitTask8D extends BaseClass {
	@SuppressWarnings("deprecation")
	@Test
	public void page5() throws IOException {
		BookingConfirmationPOJOTask6 bc = new BookingConfirmationPOJOTask6();
		scrollDown(bc.getSearchHotel());
		toTakeScreenShot("A6.png");
		String title1 = titleOfThePage();
		System.out.println(title1);
		Assert.assertTrue("Please check the page", title1.contains("Adactin"));
		//Assert.assertEquals("Check your page", "Adactin", title1.contains("Adactin.com"));
		writeExcel("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 0, 1, gettingValue(bc.getOrderNumber()));
		createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 0, 0, "Booking Order#");
		createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 1, 0, "--End--");
	}
	
	@After
	public void endDate() {
       Date d = new Date();
       System.out.println(d);
	}
	@AfterClass
	public static void close() {
		closeBrowser();
	}
	
	

}
