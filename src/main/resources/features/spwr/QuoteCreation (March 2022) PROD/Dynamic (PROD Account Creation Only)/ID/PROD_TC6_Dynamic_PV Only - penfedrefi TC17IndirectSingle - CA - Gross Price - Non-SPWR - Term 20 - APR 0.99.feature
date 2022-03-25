Feature: ID DynamicLoan_PROD_AccountCreation

#Author: lcaesar@sunpowercorp.com
#Date Created: 03/17/2022
#Date Modified: 
#Last Modified by:

@PROD_ID_PenFedRefi_dynamic

Scenario: TC6_Dynamic_PV Only - penfedrefi TC17IndirectSingle - CA - Gross Price - Non-SPWR - Term 20 - APR 0.99

#QA - Start New Residential Customer Account creation
Given User navigates to PROD SunPower Partner Portal using "Chrome" browser
When User logs in at PROD as an ID
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "manualtest" and Last Name as "penfedrefi TC17IndirectSingle"
And User enters his/her Residential Email as "Testblueraven+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
Then User enters Residential address as "2244 Walnut Grove Avenue Rosemead, CA 91770"
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