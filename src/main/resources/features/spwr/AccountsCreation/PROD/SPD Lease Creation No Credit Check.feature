Feature: PROD_SPD_Lease

#Author: lcaesar@sunpowercorp.com
#Date Created: 01/07/2022
#Date Modified: 
#Last Modified by:

Scenario: SPD Lease Creation No Credit Check

#QA - Start New Residential Customer Account creation
Given User navigates to PROD SunPower Partner Portal using "Chrome" browser
When User logs in at PROD as SPD
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Residential Customer account in UAT

#QA - Start input details for Residential Customer Account 
Then Residential - New Account page is displayed
Then User enters his/her Residential First Name as "aManualTest" and Last Name as "spdLease01"
And User enters his/her Residential Email as "dumdum11990+" "random digits input here"
And User enters his/her Residential Phone Number as "5555550800"
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
And User enters the module type as '400W A-400-BLK-G-AC'
Then User enters the Shading Measurement Date as date today
And clicks on the New Roof button
Then New Roof modal is displayed
And User enters a value for Pitch as "5"
And User enters a value for Azimuth as "180"
And User enters a value for Module Count as "30"
And User enter values for Roof Solar Access Percentages for Jan-Dec as "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "98" , "99"
Then User saves the changes

#QA - Continuation of EDDiE portal Design page activities
When User clicks the Quote Settings button
Then the Quote Settings modal is displayed
Then User unticks the show Cash option
Then User checks the show Lease option
And User enters "4.00" in the Price Per Watt tab for Lease option
Then User unticks the show Cash option
Then clicks on save changes for the Quote Settings modal
Then User clicks on the Save Design button

When the EDDiE portal Design page will calculate savings
Then User will click on View Estimated Savings button
And User will click on the EDDiE Savings button
And User will click the arrow button to select preferred payment option as Lease
Then User ends the test scenario