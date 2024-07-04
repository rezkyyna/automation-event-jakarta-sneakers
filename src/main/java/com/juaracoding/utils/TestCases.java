package com.juaracoding.utils;

public enum TestCases {

    //Register
    T1("User Access the invalid URL"),
    T2("User access the valid URL"),
    T3("User leaves the username and password field blank"),
    T4("User leaves the password field blank"),
    T5("User" +
            " leaves the username field blank"),
    T6("user input username and password correctly"),
    ;


    private final String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}