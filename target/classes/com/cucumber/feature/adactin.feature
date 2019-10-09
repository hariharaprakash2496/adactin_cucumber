Feature: Automation Functional Test Scripts for Adactin Web Application

Background:

Given Launch the application using 'https://adactin.com/HotelApp/' URL

When Enter the username 'sharax1001' in Login Page

And Enter the Password 'sharax1001' in Login Page

And Click on Login button in Login Page

Then Verify whether logged in username 'sharax1001' is displayed in Search Hotel Page

#Login

Scenario: To verify the valid login details

Given Launch the application using 'https://adactin.com/HotelApp/' URL

When Enter the username 'sharax1001' in Login Page

And Enter the Password 'sharax1001' in Login Page

And Click on Login button in Login Page

Then Verify whether logged in username 'sharax1001' is displayed in Search Hotel Page

And Verify whether logout button is displayed in Search Hotel Page

 

#CheckOutDateLaterThanCheckIn

Scenario: To verify whether the check-out date field accepts a later date than checkin date

When Select the location 'Sydney' in Search Hotel Page

And Select the Hotel 'Hotel creek' in Search Hotel Page

And Select the Room Type as 'standard' in Search Hotel Page

And Select the no.of rooms as '1' in Search Hotel Page

And Select the Check-in date as (today+7) date in Search Hotel Page

And Select Check-out date as (today+5) date in Search Hotel Page

Then verify that gives an error saying 'check-in-date should not be later than check-out-date'

 

#PastCheckInAndOut

Scenario: To check if error is reported if check-out date field is in the past

When Select the location 'Sydney' in Search Hotel Page

And Select the Hotel 'Hotel creek' in Search Hotel Page

And Select the Room Type as 'standard' in Search Hotel Page

And Select the no.of rooms as '1' in Search Hotel Page

And Select the Check-in date as (today-5) date in Search Hotel Page

And Select Check-out date as (today-3) date in Search Hotel Page

Then verify that the application throws error message as 'Enter Valid dates'

 

#LocationInSelect

Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel

When Select the location 'Sydney' in Search Hotel Page

And Select the Hotel 'Hotel creek' in Search Hotel Page

And Select the Room Type as 'standard' in Search Hotel Page

And Select the no.of rooms as '1' in Search Hotel Page

And Select the Check-in date as (today) date in Search Hotel Page

And Select Check-out date as (today+3) date in Search Hotel Page

And Select No.of Adults in Search Hotel Page

And Select No.of Children in Search Hotel Page

And Click on Search button in Search Hotel Page

Then Verify that hotel displayed is the same as selected in search Hotel form.

 