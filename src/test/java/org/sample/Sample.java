package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
public static void main(String[] args) throws IOException {
	//instead of system.setproperty() 
	
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver = new FirefoxDriver();
	//driver.get("https://www.facebook.com/");
	browserLaunch();
	toMaximize();
	launchUrl("https://www.facebook.com/");
	titleOfThePage();
	currentUrl();
	toTakeScreenShot("fb1.png");
	WebElement english = driver.findElement(By.xpath("//a[text()='English (UK)']"));
	toClick(english);
	toTakeScreenShot("fb2.png");
	WebElement email = driver.findElement(By.id("email"));
	toPassText(email, "arulkalya@gmail.com");
	toTakeScreenShot("fb3.png");
	WebElement pass = driver.findElement(By.name("pass"));
	toPassText(pass, "Arul123");
	toTakeScreenShot("fb4.png");
	WebElement btnLogin = driver.findElement(By.name("login"));
	toClick(btnLogin);
	toTakeScreenShot("fb5.png");
}
}
