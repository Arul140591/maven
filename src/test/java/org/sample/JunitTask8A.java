package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Test;
import org.pojo.pom.SearchHotelPOJOTask6;

public class JunitTask8A extends BaseClass {
	
	@Test
	public void page2() throws IOException, InterruptedException {
		SearchHotelPOJOTask6 sh = new SearchHotelPOJOTask6();
		dropDown(sh.getLocation(), "Sydney");
		dropDown(sh.getHotels(), "Hotel Sunshine");
		dropDown(sh.getRoomType(), "Double");
		dropDown(sh.getRoomNumber(), "2 - Two");
		dropDown(sh.getAdultsCount(), "2 - Two");
		dropDown(sh.getChildrenCount(), "3 - Three");
		toTakeScreenShot("A2.png");
		toClick(sh.getSearch());	
		Thread.sleep(2000);
	}

}
