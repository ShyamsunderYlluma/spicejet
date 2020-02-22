package com.spicejet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spicejet.pages.Homepage;
import com.spicejet.pages.MemberLogin;
import com.spicejet.utilities.Testbase;

public class TestMemberLogin extends Testbase {
	public WebDriver driver;
	Testbase testbase;
	MemberLogin memberLogin;
	public TestMemberLogin(){
		super();
	}
	@Test(priority = '0')
	public void Login(){
		memberLogin.setUserID("8099150087");
		memberLogin.setPassword("Sweety123");
		memberLogin.LogIN();
		System.out.println("Am Login method");
	}
	@Test(groups="title")
	public void validateTitle()
	{
		Assert.assertEquals(memberLogin.getLoginTitle(), "Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines");
	}
	@BeforeMethod(groups="title")
	@Parameters ({"browser", "loginURL"})
	public void loadDriver(String browser, String URL) throws Exception{
		testbase = new Testbase();
		driver = testbase.setUpDriver(browser, URL);
		memberLogin = new MemberLogin(driver);	
	}
	@AfterMethod(groups="title")
	public void tearDown(){
		driver.close();
	}
}