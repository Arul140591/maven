package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Test;
import org.pojo.pom.SelectHotelPOJOTask6;

public class JunitTask8B extends BaseClass {
	@Test
	public void page3() throws IOException, InterruptedException {
		SelectHotelPOJOTask6 hot = new SelectHotelPOJOTask6();
		toClick(hot.getSelectHotel());
		toTakeScreenShot("A3.png");
		toClick(hot.getContinueClick());
		Thread.sleep(3000);
	}

}
