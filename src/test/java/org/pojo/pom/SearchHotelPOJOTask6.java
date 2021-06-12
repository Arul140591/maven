package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOJOTask6 extends BaseClass {

	public SearchHotelPOJOTask6() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='location']"),
		@FindBy(xpath="//select[@id='location']")
	})
	private WebElement location;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='hotels']"),
		@FindBy(xpath="//select[@id='hotels']")
	})
	private WebElement hotels;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='room_type']"),
		@FindBy(xpath="//select[@id='room_type']")
	})
	private WebElement roomType;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='room_nos']"),
		@FindBy(xpath="//select[@id='room_nos']")
	})
	private WebElement roomNumber;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='adult_room']"),
		@FindBy(xpath="//select[@id='adult_room']")
	})
	private WebElement adultsCount;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='child_room']"),
		@FindBy(xpath="//select[@id='child_room']")
	})
	private WebElement childrenCount;
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@name='Submit']"),
		@FindBy(xpath="//input[@id='Submit']")
	})
	private WebElement search;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@name='Reset']"),
		@FindBy(xpath="//select[@id='Reset']")
	})
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNumber() {
		return roomNumber;
	}

	public WebElement getAdultsCount() {
		return adultsCount;
	}

	public WebElement getChildrenCount() {
		return childrenCount;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
}
