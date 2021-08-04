# ANZPOCCucumberAutomationProject

# Create a UI Automation Framework using Cucumber-Java 

# Process to Run:

# There are three ways to run the automation script:

# 1. Run the MyTestRunner.class by the JUnit Test in Eclipse

# 2. Run the automation script by docuble clicking the "run.bat" file

# 3. Open the command prompt, go to the project location and run the command "mvn verify"


# HTML Extent Report Location:

# Go to the 'test-output' folder of the project workspace and there is a 'SparkReport' folder and "Index.html" report is available under that folder.




# Questions::

# 1.	What other tests would you suggest could be written? You do not need to write them out in detail or code them.

# Ans: Please find following other scenarios:

#	> Verify borrowing amount when Application type as "Joint" 
#	> Verify borrowing amount when Number of dependants with different sets of values
#	> Verify borrowing amount when select 'Property you would like to buy' as "Residential investment" 
#	> Verify borrowing amount with default values and click on "Work out how much I could borrow" option
#	> Verify "Start over" option will not be displayed when do not click on "Work out how much I could borrow" option
#	> Verify title of the page
#	> Verify negative value will not accept in all fields of 'Your earnings' and 'Your expenses' sections
#	> Verify decimal value will not accept in all fields of 'Your earnings' and 'Your expenses' sections
#	> Verify only integer value will accept in all fields of 'Your earnings' and 'Your expenses' sections
#	> Verify 'calculate-repayments' page will be navigated if user clicks on 'ANZ repayments calculator' option

# 2.	If this test was part of a much larger test set, how would you speed it up?

# Ans: By using Parallel execution, we can speed up the execution. We can use TestNG for Parallel execution, so that every scenario will be executed in parallel.

# 3.	Sometimes UI tests can fail unpredictably. For example, the page may not have fully loaded before test automation attempts to click a button on a webpage. 
#	How would you improve reliability of these tests?
	
# Ans: By using proper Wait commands (implicitWait, explicit wait and Fluent wait), we can improve reliability of these tests
