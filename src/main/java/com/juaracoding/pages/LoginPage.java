package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='404 Page Not Found']")
    WebElement txtUrlInvalid;

    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']")
    WebElement txtUrlValid;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement blankValidation;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    WebElement submit;

    @FindBy(xpath = "//select[@id='Claim_Type']")
    WebElement pilihType;

    @FindBy(xpath = "(//p[normalize-space()='Register Foto'])[1]")
    WebElement registerfotomenu;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, Feri Nugraha']")
    WebElement txtLoginSucces;

    //login admin
    public void setTxtUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickBtnSubmit(){
        submit.click();
    }

    public void registerForm() {
        registerfotomenu.click();
        pilihType.click();
    }

    public String getTxtUrlInvalid() {
        String resultTxturl = "";
        String txtPageNotFound = txtUrlInvalid.getText();
        if (txtPageNotFound.contains("404 Page Not Found")) {
            resultTxturl = txtPageNotFound;
            DriverSingleton.delay(1);
        }
        return resultTxturl;
    }

    public String getTxtUrlValid(){
        String resultTxtUrl = "";
        String txtPageLogin = txtUrlValid.getText();
        if (txtPageLogin.contains("JAKARTA SNEAKERS DAY")){
            resultTxtUrl = txtPageLogin;
            DriverSingleton.delay(1);
        }
        return resultTxtUrl;
    }

    public String getTxtValidationLogin(){
        String resultTxtUrl = "";
        String txtPageLogin = blankValidation.getText();
        if (txtPageLogin.contains(" ")){
            resultTxtUrl = txtPageLogin;
            DriverSingleton.delay(1);
        }
        return resultTxtUrl;
    }
    public String getTxtLoginSucces(){
        String resultTxtLogin = "";
        String validasiLogin = txtLoginSucces.getText();
        if (validasiLogin.contains("Selamat datang, Feri Nugraha")){
            resultTxtLogin = validasiLogin;
            DriverSingleton.delay(1);
        }
        return resultTxtLogin;
    }
}