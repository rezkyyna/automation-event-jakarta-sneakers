package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginPage {
    static WebDriver driver;
    static ExtentTest extentTest;
    final static LoginPage loginPage = new LoginPage();

    public TestLoginPage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
//start TCC.HW.001
    @Given("User enter URL Event {string}")
    public void User_access_the_url(String url) {
        driver.get(url);
        extentTest.log(LogStatus.PASS, "User enter URL event");
    }

    @Then("User should see message for validation {string}")
    public void User_should_see_message_for_validation(String expectedResult){
        if (expectedResult.contains("404 Page Not Found")){
            Assert.assertTrue(loginPage.getTxtUrlInvalid().contains(expectedResult));
            extentTest.log(LogStatus.PASS, "User should see message for validation");
        } else if (expectedResult.contains("JAKARTA SNEAKERS DAY")) {
            Assert.assertTrue(loginPage.getTxtUrlValid().contains(expectedResult));
            extentTest.log(LogStatus.PASS, "User will be redirect to Home page");
        }
    }
//end TCC.HW.001

//start TCC.HW.003
    @When("User input username {string}")
    public void User_input_username(String username) {
        loginPage.setTxtUsername(username);
        extentTest.log(LogStatus.PASS, "User input username");
    }

    @And("User input password {string}")
    public void User_input_password(String password){
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "User input password");
    }

    @And("User click button Login")
    public void User_click_button_Login(){
        loginPage.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "User click button Login");
    }

    @Then("User should see the result {string}")
    public void User_should_see_the_result(String expectedResult){
        if (expectedResult.equals("Masukkan username dan password dengan benar")){
            Assert.assertEquals(loginPage.getTxtValidationLogin(), expectedResult);
            extentTest.log(LogStatus.PASS, "User should see the result");
        }
        else if (expectedResult.equals("Password anda salah")) {
            Assert.assertEquals(loginPage.getTxtValidationLogin(),expectedResult);
            extentTest.log(LogStatus.PASS, "User should see the result");
        }
        else if (expectedResult.equals("Username anda salah")) {
            Assert.assertEquals(loginPage.getTxtValidationLogin(), expectedResult);
            extentTest.log(LogStatus.PASS, "User should see the result");
        }
        else if (expectedResult.contains("Selamat datang, Feri Nugraha")){
            Assert.assertTrue(loginPage.getTxtLoginSucces().contains(expectedResult));
            extentTest.log(LogStatus.PASS, "User should see the result");
        }
        else {
            extentTest.log(LogStatus.FAIL, "Pesan validasi tidak tersedia(High Priority to Fixing this Bugs)");
        }
    }
}