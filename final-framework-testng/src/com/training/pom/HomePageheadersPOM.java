package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageheadersPOM {
private WebDriver driver; 
	
	public HomePageheadersPOM
	(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	private WebElement welcome; 
	
	@FindBy(css="button.bx--header__menu-trigger")
	private WebElement Menubutton;
	
	@FindBy(xpath="//ibm-header-action[1]/button/div/span/img")
	private WebElement searchButton; 
	
	@FindBy(xpath="//ibm-header-action[3]/button")
	private WebElement userButton; 
	
	public void clickOpenMenuBttn() {
		this.Menubutton.click();
		
	}
	public void clickSearchBttn() {
		this.searchButton.click();
		
	}
	public void clickUserBttn() {
		this.userButton.click();
		
	}
}
