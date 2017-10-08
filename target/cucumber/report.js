$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End-2-End.feature");
formatter.feature({
  "line": 1,
  "name": "Verify End 2 End functionality of RS component website",
  "description": "",
  "id": "verify-end-2-end-functionality-of-rs-component-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5995826054,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify End 2 End flow with one Product",
  "description": "",
  "id": "verify-end-2-end-functionality-of-rs-component-website;verify-end-2-end-flow-with-one-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open RS component website.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter a valid item \"Digital Thermometers\" into search field.",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Select Brand filter \u0026 sub filter and Click Apply.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter Product Quantity \"1\" and click Add product.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify Product \"Digital Thermometer\" under checkout Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_user_open_RS_component_website()"
});
formatter.result({
  "duration": 149426094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometers",
      "offset": 20
    }
  ],
  "location": "StepDefination.i_user_enter_a_valid_item_details_into_search_field(String)"
});
formatter.result({
  "duration": 2370707859,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.apply_filter_and_sub_filter_()"
});
formatter.result({
  "duration": 604997020,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "StepDefination.enter_product_and_add_product(String)"
});
formatter.result({
  "duration": 5657115737,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometer",
      "offset": 16
    }
  ],
  "location": "StepDefination.verify_product_details_and_count(String)"
});
formatter.result({
  "duration": 11569267651,
  "status": "passed"
});
formatter.after({
  "duration": 185005439,
  "status": "passed"
});
formatter.before({
  "duration": 5602869883,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify End 2 End flow with Multiple Filter \u0026 Multiple Products",
  "description": "",
  "id": "verify-end-2-end-functionality-of-rs-component-website;verify-end-2-end-flow-with-multiple-filter-\u0026-multiple-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User open RS component website.",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter a valid item \"Digital Thermometers\" into search field.",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select Multiple filter \u0026 sub filter and Click Apply.",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select Two Product with Quantity \"1\" each and click Add product.",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify Product \"Digital Thermometer\" under checkout Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_user_open_RS_component_website()"
});
formatter.result({
  "duration": 235891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometers",
      "offset": 20
    }
  ],
  "location": "StepDefination.i_user_enter_a_valid_item_details_into_search_field(String)"
});
formatter.result({
  "duration": 2386765790,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.apply_multiple_filter_and_sub_filter_()"
});
formatter.result({
  "duration": 2884995570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 34
    }
  ],
  "location": "StepDefination.select_two_product_and_add_product(String)"
});
formatter.result({
  "duration": 8065101910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometer",
      "offset": 16
    }
  ],
  "location": "StepDefination.verify_product_details_and_count(String)"
});
formatter.result({
  "duration": 11556223890,
  "status": "passed"
});
formatter.after({
  "duration": 152645086,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Search functionality of RS component website",
  "description": "",
  "id": "verify-the-search-functionality-of-rs-component-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4369539850,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the Search criteria with valid Product Digital Thermometers without login to application",
  "description": "",
  "id": "verify-the-search-functionality-of-rs-component-website;verify-the-search-criteria-with-valid-product-digital-thermometers-without-login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open RS component website.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter a valid item \"Digital Thermometers\" into search field.",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify search item \"Digital Thermometers\" in search result section.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify Result product page should contain atleast one result record.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_user_open_RS_component_website()"
});
formatter.result({
  "duration": 255673,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometers",
      "offset": 20
    }
  ],
  "location": "StepDefination.i_user_enter_a_valid_item_details_into_search_field(String)"
});
formatter.result({
  "duration": 2170860004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometers",
      "offset": 20
    }
  ],
  "location": "StepDefination.verify_search_item_is_result_section(String)"
});
formatter.result({
  "duration": 69445948,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.verify_result_product_count()"
});
formatter.result({
  "duration": 108006004,
  "status": "passed"
});
formatter.after({
  "duration": 126865962,
  "status": "passed"
});
formatter.before({
  "duration": 4134058185,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the Search criteria with invalid product Digital Thermometers item",
  "description": "",
  "id": "verify-the-search-functionality-of-rs-component-website;verify-the-search-criteria-with-invalid-product-digital-thermometers-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User open RS component website.",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter a valid item \"Cricket Bat\" into search field.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify zero search result \"We couldn\u0027t find any results for \u0027Cricket Bat\u0027\" in search result section.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_user_open_RS_component_website()"
});
formatter.result({
  "duration": 200409,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cricket Bat",
      "offset": 20
    }
  ],
  "location": "StepDefination.i_user_enter_a_valid_item_details_into_search_field(String)"
});
formatter.result({
  "duration": 1773504543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We couldn\u0027t find any results for \u0027Cricket Bat\u0027",
      "offset": 27
    }
  ],
  "location": "StepDefination.verify_zero_search_result_is_result_section(String)"
});
formatter.result({
  "duration": 79208139,
  "status": "passed"
});
formatter.after({
  "duration": 239904693,
  "status": "passed"
});
formatter.before({
  "duration": 5153359920,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Result product after Apply filter on Search criteria",
  "description": "",
  "id": "verify-the-search-functionality-of-rs-component-website;verify-result-product-after-apply-filter-on-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User open RS component website.",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Enter a valid item \"Digital Thermometers \" into search field.",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Select Brand filter \u0026 sub filter and Click Apply.",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify Result product page should contain atleast one result record.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_user_open_RS_component_website()"
});
formatter.result({
  "duration": 249697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Thermometers ",
      "offset": 20
    }
  ],
  "location": "StepDefination.i_user_enter_a_valid_item_details_into_search_field(String)"
});
formatter.result({
  "duration": 2196526287,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.apply_filter_and_sub_filter_()"
});
formatter.result({
  "duration": 647035608,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.verify_result_product_count()"
});
formatter.result({
  "duration": 79115767,
  "status": "passed"
});
formatter.after({
  "duration": 283679960,
  "status": "passed"
});
});