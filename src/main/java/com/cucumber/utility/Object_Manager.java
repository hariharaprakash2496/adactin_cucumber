package com.cucumber.utility;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.Book_A_Hotel;
import com.cucumber.pom.Booked_Itinerary;
import com.cucumber.pom.Booking_Confirmation;
import com.cucumber.pom.Hotel_Reservation_System;
import com.cucumber.pom.Search_Hotel;
import com.cucumber.pom.Select_Hotel;

public class Object_Manager {
	public static WebDriver driver;
private Book_A_Hotel bah;
private Booked_Itinerary bi;
private Booking_Confirmation bc;
private Hotel_Reservation_System hrs;
private Search_Hotel search_h;
private Select_Hotel select_h;
public Book_A_Hotel getBah() {
	if (bah==null) {
		
		bah=new Book_A_Hotel(driver);
	}
	return bah;
}
public Booked_Itinerary getBi() {
if (bi==null) {
		
		bi=new  Booked_Itinerary(driver);
	}
	return bi;
}
public Booking_Confirmation getBc() {
if (bc==null) {
		
		bc=new Booking_Confirmation(driver);
	}
	return bc;
}
public Hotel_Reservation_System getHrs() {
if (hrs==null) {
		
		hrs=new Hotel_Reservation_System(driver);
	}
	return hrs;
}
public Search_Hotel getSearch_h() {
if (search_h==null) {
		
	search_h=new Search_Hotel(driver);
	}
	return search_h;
}
public Select_Hotel getSelect_h() {
	if (select_h==null) {
		
		select_h = new  Select_Hotel(driver);
		}
return select_h;
}
public Object_Manager(WebDriver driver) {
this.driver = driver;


}
}







