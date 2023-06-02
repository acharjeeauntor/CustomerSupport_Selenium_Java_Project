package org.auntor.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver ldriver;

	public HomePage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-nav-event-clicked='Hire Designers']")
	WebElement findTalentElement;


	public boolean isFindTalentElementDisplayed() {
return findTalentElement.isDisplayed();
	}

}
