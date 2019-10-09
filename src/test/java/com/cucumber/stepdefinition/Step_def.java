package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.Object_Manager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def {
	public static WebDriver driver= Object_Manager.driver;
public static Object_Manager op=new Object_Manager(driver)
;	@Given("^Launch the application using 'https://adactin\\.com/HotelApp/' URL$")
	public void launch_the_application_using_https_adactin_com_HotelApp_URL() throws Throwable {
	
		// Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^Enter the username 'sharax(\\d+)' in Login Page$")
	public void enter_the_username_sharax_in_Login_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enter the Password 'sharax(\\d+)' in Login Page$")
	public void enter_the_Password_sharax_in_Login_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Click on Login button in Login Page$")
	public void click_on_Login_button_in_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify whether logged in username 'sharax(\\d+)' is displayed in Search Hotel Page$")
	public void verify_whether_logged_in_username_sharax_is_displayed_in_Search_Hotel_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify whether logout button is displayed in Search Hotel Page$")
	public void verify_whether_logout_button_is_displayed_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the location 'Sydney' in Search Hotel Page$")
	public void select_the_location_Sydney_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the Hotel 'Hotel creek' in Search Hotel Page$")
	public void select_the_Hotel_Hotel_creek_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the Room Type as 'standard' in Search Hotel Page$")
	public void select_the_Room_Type_as_standard_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the no\\.of rooms as '(\\d+)' in Search Hotel Page$")
	public void select_the_no_of_rooms_as_in_Search_Hotel_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the Check-in date as \\(today\\+(\\d+)\\) date in Search Hotel Page$")
	public void select_the_Check_in_date_as_today_date_in_Search_Hotel_Page1(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select Check-out date as \\(today\\+(\\d+)\\) date in Search Hotel Page$")
	public void select_Check_out_date_as_today_date_in_Search_Hotel_Page1(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify that gives an error saying 'check-in-date should not be later than check-out-date'$")
	public void verify_that_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the Check-in date as \\(today-(\\d+)\\) date in Search Hotel Page$")
	public void select_the_Check_in_date_as_today_date_in_Search_Hotel_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select Check-out date as \\(today-(\\d+)\\) date in Search Hotel Page$")
	public void select_Check_out_date_as_today_date_in_Search_Hotel_Page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify that the application throws error message as 'Enter Valid dates'$")
	public void verify_that_the_application_throws_error_message_as_Enter_Valid_dates() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select the Check-in date as \\(today\\) date in Search Hotel Page$")
	public void select_the_Check_in_date_as_today_date_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select No\\.of Adults in Search Hotel Page$")
	public void select_No_of_Adults_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Select No\\.of Children in Search Hotel Page$")
	public void select_No_of_Children_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Click on Search button in Search Hotel Page$")
	public void click_on_Search_button_in_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify that hotel displayed is the same as selected in search Hotel form\\.$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
