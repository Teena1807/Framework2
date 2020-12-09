package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='login']/div[3]/ibm-label/div/input")
	private WebElement userName; 
	
	@FindBy(id="passwordField")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login']/div[3]/button")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
/*	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}*/
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
