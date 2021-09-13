#Author: your.email@your.domain.com
Feature: Demo Telecom
 
  Background:
 
     And user click on add customer button
 @sanity @smoke
  Scenario: Add Customer flow validation
    When user need to fill up the fields
     And user click on submit button
    Then user verify customer id is generated
 @sanity 
 Scenario: Add Customer flow validation by 1D Map concept
      When user need to fill up the fields by 1D map
     |fname|Rajesh          |
     |lname|V               |
     |email|Rajesh@gmail.com|
     |Addr |Chennai         |
     |Phno |9876543210      |
     And user click on submit button
    Then user verify customer id is generated
