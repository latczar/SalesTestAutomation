Feature: PartnerPortal_E2E_AccountToManualQuotingWithSigning_Cash_04

#Author: lcaesar@sunpowercorp.com
#Date Created: 12/15/2020
#Date Modified: 
#Last Modified by:

Scenario: TS_04 Partner Portal End to End Account to Manual Signing Cash

#QA - Start New Residential Customer Account creation
Given User navigates to SunPower Partner Portal using "Chrome" browser
When User logs in as a partner
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "SPWRTest" and Last Name as "tAutomation01252021TestAm02"
And User enters his/her Residential Email as "dumdum11990+4448638@gmail.com"
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
And Sets Total Annual Bill to "400"
Then User saves the values inputted in the Electric Rate and Energy Usage modal
When User clicks the Quotes tab
And clicks on the New Manual Quote button

#QA - Start EDDiE portal Design page activities
When the EDDiE portal Design page is displayed
Then User enters the Shading Measurement Date as "01/23/2021"
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
And User enters "4.00" in the Price Per Watt tab for Cash option
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button
When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button
And User will click on the EDDiE Savings button
And User will click the arrow button to select preferred payment option as Cash

#QA - Back to SunPower Quoting Page for Agreement
When User will switch back to the original window
And User will click the Cash Contract button and generate agreement
Then User will click Send Contract
And User will open the StackOverflow app
And User will click the Log in button
And User will enter username and password credentials for the User
And User will navigate back to Gmail app
Then User will click on the SunPower Cash Agreement email to Review and Sign

#QA - Start of Adobe Sign page activities
#When User will click on the start button of the document
#Then User will sign the required fields on the Cash Agreement document
#When User will switch back to the original window

#QA - Back to SunPower Quoting page for sending of Contract via Email
#Then User will click on the Contract for Cash and will send it via Email
#And User will open the StackOverflow app
#And User will navigate back to Gmail app
#And User will enter username and password credentials for the Partner
#And User will navigate back to Gmail app
#Then User will click on the SunPower Counter Sign Cash Agreement email to Review and Sign

#QA - Back to SunPower Quoting page for sending of Contract via Email
#Then User will click on the Contract for Cash and will send it via Email
#And User will open the Gmail app
Then User ends the test scenario
