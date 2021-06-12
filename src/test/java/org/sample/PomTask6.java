package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.pom.BookingConfirmationPOJOTask6;
import org.pojo.pom.BookingHotelPOJOTask6;
import org.pojo.pom.LoginPOJOTask6;
import org.pojo.pom.SearchHotelPOJOTask6;
import org.pojo.pom.SelectHotelPOJOTask6;

public class PomTask6 extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();
		toMaximize();
		launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		LoginPOJOTask6 lp = new LoginPOJOTask6();
		toPassText(lp.getUsername(), excelRead("Sheet1", 1, 0));
		toPassText(lp.getPassword(), excelRead("Sheet1", 1, 1));
		toTakeScreenShot("adac1.png");
		toClick(lp.getLoginBtn());
		Thread.sleep(5000);
		SearchHotelPOJOTask6 sh = new SearchHotelPOJOTask6();
		dropDown(sh.getLocation(), "Sydney");
		dropDown(sh.getHotels(), "Hotel Sunshine");
		dropDown(sh.getRoomType(), "Double");
		dropDown(sh.getRoomNumber(), "2 - Two");
		dropDown(sh.getAdultsCount(), "2 - Two");
		dropDown(sh.getChildrenCount(), "3 - Three");
		toTakeScreenShot("adac2.png");
		toClick(sh.getSearch());	
		Thread.sleep(2000);
		SelectHotelPOJOTask6 hot = new SelectHotelPOJOTask6();
		toClick(hot.getSelectHotel());
		toTakeScreenShot("adac3.png");
		toClick(hot.getContinueClick());
		Thread.sleep(3000);
		BookingHotelPOJOTask6 b = new BookingHotelPOJOTask6();
		toPassText(b.getFirstName(),excelRead("Sheet1", 2, 0));
		toPassText(b.getLastName(), excelRead("Sheet1", 2, 1));
		toPassText(b.getAddress(), excelRead("Sheet1", 3, 0));
		toPassText(b.getCcNumber(), excelRead("Sheet1", 3, 1));
		dropDown(b.getCcType(), excelRead("Sheet1", 4, 0));
		dropDown(b.getCcExpMonth(), "January");
		dropDown(b.getCcExpYear(), "2022");
		toPassText(b.getCvvNumber(), excelRead("Sheet1", 4, 1));
		toTakeScreenShot("adac4.png");
		toClick(b.getBookNow());
		Thread.sleep(5000);
		toTakeScreenShot("adac5.png");
		BookingConfirmationPOJOTask6 bc = new BookingConfirmationPOJOTask6();
		scrollDown(bc.getSearchHotel());
		toTakeScreenShot("adac6.png");
		writeExcel("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 0, 1, gettingValue(bc.getOrderNumber()));
		createNewCellAndWriteData("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 0, 0, "Booking Order#");
		createNewRowAndOneCellAlone("C:\\Users\\Arulkalya\\eclipse-workspace\\SampleMaven\\Excel\\BookingSheet.xlsx", "New Sheet", 1, 0, "--End--");
		}
	    }
