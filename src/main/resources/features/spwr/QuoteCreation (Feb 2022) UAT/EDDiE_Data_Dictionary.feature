Feature: #EDDiE Data Dictionary
Scenario: #EDDiE TC Step Template

#Author: lcaesar@sunpowercorp.com
#Date Created: 03/04/2022

#Sample @tags that we can use:
#- @UAT_ID_PenFedRefi
#- @UAT_ND_PenFedRefi
#- @UAT_SPD_PenFedRefi

#Selection of module types available per FO
Scenario Outline:
Then User enters the module type as "400W A-400-BLK-G-AC"
	Examples: 
		| FO  | Module |
		| Loan | 435W M-435-H-AC |
		| Loan | 425W M-425-BLK-H-AC |
		| Loan | 400W A-400-BLK-G-AC |
		| Loan | 370W X22-370-E-AC |
		| Loan | 350W X21-350-BLK-E-AC |
		| Loan | 360W X22-360-E-AC |
		| Loan | 327W E20-327-E-AC |		

#For Storage 1 - 0
Scenario Outline:
Given User clicks on the SunVault Storage button

#Indirect Racking types
Then User enters the Mounting type to Non-SunPower Ground Mount

#For Accessories, only for ND/SPD
When User adds the Front Edge Skirt Accessory
Then User adds the Critter Guard Skirt Accessory

#-----------------------------------------------------------------------------

#EDDiE Quote Settings
Then User enters "name here" for the new Quote Name
Then User enters "" in the Override Rebate tab

#Cash
When User unticks the show Cash option
When User enters "" in the Gross Price tab for Cash option
Then User enters "" in the Storage Dealer Commission tab for Cash option

#Lease
When User checks the show Lease option
Then User enters "" in the Price Per Watt tab for Lease option
Then User enters "" in the Price Per kWh tab for Lease option
Then User clicks on the Price Per kWh RUN button
When User enters "" in the Gross Price tab for Lease option
When User enters "" in the Storage Dealer Commission tab for Lease option

#Loan
Then User checks the show Loan option
Then User checks the show Loan option for OR$
Then User enters "" in the Gross Price tab for Loan option
Then User enters "" in the Storage Dealer Commission tab for Loan option
Then User enters "" as Custom Adders for Loan

#-----------------------------------------------------------------------------

#Savings tab - Loan Calculator
When User will click the arrow button to show the Loan Calculator pane
Then User will click on the Calculator tab of the Loan Pricing pane
When User will click on Edit Loan
When User will add a CoPayment input as "5000"
Then User will enter "10 | 15 | 20 | 25" as the Loan Term
Then User will enter "0.99 | 3.99" as the APR
When User will click on the Save Pricing button
Then User will click lock the quote  with the preferred payment option
#10 - 0.99%, 3.99%
#15 - 0.99%, 1.99%, 4.99%
#20 - 0.00%, 0.99%, 2.99%, 5.99%
#25 - 1.99%, 3.49%, 5.99%