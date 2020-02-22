package com.spicejet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spicejet.pages.Homepage;
import com.spicejet.utilities.Testbase;

public class TestHomepage extends Testbase{
	public WebDriver driver;
	Homepage homepage;
	Testbase testbase;
	public TestHomepage() throws Exception{
		super();
		
	}	
	@Test(groups="title")
	public void ValidateTitle() throws Exception{
		homepage.getTitle();
	} 
	@Test
	public void clickSearch() throws Exception{
		homepage.setDepartureCity();
		homepage.setArrivalCity();
		homepage.setDepatDate();
		homepage.setReturnDate();
		homepage.clickSearchBtn();
	}
	@Test(dataProvider = "getBusesSearchInfoByGroup", dataProviderClass=com.spicejet.utilities.dataProvider.class , groups = "Regression")
	public void searchBuses(String dCity, String aCity) throws Exception{
		homepage.setDepCity(dCity);
		homepage.setArrCity(aCity);
		homepage.setDepatDate();
		homepage.setReturnDate();
		homepage.clickSearchBtn();
	}
	@BeforeMethod(groups={"title", "Regression"})
	@Parameters ({"browser", "homepageURL"})
	public void loadDriver(String browser, String URL) throws Exception{
		testbase = new Testbase();
		driver = testbase.setUpDriver(browser, URL);
		homepage = new Homepage(driver);		
	}	

	@AfterMethod(groups={"title", "Regression"})
	public void tearDown(){
		driver.close();
	}
	

}