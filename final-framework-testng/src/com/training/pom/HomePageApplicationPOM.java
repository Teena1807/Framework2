package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageApplicationPOM {
	private WebDriver driver; 
	
	public HomePageApplicationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ibm-sidenav-menu[2]/li/button/span")
	private WebElement ApplicationMenu; 
	
	@FindBy(linkText="View Applications")
	private WebElement viewApplications;
	
	@FindBy(xpath="//*[@class='bx--header__name--prefix']")
	private WebElement BckHomePage; 
	
	@FindBy(linkText="Create Application")
	private WebElement createApplications;
	
	@FindBy(xpath="//*[@id='dropdown-2']/button")
	private WebElement customerid;
	
	@FindBy(xpath="//ibm-dropdown-list/ul/li[2]/div")
	private WebElement selcustid;
	
	@FindBy(css="input.bx--text-input")
	private WebElement appname;
	
	@FindBy(xpath="//*[@id='dropdown-3']/button")
	private WebElement selApplication;
	
	@FindBy(xpath="//ibm-dropdown-list/ul/li[2]")
	private WebElement selApplicationval;
	
	@FindBy(css="textarea.bx--text-area")
	private WebElement AppDesc;
	
	@FindBy(css="button.submit-btn")
	private WebElement submitbtn;
	
	public void clickApplicationsmenu() {
		this.ApplicationMenu.click();
		
	}
	public void clickviewApps() {
		this.viewApplications.click();
		
	}
	public void clickBackHomepage() {
		this.BckHomePage.click();
		
	}
	public void clickcreateApplications() {
		this.createApplications.click();
	}
	
	public void selectCustId() {
		customerid.click();
		}
	
	public void selectCustIdvalue() {
		selcustid.click();
		}
	

	public void sendAppname(String appname) {
		this.appname.clear();
		this.appname.sendKeys(appname);
	}
	
	public void selectApplication() {
		selApplication.click();
		}
	public void selectApplicationvalue() {
		selApplicationval.click();
		}
	
	public void sendAppnDesc(String AppDesc) {
		this.AppDesc.clear();
		this.AppDesc.sendKeys(AppDesc);
	}
	
	public void clickSubmitBttn() {
		this.submitbtn.click();
}
}
