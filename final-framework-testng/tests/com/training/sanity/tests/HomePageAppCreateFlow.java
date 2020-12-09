package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.HomePageAppCreateFlowPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class HomePageAppCreateFlow {

	private WebDriver driver;
	private String baseUrl;
	private HomePageAppCreateFlowPOM createFlowPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private static GenericMethods gmethod;

	@BeforeTest
	public  void setUp() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		createFlowPOM = new HomePageAppCreateFlowPOM(driver); 
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
	public void validCreateFlowTest() {
	//Enter flow Name  	
		
		createFlowPOM.sendFlowName("Test");
		
	// Click Save Button
		createFlowPOM.clickUserSaveBttn();
		
	//Send Host name	
		createFlowPOM.sendHostName("10.86.85.118");
	//Assertion that Hostname entered properly	
		boolean Result31=gmethod.validateTextBox(driver,"xpath","//app-input-src/div/div/div[1]/ibm-label/div/input","10.86.85.118");
		Assert.assertTrue(Result31);
		screenShot.captureScreenShot("Hostname");
	
	//Send Parent Directory
		createFlowPOM.sendParDir("/var/log/*.log");
	//Assertion that Parent directory entered properly	
		boolean Result32=gmethod.validateTextBox(driver,"xpath","//app-input-src/div/div/div[2]/ibm-label/div/input","/var/log/*.log");
		Assert.assertTrue(Result32);
		screenShot.captureScreenShot("ParentDirectory");
		
	//Send User NAme
		createFlowPOM.sendUserName("root");
	//Assertion that UesrName entered properly	
		boolean Result33=gmethod.validateTextBox(driver,"xpath","//div/div/div[3]/div[1]/ibm-label/div/input","root");
		Assert.assertTrue(Result33);
		screenShot.captureScreenShot("Username");
	
	//Send Password
		createFlowPOM.sendPassword("nWCVt9Z8");
	//Assertion that Password entered properly	
		boolean Result34=gmethod.validateTextBox(driver,"xpath","//*[@id='passwordField']","nWCVt9Z8");
		Assert.assertTrue(Result34);
		screenShot.captureScreenShot("Password");
	
	//Click Select and Continue
		createFlowPOM.clickContButton();
	//Assertion Log Selector Page Displayed	
		boolean Result35=gmethod.checkSingleEntry("//tr[1]/td[1]/ibm-checkbox/div/label","xpath");
		Assert.assertTrue(Result35);
		screenShot.captureScreenShot("LogSelectorPage");
				
	//Select Log
		createFlowPOM.selectLog();
	//Assertion Log Checkbox selected	
		boolean Result36=gmethod.elementSelected(driver,"//tr[1]/td[1]/ibm-checkbox/div/label");
		Assert.assertTrue(Result36);
		screenShot.captureScreenShot("LogSelectorPage");
		
	//Click Select and Continue
		createFlowPOM.clickContButton();
	//Assertion Index offset Page Displayed	
		boolean Result37=gmethod.checkSingleEntry("//div[1]/ibm-label/div/input","xpath");
		Assert.assertTrue(Result37);
		screenShot.captureScreenShot("OffsetIndexPage");
	
	//Enter Offset Index name
		createFlowPOM.sendIndexName("test");
	//Assertion that Offset index Name entered properly	
		boolean Result38=gmethod.validateTextBox(driver,"xpath","//div[1]/ibm-label/div/input","test");
		Assert.assertTrue(Result38);
		screenShot.captureScreenShot("OffsetIndexName");
		
	//Enable all toggle buttons
	//Assertion that Tobble Buttons enabled
		
		createFlowPOM.enableOffset();
		boolean Result39=gmethod.elementSelected(driver,"//div[2]/div[1]/ibm-toggle/label[2]/span");
		Assert.assertTrue(Result39);
		screenShot.captureScreenShot("OffsetEnabled");
		
		createFlowPOM.enableCustomPattern();
		boolean Result40=gmethod.elementSelected(driver,"//div[2]/div[2]/ibm-toggle/label[2]/span");
		Assert.assertTrue(Result40);
		screenShot.captureScreenShot("customPatternEnabled");
		
		createFlowPOM.enableDepublication();
		boolean Result41=gmethod.elementSelected(driver,"//div[2]/div[3]/ibm-toggle/label[2]/span");
		Assert.assertTrue(Result41);
		screenShot.captureScreenShot("deduplicationEnabled");
		
		
	//Click Select and Validate Button
		createFlowPOM.clickContButton();
	//Assertion Output Source Page Displayed	
		boolean Result42=gmethod.checkSingleEntry("select.bx--select-input","xpath");
		Assert.assertTrue(Result42);
		screenShot.captureScreenShot("OutputSourcePage");
		
	//OUTPUT CONNECTOR
	//Select  Connector Name
		createFlowPOM.selConName();
	//Assertion that Connector Name Selected entered properly	
		boolean Result43=gmethod.validateTextBox(driver,"xpath","select.bx--select-input","Elasticsearch");
		Assert.assertTrue(Result43);
		screenShot.captureScreenShot("ConnectorName");
		
	//Enter Host Name
		createFlowPOM.sendopHostName("http://10.86.85.78:9200");
	//Assertion that Host Name Selected entered properly	
		boolean Result44=gmethod.validateTextBox(driver,"xpath","//div[1]/div[2]/ibm-label/div/input","http://10.86.85.78:9200");
		Assert.assertTrue(Result44);
		screenShot.captureScreenShot("outputHostName");
		
	//Enter Username
		createFlowPOM.sendopuserName("elastic");
	//Assertion that Host Name Selected entered properly	
		boolean Result45=gmethod.validateTextBox(driver,"xpath","//div[2]/div[1]/ibm-label/div/input","elastic");
		Assert.assertTrue(Result45);
		screenShot.captureScreenShot("outputUserName");
		
	//Enter Password
		createFlowPOM.sendPassword("password");
	//Assertion that Password entered properly	
		boolean Result46=gmethod.validateTextBox(driver,"xpath","//*[@id='passwordField']","password");
		Assert.assertTrue(Result46);
		screenShot.captureScreenShot("opPassword");	
		
	//Select and Continue
		createFlowPOM.clickContButton();
	//Assertion that Review Page Displayed	
		boolean Result47=gmethod.checkSingleEntry("//div/app-review-save/div/a/span","xpath");
		Assert.assertTrue(Result47);
		screenShot.captureScreenShot("Review Page Displayed");	
		
	//Edit Flow Name
		createFlowPOM.editFlowname();
		
	//Back on Review Page
		
		createFlowPOM.clickReviewPage();
		
	//Edit Input Source Connector
		createFlowPOM.editinputconnector();
		
	//Back on Review Page	
		createFlowPOM.clickReviewPage();
		
	//Edit Log Selector
		createFlowPOM.editLogSelector();
		
	//Back on Review Page
		createFlowPOM.clickReviewPage();
		
	//Edit Log Parser
		createFlowPOM.editLogParser();
		
	//Back on Review Page
		createFlowPOM.clickReviewPage();
		
	//Edit Deduplication
		createFlowPOM.editDeduplication();
		
	//Back on Review Page
		createFlowPOM.clickReviewPage();
		
	//Edit Output Connector
		createFlowPOM.editOutputConnector();
		
	//Back on Review Page
		createFlowPOM.clickReviewPage();
		
	//Edit Storage and Target
		createFlowPOM.editStorage();
		
	//Back on Review Page	
		createFlowPOM.clickReviewPage();
		
	//Export File
		createFlowPOM.clickExportJson();
	//Assertion that file is downloaded
		boolean Result56=gmethod.isFileDownloaded("C:\\Users\\TeenaSharma\\Downloads", "config.json");
		screenShot.captureScreenShot("Username");
		
	//Review andSubmit	
		createFlowPOM.clickReviewPage();
	}
}
