package org.pojo.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
public LoginPOJO() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="//a[text()='English (UK)']")
private WebElement english;

@CacheLookup
@FindBy(id="email")
private WebElement email;

@CacheLookup
@FindBy(name="pass")
private WebElement password;

@CacheLookup
@FindAll({
	@FindBy(xpath="//button[@id='loginbutton']"),
	@FindBy(xpath="//button[@name='login']"),
	@FindBy(xpath="//button[@type='submit']")
	
})

private WebElement loginBtnFindAll;

@CacheLookup
@FindBy(xpath="//div[@class='_9ay7']")
private WebElement errorMsg;


public WebElement getErrorMsg() {
	return errorMsg;
}

public WebElement getEnglish() {
	return english;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginBtnFindAll() {
	return loginBtnFindAll;
}
}
