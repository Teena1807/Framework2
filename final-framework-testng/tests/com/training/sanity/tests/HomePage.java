package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class HomePage {

	private WebDriver driver;
	private String baseUrl;
	private HomePagePOM homePOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private static GenericMethods gmethod;

	@BeforeTest
	public  void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
 		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homePOM = new HomePagePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		gmethod = new GenericMethods(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void HomePageTest() {
	//Select from Dropdown  Button 
		//homePOM.selectSearchoption("Applications");
		
		//Enter Search value	
		homePOM.enterSearchbox("app1");
		
	//Assertion value in search box	
		boolean Result5=gmethod.validateTextBox(driver,"xpath","//*[@id='DivHome']/div[2]/div/div[2]/input","app1");
		Assert.assertTrue(Result5);
		screenShot.captureScreenShot("Search value");
		
	//Click on Search Button 
		homePOM.clickSearchBttn();
	//Assertion that User details should be displayed 	
		screenShot.captureScreenShot("APP1 SearchPage");
	
	//Selection from SortBy DropDown
		
		//Click on SortBy Box
		homePOM.clickSortBy();
		//Select Created Date
		homePOM.selectCretDateOption();
		//Select date
		homePOM.selectCalender();
		homePOM.selectDay();
		//Click on Search Button 
		homePOM.clickGoBttn();
		
		//Click on Actions button
		homePOM.clickActions();
		//Click on Cancel button
		homePOM.clickcancel();
		//Select Pagination
		homePOM.selectpages();
}
}
