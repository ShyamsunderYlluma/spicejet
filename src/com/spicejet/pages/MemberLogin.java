package com.spicejet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MemberLogin {
	WebDriver driver;

	public MemberLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")
	WebElement UserID;
	@FindBy(how=How.XPATH, using ="//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword']")
	WebElement Password;
	@FindBy(name="ControlGroupLoginView$MemberLoginView2LoginView$ButtonLogIn")
	WebElement Login;
	
	public void setUserID(String userID){
		UserID.sendKeys(userID);
	}
	public void setPassword(String password){
		Password.sendKeys(password);
	}
	public void LogIN(){
		Login.click();
	}
	public String getLoginTitle(){
		return driver.getTitle();
	}
}