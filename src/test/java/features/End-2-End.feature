Feature: Verify End 2 End functionality of RS component website

  Scenario: Verify End 2 End flow with one Product
    Given User open RS component website.
    When  Enter a valid item "Digital Thermometers" into search field.
    And   Select Brand filter & sub filter and Click Apply.
    And  Enter Product Quantity "1" and click Add product.
    Then Verify Product "Digital Thermometer" under checkout Page.

  Scenario: Verify End 2 End flow with Multiple Filter & Multiple Products
    Given User open RS component website.
    When  Enter a valid item "Digital Thermometers" into search field.
    And   Select Multiple filter & sub filter and Click Apply.
    And  Select Two Product with Quantity "1" each and click Add product.
    Then Verify Product "Digital Thermometer" under checkout Page.