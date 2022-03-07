Feature: TPS_UAT_LoanQuoteCreation

#Author: lcaesar@sunpowercorp.com
#Date Created: 03/06/2022
#Date Modified: 
#Last Modified by:

@UAT_ND_PenFedRefi

Scenario: TC2_PVStorage- IL - wCustAdders - Term 20 - APR 0.99

#QA - Start New Residential Customer Account creation
Given User navigates to UAT SunPower Partner Portal using "Chrome" browser
When User logs in at UAT as ND
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "PenfedRefi" and Last Name as "ndtest02"
And User enters his/her Residential Email as "Testblueraven+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
Then User enters Residential address as "IL 998 Butler Dr, Crystal Lake, IL 60014"
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
Then  User clicks on the SunVault Storage button
Then User adds the Front Edge Skirt Accessory
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
And User enters "4.00" in the Price Per Watt tab for Loan option
Then User enters "2000" in the Storage Dealer Commission tab for Loan option
Then User enters "1800" as Custom Adders for Loan
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button

When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button
Then User will click on the Calculator tab of the Loan Pricing pane
When User will click on Edit Loan
Then User will enter "20" as the Loan Term
Then User will enter "0.99" as the APR
When User will click on the Save Pricing button
Then User will click lock the quote  with the preferred payment option
Then User ends the test scenario