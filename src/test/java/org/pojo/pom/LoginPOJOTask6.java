package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOTask6 extends BaseClass {

	public LoginPOJOTask6() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']"),
		@FindBy(xpath="(//input[@class='login_input'])[1]")		
	})
	private WebElement username;

	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@name='password']"),
		@FindBy(xpath="(//input[@class='login_input'])[2]")		
	})
	private WebElement password;

	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='login']"),
		@FindBy(xpath="//input[@name='login']"),
		@FindBy(xpath="//input[@class='login_button']")
	})
	private WebElement loginBtn;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


		
}
