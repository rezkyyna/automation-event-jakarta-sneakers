package com.juaracoding;

import com.juaracoding.pages.RegisterPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.juaracoding.TestLoginPage.loginPage;

public class TestRegisterPage {
    static WebDriver driver;
    static ExtentTest extentTest;
    final static RegisterPage registerPage = new RegisterPage();

    public TestRegisterPage(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
//TCC.HW.007
    @When("User go to register menu")
    public void user_go_to_register_menu() {
        loginPage.registerForm();
        extentTest.log(LogStatus.PASS, "User go to register menu");
    }
}
