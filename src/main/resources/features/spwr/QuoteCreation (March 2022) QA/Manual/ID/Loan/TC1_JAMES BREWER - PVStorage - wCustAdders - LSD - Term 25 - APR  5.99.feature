Feature: ID Loan_QA_QuoteCreationE2E

#Author: lcaesar@sunpowercorp.com
#Date Created: 03/17/2022
#Date Modified: 
#Last Modified by:

@QA_ID_PenFedRefi_1

Scenario: TC1_JAMES BREWER - PVStorage - wCustAdders - LSD - Term 25 - APR  5.99.feature

#QA - Start New Residential Customer Account creation
Given User navigates to SunPower Partner Portal using "Chrome" browser
When User logs in at QA as an ID
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "JAMES" and Last Name as "BREWER"
And User enters his/her Residential Email as "Testblueraven+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
Then User enters Residential address as "1431 S Vernon St, Anaheim, CA 92805, USA"
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
Then User enters the module type as "425W M-425-BLK-H-AC"
Then User enters the Shading Measurement Date as date today
Then User clicks on the SunVault Storage button
And clicks on the New Roof button
Then New Roof modal is displayed
And User enters a value for Pitch as "5"
And User enters a value for Azimuth as "180"
And User enters a value for Module Count as "51"
And User enter values for Roof Solar Access Percentages for Jan-Dec as "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "99"
Then User saves the changes

#QA - Continuation of EDDiE portal Design page activities
When User clicks the Quote Settings button
Then the Quote Settings modal is displayed
When User enters "60000" in the Gross Price tab for Loan option
Then User enters "5000" as Custom Adders for Loan
Then User enters "1500" in the Storage Dealer Commission tab for Loan option
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button

When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button
Then User will click on the Calculator tab of the Loan Pricing pane
When User will click on Edit Loan
Then User will enter "25" as the Loan Term
Then User will enter "5.99" as the APR
When User will click on the Save Pricing button
Then User will click lock the quote  with the preferred payment option
Then User ends the test scenario