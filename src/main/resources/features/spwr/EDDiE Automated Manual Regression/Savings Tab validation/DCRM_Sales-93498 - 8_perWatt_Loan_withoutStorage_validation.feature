Feature: DCRM_Sales-93498 - 8_perWatt_Loan_withoutStorage_validation
#Author: lcaesar@sunpowercorp.com
#Date Created: 06/15/2021
#Date Modified: 
#Last Modified by:

@regression

Scenario: 8 per watt loan validation

#QA - Start New Residential Customer Account creation
Given User opens the "Chrome" browser
When User logs in at "UAT" environment of the SunPower Partner Portal
And As this "UAT SPD" user partner
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "Regautotest" and Last Name as "8ppwLoanCheck"
And User enters his/her Residential Email as "dumdum11990+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
Then User enters Residential address as "16388 Midwood Dr, Granada Hills, CA 91344, USA"
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
Then User enters the Shading Measurement Date as date today
And clicks on the New Roof button
Then New Roof modal is displayed
And User enters a value for Pitch as "5"
And User enters a value for Azimuth as "180"
And User enters a value for Module Count as "10"
And User enter values for Roof Solar Access Percentages for Jan-Dec as "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "99"
Then User saves the changes

#QA - Continuation of EDDiE portal Design page activities
When User clicks the Quote Settings button
Then the Quote Settings modal is displayed
And User enters "5.80" in the Price Per Watt tab for Loan option
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button
When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button

#And User will click on the EDDiE Savings button
And User will click the arrow button to select preferred payment option as Loan
Then User takes a screenshot of the current state of the web application
Then User ends the test scenario
#And User will verify if the quote will be locked; Total Loan Amount/System size per wattage = actual PPW value 
#176252038