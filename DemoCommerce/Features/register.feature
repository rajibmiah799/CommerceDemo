Feature: new customers add

  Scenario: customer adding funcanility test
    Given user on homepage
    When user enter email in the box
    And user enter pass
    And user click login
    And user click on customers
    And user click on customers redio button
    And user click new user button
    And user enter email
    And user enter password 
    And user enter first name
    And user enter last name
    And user click gender male redio button
    And user choose date of birth
    And user enter company name
    And user click is tax exempt
    And user choose newsletter
    And user choose customers roles
    And user choose manage of vandor
    And user click active chack box
    And user add comments on admin comment box
    And user click on save button
    Then user add new customer successfully
