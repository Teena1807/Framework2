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
import com.training.pom.HomePageApplicationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class HomePageApplication {

	private WebDriver driver;
	private String baseUrl;
	private HomePageApplicationPOM applicationPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private static GenericMethods gmethod;

	@BeforeTest
	public  void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		applicationPOM = new HomePageApplicationPOM(driver); 
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
	public void validAppMenuTest() {
	//Click Application Menu	
		applicationPOM.clickApplicationsmenu();
		
		//Click View Application Link  	
		applicationPOM.clickviewApps();
			
	//Click on back button  
		applicationPOM.clickBackHomepage();
	
		//Click Application Menu	
		applicationPOM.clickApplicationsmenu();
				
		//Click View Application Link  	
		applicationPOM.clickcreateApplications();
		 
		//Select Customer ID
		applicationPOM.selectCustId();
		
		//Select CustomerId value
		applicationPOM.selectCustIdvalue();
		
		//Enter Application Name 
		applicationPOM.sendAppname("Test");
		
		//Select Application Name 
		applicationPOM.selectApplication();
		
		//Select Application id value
		applicationPOM.selectApplicationvalue();
		
		//Enter App desc
		applicationPOM.sendAppnDesc("Testing Create Application");
		
		//Click Submit Button
		applicationPOM.clickSubmitBttn();
		
		
		
	
		
	}
}
