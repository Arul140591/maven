package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Test;
import org.pojo.pom.BookingHotelPOJOTask6;

public class JunitTask8C extends BaseClass {
	@Test
    public void page4() throws IOException, InterruptedException {
	BookingHotelPOJOTask6 b = new BookingHotelPOJOTask6();
	toPassText(b.getFirstName(),excelRead("Sheet1", 2, 0));
	toPassText(b.getLastName(), excelRead("Sheet1", 2, 1));
	toPassText(b.getAddress(), excelRead("Sheet1", 3, 0));
	toPassText(b.getCcNumber(), excelRead("Sheet1", 3, 1));
	dropDown(b.getCcType(), excelRead("Sheet1", 4, 0));
	dropDown(b.getCcExpMonth(), "January");
	dropDown(b.getCcExpYear(), "2022");
	toPassText(b.getCvvNumber(), excelRead("Sheet1", 4, 1));
	toTakeScreenShot("A4.png");
	toClick(b.getBookNow());
	Thread.sleep(5000);
	toTakeScreenShot("A5.png");
	
}
}
