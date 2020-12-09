package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class HomePagePOM {
private WebDriver driver; 
	
	public HomePagePOM
	(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@id='dropdown-2']/button")
	private WebElement Category; 
	
	@FindBy(xpath="//*[@id='DivHome']/div[2]/div/div[2]/input")
	private WebElement SearchBox; 
		
	@FindBy(xpath="//*[@id='DivHome']/div[2]/div/div[2]/button/img")
	private WebElement Searchbttn;
	
	@FindBy(xpath="//*[@id='dropdown-1']/button")
	private WebElement Sortby;
	
	@FindBy(xpath="//*[@id='dropdown-1']/div/ibm-dropdown-list/ul/li[3]/div")
	private WebElement Sortbyoption;
	
	@FindBy(xpath="//*[@id='datepicker-0-input']")
	private WebElement selectCal;
	
	@FindBy(xpath="//div/div[2]/div/span[6]")
	private WebElement selectDate;
	
	@FindBy(xpath="//*[@id='DivHome']/div[4]/div[2]/div[2]/button/span")
	private WebElement selectGoButton;
	
	@FindBy(xpath="//tr[1]/td[6]/span[1]/img")
	private WebElement selectActions;
	
	@FindBy(xpath="//*[@id='DivHome']/div[2]/button[1]")
	private WebElement CancelBttn;
	
	@FindBy(xpath="//*[@id='pagination-select-items-per-page-0']")
	private WebElement Pagination;
	
		
	public void enterSearchbox(String SearchBox) {
		this.SearchBox.clear();
		this.SearchBox.sendKeys("app1");
	}
	
	public void clickSearchBttn() {
		this.Searchbttn.click();
	}
	public void clickSortBy() {
		this.Sortby.click();
		
	}
	public void selectCretDateOption() {
		this.Sortbyoption.click();
		
	}
	public void selectCalender() {
		this.selectCal.click();
		
	}
	public void selectDay() {
		this.selectDate.click();
		
	}
	
	public void clickGoBttn() {
		this.selectGoButton.click();
		
	}
	public void clickActions() {
		this.selectActions.click();
		
	}
	public void clickcancel() {
		this.CancelBttn.click();
		
	}
	public void selectpages() {
		Select se = new Select(Pagination);
        se.selectByVisibleText("20");
	
		}
}

