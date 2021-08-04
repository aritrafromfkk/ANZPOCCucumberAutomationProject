Feature: Home loan borrowing power Calculator Page Feature

Scenario Outline: Borrowing estimate of home loans in Calculator and tools page
Given user is on Calculator and tools page of Home loans page
When user select Application Type as Single and Number of dependants as zero
And  choose the Property to buy as home to live in
When users enters Your income "<yourIncome>" and Your other income "<yourOtherIncome>" 
When users enters Living expenses "<livingExpenses>" and Current home loan repayments "<currentHomeLoanRepayments>"
And  enters Other loan repayments "<otherLoanRepayments>" and Other commitments "<otherCommitments>" 
And  enters Total credit card limits "<totalCreditCardLimits>"
When users click on Work out how much I could borrow option 
Then calculator should display the borrowing estimate "<expectedBorrowAmount>"

Examples:
	|yourIncome|yourOtherIncome|livingExpenses|currentHomeLoanRepayments|otherLoanRepayments|otherCommitments|totalCreditCardLimits|expectedBorrowAmount|
	
	|80000 		 |10000          |500           |0												|100								|0							 |10000								 |$479,000						|
	



Scenario Outline: Clear the Form by clicking Start over button
Given user is on Calculator and tools page of Home loans page
When user select Application Type as Single and Number of dependants as zero
And  choose the Property to buy as home to live in
When users enters Your income "<yourIncome>" and Your other income "<yourOtherIncome>" 
When users enters Living expenses "<livingExpenses>" and Current home loan repayments "<currentHomeLoanRepayments>"
And  enters Other loan repayments "<otherLoanRepayments>" and Other commitments "<otherCommitments>" 
And  enters Total credit card limits "<totalCreditCardLimits>"
When users click on Work out how much I could borrow option 
And  click on Start over button
Then Form should be clear 

Examples:
	|yourIncome|yourOtherIncome|livingExpenses|currentHomeLoanRepayments|otherLoanRepayments|otherCommitments|totalCreditCardLimits|
	
	|80000 		 |10000          |500           |0												|100								|0							 |10000								 |


Scenario Outline: Borrowing estimate of home loans when $1 for Living expenses and leaving all other fields as zero
Given user is on Calculator and tools page of Home loans page
When user select Application Type as Single and Number of dependants as zero
And  choose the Property to buy as home to live in
When users enters Your income "<yourIncome>" and Your other income "<yourOtherIncome>" 
When users enters Living expenses "<livingExpenses>" and Current home loan repayments "<currentHomeLoanRepayments>"
And  enters Other loan repayments "<otherLoanRepayments>" and Other commitments "<otherCommitments>" 
And  enters Total credit card limits "<totalCreditCardLimits>"
When users clicks on Work out how much I could borrow option 
Then calculator should display the message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641."


Examples:
	|yourIncome|yourOtherIncome|livingExpenses|currentHomeLoanRepayments|otherLoanRepayments|otherCommitments|totalCreditCardLimits|
	
	|0     		 |0              |1             |0												|0									|0							 	|0								   |
	
	
	