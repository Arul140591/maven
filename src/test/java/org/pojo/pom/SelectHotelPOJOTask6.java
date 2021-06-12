package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOJOTask6 extends BaseClass {
	
	public SelectHotelPOJOTask6() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='radiobutton_0']"),
		@FindBy(xpath="//input[@name='radiobutton_0']")
	})
	private WebElement selectHotel;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='continue']"),
		@FindBy(xpath="//input[@name='continue']")
	})
	private WebElement continueClick;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueClick() {
		return continueClick;
	}
	
	




}
