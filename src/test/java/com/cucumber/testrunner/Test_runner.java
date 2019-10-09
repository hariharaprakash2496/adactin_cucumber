package com.cucumber.testrunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;	 
import org.openqa.selenium.WebDriver;

import com.cucumber.Baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\cucumber\\feature",
		glue = "Step_Definition"
		)
public class Test_runner {
	public static WebDriver driver;
	@BeforeClass
	public static void driver_Instalation() throws Throwable {
driver=BaseClass.browserLaunch("chrome");
	}
	@AfterClass
	public static  void driverQuit() {
driver.quit();
	}


}

