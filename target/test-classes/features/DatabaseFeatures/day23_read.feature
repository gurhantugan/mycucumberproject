Feature: Database Feature
  @db_customer_ssn
  Scenario: TC01_read_customer_information_ssn
    Given user connects to the database
    And user gets "*" from "tp_customer" table
    And user reads all of the "ssn" column data
    Then close the database connection


  @db_customer_address
  Scenario: TC02_read_customer_information_address
    Given user connects to the database
    And user gets "*" from "tp_customer" table
    #This is to select all columns from the table
    And user reads all of the "address" column data
    Then close the database connection

  @db_customer_email
  Scenario: TC03_read_customer_information_email
    Given user connects to the database
    And user gets "*" from "tp_customer" table
    And user reads all of the "email" column data
    Then close the database connection

  Scenario Outline: database_connectivity
    Given user connects to the database
    And user gets "*" from "tp_customer" table
    And user reads all of the "<column>" column data
    Then close the database connection
    Examples: Column Data
      | column  |
      | ssn     |
      | address |
      | email   |
 #jhi_user
  @db_user_email
  Scenario: TC04_read_user_information_email
    Given user connects to the database
    And user gets "*" from "jhi_user" table
    And user reads all of the "email" column data
    Then close the database connection


  @db_user_login
  Scenario: TC06_verify_user_information_login
    Given user connects to the database
    And user gets "*" from "jhi_user" table
#    And user reads all of the "login" column data
    Then verify "jhi_user" table "login" column contains "sherlockholmes"
    Then close the database connection

  @db_user_login
  Scenario Outline: TC07_verify_user_information_login_multiple_data
    Given user connects to the database
    And user gets "*" from "jhi_user" table
#    And user reads all of the "login" column data
    Then verify "jhi_user" table "login" column contains "<data>"
    Then close the database connection
    Examples: Multiple login data
      | data           |
      | sherlockholmes |
      | ozzy           |

  @db_user_email
  Scenario: TC08_verify_user_information_email
    Given user connects to the database
    And user gets "*" from "jhi_user" table
#    And user reads all of the "login" column data
    Then verify "jhi_user" table "email" column contains "foreachloop2020@gmail.com"
    Then close the database connection

  @db_account_type
  Scenario: TC09_verify_account_information_type
    Given user connects to the database
    And user gets "*" from "tp_account" table
    And verify the row count
    Then verify "tp_account" table "account_type" column contains "CHECKING"
    Then verify "tp_account" table "account_type" column contains "CREDIT_CARD"
    Then verify "tp_account" table "account_type" column contains "INVESTING"
    Then close the database connection

  @db_account_registration
  Scenario: TC08_verify_user_information_email
    Given user connects to the database
    And user gets "*" from "tpaccount_registration" table
    And verify the row count
    Then verify the column names of "tpaccount_registration" table
    Then close the database connection