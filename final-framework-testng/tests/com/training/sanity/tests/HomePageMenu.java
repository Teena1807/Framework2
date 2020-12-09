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
import com.training.pom.HomePageMenuPOM;
import com.training.pom.HomePagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class HomePageMenu {

	private WebDriver driver;
	private String baseUrl;
	private HomePageMenuPOM homemenuPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private static GenericMethods gmethod;

	@BeforeTest
	public  void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
 		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homemenuPOM = new HomePageMenuPOM(driver); 
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
	public void HomePageMenuTest() {
	//Select Customers form Home Page Menu
		homemenuPOM.clickCutomersmenu();	
		
		//Click on View Customers Link
		homemenuPOM.clickviewCustomers();
		
	//Assertion value in search box	
		
		boolean Result10=gmethod.validateTextBox(driver,"xpath","//*[@type='priamry']","Add Customer");
		Assert.assertTrue(Result10);
		screenShot.captureScreenShot("Search value");
		
		//Come Back on HomePage
		homemenuPOM.clickBackHomepage();
		//Select Customers again form Home Page Menu
		homemenuPOM.clickCutomersmenu();
		//Select Create Custome
		homemenuPOM.clickcreateCustomers();
		//Select Cancel button
		homemenuPOM.clickcancelBttn();
		//Come Back on HomePage
		homemenuPOM.clickBackHomepage();
		homemenuPOM.clickCutomersmenu();
		//Select Create Custome
		homemenuPOM.clickcreateCustomers();
		//Enter Customer Name
		homemenuPOM.enterCustomerName("Test");
		//Browse Customer Logo
		homemenuPOM.selectLogo("C:\\Users\\TeenaSharma\\Downloads\\data-science-methodologies.png");
		//Enter Email Id
		homemenuPOM.enterEmailid("test@gmail.com");
		//Enter Phone no
		homemenuPOM.enterPhone("9817067854");
		//Click Submit Button
		homemenuPOM.clickSubmitButton();
		
	}
}
