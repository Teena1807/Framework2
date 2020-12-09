package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePageAppCreateFlowPOM {
private WebDriver driver; 
	
	public HomePageAppCreateFlowPOM
	(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@id='DivHome']/div[3]/div[1]/div[1]")
	private WebElement flowName; 
	
	@FindBy(css="button.flowTogglebtn")
	private WebElement saveBttn;
	
	@FindBy(xpath="//app-input-src/div/div/div[1]/ibm-label/div/input")
	private WebElement hostName; 
	
	@FindBy(xpath="//app-input-src/div/div/div[2]/ibm-label/div/input")
	private WebElement parDir;  
	
	@FindBy(xpath="//div/div/div[3]/div[1]/ibm-label/div/input")
	
	private WebElement userName; 
	
	@FindBy(xpath="//*[@id='passwordField']")
	private WebElement password; 
	
	@FindBy(css="button.btnRightBtm")
	private WebElement continueBtn;
	
	@FindBy(xpath="//tr[1]/td[1]/ibm-checkbox/div/label")
	private WebElement selectLog;
	
	@FindBy(xpath="//div[1]/ibm-label/div/input")
	private WebElement Indexname;
	
	@FindBy(xpath="//div[2]/div[1]/ibm-toggle/label[2]/span")
	private WebElement enableOffset;
	
	@FindBy(xpath="//div[2]/div[2]/ibm-toggle/label[2]/span")
	private WebElement customPattern;
	
	@FindBy(xpath="//div[2]/div[3]/ibm-toggle/label[2]/span")
	private WebElement depublication;
	
	@FindBy(css="select.bx--select-input")
	private WebElement Connectorname;
	
	@FindBy(xpath="//div[1]/div[2]/ibm-label/div/input")
	private WebElement opHostName;
	
	@FindBy(xpath="//div[2]/div[1]/ibm-label/div/input")
	private WebElement opuserName;
	
	@FindBy(xpath="//div/app-review-save/div/a/span")
	private WebElement exportJson;
	
	@FindBy(xpath="//div/div/div[1]/h5/span/img")
	private WebElement editFlowName;
	
	@FindBy(xpath="//div/div/div[2]/h5/span/img")
	private WebElement editInputSrcCon;
	
	@FindBy(xpath="//div/div[2]/div[4]/h5/span/img")
	private WebElement editLogSel;
	
	@FindBy(xpath="//div/div/div[3]/h5/span")
	private WebElement editLogParser;
	
	@FindBy(xpath="//div/div/div[4]/h5/span")
	private WebElement editdeduplication;
	
	@FindBy(xpath="//div/div[4]/div[4]/h5/span/img")
	private WebElement editoutputCon;
	
	@FindBy(xpath="//div/div[5]/h5/span/img")
	private WebElement editStoandTarget;
	
	@FindBy(xpath="//ibm-progress-indicator/ul/li[7]/div/p")
	private WebElement backonReviewPage;
	
	
	
	public void sendFlowName(String flowName) {
		WebElement page1=new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='DivHome']"))));
		page1.click();
		this.flowName.click();
		this.flowName.sendKeys(flowName);
			
		
	}
	public void clickUserSaveBttn() {
		this.saveBttn.click();
		
	}
	public void sendHostName(String hostName) {
		this.hostName.clear();
		this.hostName.sendKeys(hostName);
		
	}
	public void sendParDir(String parDir) {
		this.parDir.clear();
		this.parDir.sendKeys(parDir);
		
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		
	}
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password  );
		
	}
	public void clickContButton() {
		this.continueBtn.click();
    }
	
	public void selectLog() {
		this.selectLog.click();
    }
	
	public void sendIndexName(String Indexname) {
		this.Indexname.clear();
		this.Indexname.sendKeys(Indexname  );
		
	}
	
	public void enableOffset() {
		this.enableOffset.click();
    }
	
	public void enableCustomPattern() {
		this.customPattern.click();
    }
	
	public void enableDepublication() {
		this.depublication.click();
    }
	
	public void selConName() {
		Select se = new Select(Connectorname);
        se.selectByVisibleText("Elasticsearch");
}
	public void sendopHostName(String opHostName) {
		this.opHostName.clear();
		this.opHostName.sendKeys(opHostName);
}

	public void sendopuserName(String opuserName) {
		this.opuserName.clear();
		this.opuserName.sendKeys(opuserName);
}
	public void editFlowname() {
		this.editFlowName.click();
}
	public void editinputconnector() {
		this.editInputSrcCon.click();
}
	public void editLogSelector() {
		this.editLogSel.click();
}
	public void editLogParser() {
		this.editLogParser.click();
}
	public void editDeduplication() {
		this.editdeduplication.click();
}
	public void editOutputConnector() {
		this.editoutputCon.click();
}
	public void editStorage() {
		this.editStoandTarget.click();
}
	public void clickReviewPage() {
		this.backonReviewPage.click();
}
	public void clickExportJson() {
		this.exportJson.click();
}
}