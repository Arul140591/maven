package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelPOJOTask6 extends BaseClass {
	public BookingHotelPOJOTask6() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='first_name']"),
		@FindBy(xpath="//input[@name='first_name']")
	})
	private WebElement firstName;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='last_name']"),
		@FindBy(xpath="//input[@name='last_name']")
	})
	private WebElement lastName;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//textarea[@id='address']"),
		@FindBy(xpath="//textarea[@name='address']")
	})
	private WebElement address;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='cc_num']"),
		@FindBy(xpath="//input[@name='cc_num']")
	})
	private WebElement ccNumber;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_type']"),
		@FindBy(xpath="//select[@name='cc_type']")
	})
	private WebElement ccType;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_exp_month']"),
		@FindBy(xpath="//select[@name='cc_exp_month']")
	})
	private WebElement ccExpMonth;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='cc_exp_year']"),
		@FindBy(xpath="//select[@name='cc_exp_year']")
	})
	private WebElement ccExpYear;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='cc_cvv']"),
		@FindBy(xpath="//input[@name='cc_cvv']")
	})
	private WebElement cvvNumber;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='book_now']"),
		@FindBy(xpath="//input[@name='book_now']")
	})
	private WebElement bookNow;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='cancel']"),
		@FindBy(xpath="//input[@name='cancel']")
	})
	private WebElement cancel;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
	

}
