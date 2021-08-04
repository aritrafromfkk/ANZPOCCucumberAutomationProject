package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeLoanCalculatorPage {
	
	private WebDriver driver;
	
	public HomeLoanCalculatorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By Locators:
	private By appType = By.id("application_type_single");
	private By noOfDepends = By.xpath("(//*[contains(text(),'Number of dependants')]/following::select)");
	private By propertyBuy = By.xpath("//input[@id='borrow_type_home']");
	private By yourIncome = By.xpath("(//*[contains(text(),'Your income (before tax)')]/following::input)[1]");
	private By yourOtherIncome = By.xpath("(//*[contains(text(),'Your income (before tax)')]/following::input)[2]");
	private By livingExpenses = By.xpath("(//*[contains(text(),'Living expenses')]/following::input)[1]");
	private By homeLoanRepayments = By.xpath("(//*[contains(text(),'Living expenses')]/following::input)[2]");	
	private By otherLoanRepayments = By.xpath("(//*[contains(text(),'Living expenses')]/following::input)[3]");;
	private By otherCommitments = By.xpath("(//*[contains(text(),'Living expenses')]/following::input)[4]");;
	private By totCredLimits = By.xpath("(//*[contains(text(),'Living expenses')]/following::input)[5]");;	
	private By btnBorrow = By.id("btnBorrowCalculater");	
	private By borrowEstimateAmount = By.id("borrowResultTextAmount");
	private By btnStartOver = By.xpath("(//button[text()='Start over'])[1]");	
	private By txtEstimateMessage = By.xpath("//span[contains(text(),'Based on the details')]");

	
	//Actions
	public void selectAppType() {
		driver.findElement(appType).click();		
	}
	
	public void selectDependent() {
		Select dependent = new Select (driver.findElement(noOfDepends));
		dependent.selectByIndex(0);		
	}
	
	public void selectPropertyType() {
		driver.findElement(propertyBuy).click();		
	}
	
	public void enterYourIncome(String income) {
		driver.findElement(yourIncome).click();
		driver.findElement(yourIncome).sendKeys(income);	
	}
	
	public void enterOtherIncome(String otherIncome) {
		driver.findElement(yourOtherIncome).click();
		driver.findElement(yourOtherIncome).sendKeys(otherIncome);	
	}
	
	public void enterLivingExpense(String livingExpense) {
		driver.findElement(livingExpenses).click();
		driver.findElement(livingExpenses).sendKeys(livingExpense);	
	}
	
	public void enterHomeLoanRep(String homeLoanRep) {
		driver.findElement(homeLoanRepayments).click();
		driver.findElement(homeLoanRepayments).sendKeys(homeLoanRep);	
	}
	
	public void enterOtherLoanRep(String otherLoanRep) {
		driver.findElement(otherLoanRepayments).click();
		driver.findElement(otherLoanRepayments).sendKeys(otherLoanRep);	
	}
	
	public void enterOtherCommit(String OtherCommit) {
		driver.findElement(otherCommitments).click();
		driver.findElement(otherCommitments).sendKeys(OtherCommit);	
	}
	
	public void enterTotCredLimits(String credLimits) {
		driver.findElement(totCredLimits).click();
		driver.findElement(totCredLimits).sendKeys(credLimits);	
	}
	
	public void clickOnBorrow() {
		driver.findElement(btnBorrow).click();	
	}
	
	public void clickOnbtnStartover() {
		 driver.findElement(btnStartOver).click();
	}
	
	public boolean dispsBorrowEstimate() {
		return driver.findElement(borrowEstimateAmount).isDisplayed();	
	}
	
	public String dispBorrowEstimateAmount() {
		 return driver.findElement(borrowEstimateAmount).getText();	
	}
	
	public String dispTxtEstimateMessage() {
		return driver.findElement(txtEstimateMessage).getText().trim();
	}
	
	
	public WebElement getBorrowEstimateAmount() {
		return driver.findElement(borrowEstimateAmount);
	}
	
	public WebElement getTxtEstimateMessage() {
		return driver.findElement(txtEstimateMessage);
	}
	
	
	public WebElement getTotCreditLimits() {
		return driver.findElement(totCredLimits);
	}
	
	public WebElement getbtnBorrow() {
		return driver.findElement(btnBorrow);
	}
	
	public WebElement getbtnStartOver() {
		return driver.findElement(btnStartOver);
	}
	
	
	//get value	
	public String getPropertyBuy() {
		System.out.println("Property Type selected " + driver.findElement(propertyBuy).getText().trim());
		return driver.findElement(propertyBuy).getText().trim();
	}

	
	public Integer getYourIncome() {
		System.out.println("Your Income: " + Integer.parseInt(driver.findElement(yourIncome).getAttribute("value")));
		return Integer.parseInt(driver.findElement(yourIncome).getAttribute("value"));
	}

	
	public Integer getYourOtherIncome() {
		System.out.println("Your Other Income: " + Integer.parseInt(driver.findElement(yourOtherIncome).getAttribute("value")));
		return Integer.parseInt(driver.findElement(yourOtherIncome).getAttribute("value"));
	}

	
	public Integer getLivingExpenses() {
		System.out.println("Living expenses: " + Integer.parseInt(driver.findElement(livingExpenses).getAttribute("value")));
		return Integer.parseInt(driver.findElement(livingExpenses).getAttribute("value"));
	}

	public Integer getHomeLoanRepayments() {
		System.out.println("Current home loan repayments: " + Integer.parseInt(driver.findElement(homeLoanRepayments).getAttribute("value")));
		return Integer.parseInt(driver.findElement(homeLoanRepayments).getAttribute("value"));
	}

	
	public Integer getOtherLoanRepayments() {
		System.out.println("Other loan repayments: " + Integer.parseInt(driver.findElement(otherLoanRepayments).getAttribute("value")));
		return Integer.parseInt(driver.findElement(otherLoanRepayments).getAttribute("value"));
	}

	public Integer getOtherCommitments() {
		System.out.println("Other commitments: " + Integer.parseInt(driver.findElement(otherCommitments).getAttribute("value")));
		return Integer.parseInt(driver.findElement(otherCommitments).getAttribute("value"));
	}

	
	public Integer getTotCredLimits() {
		System.out.println("Total credit card limits: " + Integer.parseInt(driver.findElement(totCredLimits).getAttribute("value")));
		return Integer.parseInt(driver.findElement(totCredLimits).getAttribute("value"));
	}	

}
