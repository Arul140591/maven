package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPOJOTask6 extends BaseClass {
	public BookingConfirmationPOJOTask6() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='order_no']"),
		@FindBy(xpath="//input[@name='order_no']")
	})
	private WebElement orderNumber;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='search_hotel']"),
		@FindBy(xpath="//input[@name='search_hotel']")
	})
	private WebElement searchHotel;
	
	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	
}
