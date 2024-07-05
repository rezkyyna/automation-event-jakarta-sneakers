Feature: Dashboard Module
  Scenario: User access dashboard page
    Given User access URL
    When User click Dashboard Menu
    Then User will be directed to dashboard page

  Scenario Outline: User setting filter date
    When User input start date "<startDate>"
    And User input end date "<endDate>"
    And User click filter button
    Then User will see the result "<Result>"

  Examples:
    |startDate|endDate  |Result                               |
    |         |         |                                     |
    |01062024 |03062024 |Maaf, range tanggal maksimal 31 hari |
    |03062024 |01062024 |Maaf, range tanggal maksimal 31 hari |
    |         |         |                                     |