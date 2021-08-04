package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.factory.DriverFactory;
import com.pages.HomeLoanCalculatorPage;
import com.util.ConfigReader;
import com.util.Constants;
import com.util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoanCalculatorSteps {
	
	private HomeLoanCalculatorPage homeLoanCacPage = new HomeLoanCalculatorPage(DriverFactory.getDriver());
	private Utility utility = new Utility(DriverFactory.getDriver());
	private ConfigReader config = new ConfigReader();

	
	@Given("user is on Calculator and tools page of Home loans page")
	public void user_is_on_calculator_and_tools_page_of_home_loans_page() throws InterruptedException {
		
	    DriverFactory.getDriver().get(Constants.URL);
	    utility.waitForElement(DriverFactory.getDriver(), homeLoanCacPage.getTotCreditLimits());
	}
	
	@When("user select Application Type as Single and Number of dependants as zero")
	public void user_select_application_type_single_and_number_of_dependants() {
				
		DriverFactory.getDriver().findElement(By.id("application_type_single")).click();
		homeLoanCacPage.selectDependent();
	}
	@When("choose the Property to buy as home to live in")
	public void choose_the_property_to_buy_as_home_to_live_in() {
		
		homeLoanCacPage.selectPropertyType();
	    
	}
	@When("users enters Your income {string} and Your other income {string}")
	public void users_enters_your_income_and_your_other_income(String yourIncome, String yourOtherIncome) {
		
		homeLoanCacPage.enterYourIncome(yourIncome);		
		homeLoanCacPage.enterOtherIncome(yourOtherIncome);		
	}
	
	@When("users enters Living expenses {string} and Current home loan repayments {string}")
	public void users_enters_living_expenses_and_current_home_loan_repayments(String livingExpenses, String currentHomeLoanRepayments) {
		
		homeLoanCacPage.enterLivingExpense(livingExpenses);
		homeLoanCacPage.enterHomeLoanRep(currentHomeLoanRepayments);
	}
	
	@When("enters Other loan repayments {string} and Other commitments {string}")
	public void enters_other_loan_repayments_and_other_commitments(String otherLoanRepayments, String otherCommitments) {
		
		homeLoanCacPage.enterOtherLoanRep(otherLoanRepayments);
		homeLoanCacPage.enterOtherCommit(otherCommitments);	    
	}
	
	@When("enters Total credit card limits {string}")
	public void enters_total_credit_card_limits(String totalCreditCardLimits) {
		
	    
		homeLoanCacPage.enterTotCredLimits(totalCreditCardLimits);	
		utility.waitForElement(DriverFactory.getDriver(), homeLoanCacPage.getbtnBorrow());
	}
	
	@When("users click on Work out how much I could borrow option")
	public void users_click_on_work_out_how_much_i_could_borrow_option() throws InterruptedException {
		
		
		homeLoanCacPage.clickOnBorrow();	
		utility.waitForElement(DriverFactory.getDriver(), homeLoanCacPage.getBorrowEstimateAmount());
		Thread.sleep(5000);
	}
	
	@When("users clicks on Work out how much I could borrow option")
	public void users_clicks_on_work_out_how_much_i_could_borrow_option() throws InterruptedException {		
		
		homeLoanCacPage.clickOnBorrow();	
		Thread.sleep(10000);
		
	}
	
	@Then("calculator should display the borrowing estimate {string}")
	public void calculator_should_display_the_borrowing_estimate_$(String expectedBorrowAmount) {	 
		
		String actualAmount = homeLoanCacPage.dispBorrowEstimateAmount();		
		Assert.assertEquals(expectedBorrowAmount, actualAmount);	    
	}
	
	@When("click on Start over button")
	public void user_click_on_start_over_button() {
		JavascriptExecutor js = ((JavascriptExecutor)DriverFactory.getDriver());
		js.executeScript("arguments[0].scrollIntoView();",homeLoanCacPage.getbtnStartOver());
		
	    utility.waitForElement(DriverFactory.getDriver(), homeLoanCacPage.getbtnStartOver());
	    homeLoanCacPage.clickOnbtnStartover();

	}

	@Then("Form should be clear")
	public void form_should_be_clear() {

		Assert.assertTrue(homeLoanCacPage.getYourIncome() == Constants.initialYourIncome);		
		Assert.assertTrue(homeLoanCacPage.getYourOtherIncome() == Constants.initialYourOtherIncome);		
		Assert.assertTrue(homeLoanCacPage.getLivingExpenses() == Constants.initialLivingExpenses);		
		Assert.assertTrue(homeLoanCacPage.getHomeLoanRepayments() == Constants.initialHomeLoanRepayments);		
		Assert.assertTrue(homeLoanCacPage.getOtherLoanRepayments() == Constants.initialOtherLoanRepayments);		
		Assert.assertTrue(homeLoanCacPage.getOtherCommitments() == Constants.initialOtherCommitments);		
		Assert.assertTrue(homeLoanCacPage.getTotCredLimits() == Constants.initialTotCredLimits);
	}
	
	
	@Then("calculator should display the message {string}")
	public void calculator_should_display_the_message(String expectedBorrowTxt) {
		
		utility.waitForElement(DriverFactory.getDriver(), homeLoanCacPage.getTxtEstimateMessage());
		String actualBorrowTxt = homeLoanCacPage.dispTxtEstimateMessage();
		expectedBorrowTxt = Constants.expectedBorrowTxt;
		
		Assert.assertEquals(actualBorrowTxt, expectedBorrowTxt);
	   
	}
	


}
