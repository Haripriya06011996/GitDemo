Feature: Verify hot new release
  Scenario Outline: Hot new release on the amazom shopping aoo
    Given I have landed to the amazon home page
    When I click on all link "<Product_search>"
    When I search for product Beauty "<Product>" using "<DropdownOption>"
    When I click on best sellers
   # When I verify the text hot new release
    #And close the browser

    Examples:
    |Product_search|Product|DropdownOption|
    |search-alias=stripbooks|5  |index         |
   # |search-alias=stripbooks|search-alias=amazon-devices  |text          |




