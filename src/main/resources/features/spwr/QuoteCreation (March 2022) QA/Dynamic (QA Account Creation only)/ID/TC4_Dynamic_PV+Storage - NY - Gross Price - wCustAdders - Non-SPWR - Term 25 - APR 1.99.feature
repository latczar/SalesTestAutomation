Feature: ID DynamicLoan_QA_AccountCreation

#Author: lcaesar@sunpowercorp.com
#Date Created: 03/17/2022
#Date Modified: 
#Last Modified by:

@QA_ID_PenFedRefi_dynamic

Scenario: TC4_Dynamic_PV+Storage - NJ - PPW - Non-SPWR - Term 15 - APR 0.99

#QA - Start New Residential Customer Account creation
Given User navigates to SunPower Partner Portal using "Chrome" browser
When User logs in at QA as an ID
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "PenfedRefi" and Last Name as "idtest04"
And User enters his/her Residential Email as "Testblueraven+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
Then User enters Residential address as "285 Maple Ave, Somerset, NJ 08873"
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