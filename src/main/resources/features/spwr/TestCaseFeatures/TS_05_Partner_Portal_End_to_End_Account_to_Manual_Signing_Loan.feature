Feature: PartnerPortal_E2E_AccountToManualQuotingWithSigning_Loan_05

#Author: lcaesar@sunpowercorp.com
#Date Created: 01/27/2021
#Date Modified: 
#Last Modified by:

Scenario: TS_05 Partner Portal End to End Account to Manual Signing Loan

#QA - Start New Residential Customer Account creation
Given User navigates to SunPower Partner Portal using "Chrome" browser
When User logs in as an Indirect Partner in QA
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "tAutomation" and Last Name as "02052021Test02"
And User enters his/her Residential Email as "dumdum11990+" "random digits input here"
And User enters his/her Residential Phone Number as "5555555555"
Then User enters Residential address as "2023 Florence Ave, Hazlet, NJ 07730, USA"
When User saves the new entry

#QA - Start Basic Info/Qualification/Quotes page of the Customer
Then Basic Info page of the Residential Customer is displayed
When User clicks on the Qualification tab
And User edits the Usage Input values
Then Electric Rate and Energy Usage modal is displayed
And User sets the value for Current Electric Rate
And Sets the value for Proposed Electric Rate
And Sets Total Annual Bill to "4000"
Then User saves the values inputted in the Electric Rate and Energy Usage modal
When User clicks the Quotes tab
And clicks on the New Manual Quote button

#QA - Start EDDiE portal Design page activities
When the EDDiE portal Design page is displayed
Then User enters the Shading Measurement Date as "02/05/2021"
And clicks on the New Roof button
Then New Roof modal is displayed
And User enters a value for Pitch as "5"
And User enters a value for Azimuth as "180"
And User enters a value for Module Count as "20"
And User enter values for Roof Solar Access Percentages for Jan-Dec as "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "99"
Then User saves the changes

#QA - Continuation of EDDiE portal Design page activities
When User clicks the Quote Settings button
Then the Quote Settings modal is displayed
And User checks the show Loan option
And User enters "4.00" in the Price Per Watt tab for Loan option
And User unticks the show Cash option
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button

When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button
And User will click on the EDDiE Savings button
And User will click the arrow button to select preferred payment option as Loan

#QA - Back to SunPower Quoting Page for Sending of Contract to Email
Then User will switch back to the original window
And User will refresh the page
Then User will click the Contract for Loan and will send it via Email

#QA - User to login his/her Gmail account to access Email to View Proposal
And User will open the StackOverflow app
And User will click the Log in button
And User will enter username and password credentials for the User
And User will navigate back to Gmail app
Then User will click on the Next Steps in Going Solar email to View Proposal

#QA - On the SDS MYSunPower page to Sign Proposal
And User will click on the Review & Sign Proposal
#Signing of proposal goes here
Then User will click on the MySunPower Create Account button
Then User enters a password and confirms it
Then User clicks the phone skip button

#QA - On the SDS MySunPower page for Credit Check Approval
When User will click on the Get Credit Approval button
Then User will enter name for Credit Check as "AutomationSpwrTest01"
And User will enter email for Credit Check as "dumdum11990@gmail.com"
Then User will click accept

#QA - On the SDS MySunPower Solar Address page information
When User enters "20" years living at this address
Then User will choose Yes for own or intend to own this home
And User will select Yes for primary residence
And User will click the next button on the Solar Address page

#QA - On the SDS MySunPower Credit Approval page information
And User will enter the date of birth as "01/01/1980"
Then User will enter Social Security Number as "555555555"
When User adds the Individual Annual Income as "15000000"
And Household Annual Income as "15000000"
And Monthly Mortgage Payment as "10000"
And the User is Retired
Then User will click Next on the Credit Approval page
And User agrees to the terms
Then User clicks Submit on the Credit Approval page
When the Credit Check is Approved
Then User will click Next to Review Agreement in QA Env

#QA - On the SDS MySunPower Agreement page
When the User is on the Sign Agreement page
Then User will sign the ACH Opt In form
#Signing of proposal goes here
And after the ACH OPT IN form is signed
Then User will sign the Loan Agreement Package
#Signing of proposal goes here
And the Agreement is Signed - Pending Further Action is displayed
Then User ends the test scenario