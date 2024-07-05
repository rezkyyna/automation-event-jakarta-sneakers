Feature: Login Module

#TCC.HW.001-002
  Scenario Outline: User access the URL
    Given User enter URL Event "<url>"
    Then User should see message for validation "<result>"
  Examples:
    |url                                                      |result                |type
    |https://dev.ptdika.com/voucher_jakartasneakersday/login1 |404 Page Not Found    |negative
    |https://dev.ptdika.com/voucher_jakartasneakersday/login  |JAKARTA SNEAKERS DAY  |positive

#TCC.HW.003-006
  Scenario Outline: User Login
    When User input username "<username>"
    And User input password "<password>"
    And User click button Login
    Then User should see the result "<result>"
  Examples:
    |username    |password |result                                     |
    |            |         |Masukkan username dan password dengan benar|
    |ferinugraha |         |Password anda salah                        |
    |            |a        |Username anda salah                        |
    |ferinugraha |a        |Selamat datang, Feri Nugraha               |