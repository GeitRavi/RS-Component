Feature: Verify the Search functionality of RS component website

  Scenario: Verify the Search criteria with valid Product Digital Thermometers without login to application
    Given User open RS component website.
    When  Enter a valid item "Digital Thermometers" into search field.
    Then  Verify search item "Digital Thermometers" in search result section.
    And  Verify Result product page should contain atleast one result record.

  Scenario: Verify the Search criteria with invalid product Digital Thermometers item
    Given User open RS component website.
    When  Enter a valid item "Cricket Bat" into search field.
    Then  Verify zero search result "We couldn't find any results for 'Cricket Bat'" in search result section.

  Scenario: Verify Result product after Apply filter on Search criteria
    Given User open RS component website.
    When  Enter a valid item "Digital Thermometers " into search field.
    And   Select Brand filter & sub filter and Click Apply.
    Then  Verify Result product page should contain atleast one result record.