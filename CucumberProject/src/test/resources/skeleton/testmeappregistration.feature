Feature: Test Me App Registration

  Scenario: Register to application
    Given Test Me registration url "https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm"
    When Test Me user enters "imjyoti"
    And Test Me user enters "jyoti"
    And Test Me user enters "Aih"
    And Test Me user enters "password"
    And Test Me user enters "password"
    And Test Me user enters "Female"
    And Test Me user enters "jo@gmail.com"
    And Test Me user enters "9632909120"
    And Test Me user enters "02/20/1997"
    And Test Me user enters "bangalore"
    And Test Me user enters "What is your birth place"
    And Test Me user enters "bangalore"
    And Test Me user clicks register
    Then Test Me user registered successfully
    @shop
    Scenario: Login to application
    Given Test Me login url "https://lkmdemoaut.accenture.com/TestMeApp/login.htm"
    When Test Me user enters "Lalitha" as username
    And Test Me user enters "Password123" as password
    And Test Me user enters clicks on login button
    Then TestMe user is in shopping page
    When Test Me user search for product "headphone"
    Then Test Me user clicks on find details
    And Add the product to cart

    