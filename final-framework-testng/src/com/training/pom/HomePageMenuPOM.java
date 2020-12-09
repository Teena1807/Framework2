package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageMenuPOM {
private WebDriver driver; 
	
	public HomePageMenuPOM
	(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//ibm-sidenav-menu[1]/li/button/span")
	private WebElement CustomerMenu; 
	
	@FindBy(linkText="View Customers")
	private WebElement viewCuctomers;
	
	@FindBy(xpath="//*[@class='bx--header__name--prefix']")
	private WebElement BckHomePage; 
	
	@FindBy(linkText="Create Customer")
	private WebElement createCustomer;
	
	@FindBy(xpath="//*[@id='DivHome']/div[2]/button[1]")
	private WebElement cancelButton; 
	
	@FindBy(xpath="//*[@id='DivHome']/div[1]/div[1]/div/div[1]/ibm-label/div/input")
	private WebElement customerNme; 
	
	@FindBy(xpath="//*[@id='DivHome']/div[1]/div[1]/div/div[2]/div[2]/ibm-file-uploader/div/button")
	private WebElement Browsebtt; 
	
	@FindBy(xpath="//*[@id='DivHome']/div[1]/div[1]/div/div[3]/div[1]/ibm-label/div/input")
	private WebElement emailid; 
	
	@FindBy(xpath="//*[@id='DivHome']/div[1]/div[1]/div/div[3]/div[2]/ibm-label/div/input")
	private WebElement phone; 
	
	@FindBy(css="button.submit-btn")
	private WebElement submitbbtn; 
	
	public void clickCutomersmenu() {
		this.CustomerMenu.click();
		
	}
	public void clickviewCustomers() {
		this.viewCuctomers.click();
		
	}
	public void clickBackHomepage() {
		this.BckHomePage.click();
		
	}
	public void clickcreateCustomers() {
		this.createCustomer.click();
		
	}
	
	public void clickcancelBttn() {
		this.cancelButton.click();
		
	}
	
	public void enterCustomerName(String customerNme) {
		this.customerNme.clear();
		this.customerNme.sendKeys(customerNme);
		
	}
	public void selectLogo(String Browsebtt) {
		this.Browsebtt.sendKeys(Browsebtt);
		
	}
	public void enterEmailid(String emailid ) {
		this.emailid.clear();
		this.emailid.sendKeys(emailid);
		
	}
	public void enterPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
		
	}
	public void clickSubmitButton() {
		this.submitbbtn.click();
		
	}
	
	
}
