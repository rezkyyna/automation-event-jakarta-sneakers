package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[normalize-space()='Dashboard']")
    WebElement btnDashboard;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    WebElement txtDashboard;

    @FindBy(xpath = "(//input[@name='start_date'])[1]")
    WebElement startDate;

    @FindBy(xpath = "(//input[@name='end_date'])[1]")
    WebElement endDate;

    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement btnFilter;

    @FindBy(xpath = "//td[normalize-space()='Feri Nugraha']")
    WebElement txtDataFilter;

    public void buttonDashboard(){
        btnDashboard.click();
    }

    public void getTxtDashboard(){
        txtDashboard.getText();
    }

    public void clickFilterDate(String startDate, String endDate){
        this.startDate.clear();
        this.endDate.clear();
        this.startDate.sendKeys(startDate);
        this.endDate.sendKeys(endDate);
        btnFilter.click();
    }
    public void getTxtDataFilter(){
        txtDataFilter.getText();
    }
}
