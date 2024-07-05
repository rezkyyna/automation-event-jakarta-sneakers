package com.juaracoding;

import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestDashboardPage {
    static WebDriver driver;
    static ExtentTest extentTest;
    final static DashboardPage dashboardPage = new DashboardPage();

    public TestDashboardPage(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access URL")
    public void user_access_url() {

    }
    @When("User click Dashboard Menu")
    public void user_click_dashboard_menu() {

    }
    @Then("User will be directed to dashboard page")
    public void user_will_be_directed_to_dashboard_page() {

    }
}
