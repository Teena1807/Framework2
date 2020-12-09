package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
import com.training.pom.HomePageheadersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class HomePageHeaders {

	private WebDriver driver;
	private String baseUrl;
	private HomePageheadersPOM headerPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private static GenericMethods gmethod;

	@BeforeTest
	public  void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		headerPOM = new HomePageheadersPOM(driver); 
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
	public void validHeaderButtonTest() {
	//Click Menu Button 	
		headerPOM.clickOpenMenuBttn();
		
	//Assertion Verify Menu should be displayed
		screenShot.captureScreenShot("MenuPage");
		
		//Click Search Button 	
		headerPOM.clickSearchBttn();
	//Assertion Verify Searchbox should be displayed	
		screenShot.captureScreenShot("Search box");
		
	//Click on Login Button 
		headerPOM.clickUserBttn();
	//Assertion that User details should be displayed 	
		
		screenShot.captureScreenShot("UserDetails");
	
	}
}
