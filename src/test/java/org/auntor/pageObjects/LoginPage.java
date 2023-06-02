package org.auntor.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	WebElement userEmailInputElement;

	@FindBy(id = "password")
	WebElement userPasswordInputElement;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement signInBtnElement;

	public void signInToPortal(String email,String password) throws InterruptedException {
		userEmailInputElement.sendKeys(email);
		userPasswordInputElement.sendKeys(password);
		signInBtnElement.click();
		Thread.sleep(3000);
	}

}
