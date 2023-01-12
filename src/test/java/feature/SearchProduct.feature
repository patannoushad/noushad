Feature: search the various product categories is possible with product search
    @book
  Scenario: User should able to search for the products under books categories
    Given i visit the website as a guest user
    When  i select the books option for search dropdown
    And i click on the search icon
    Then i should show the Amazon best reader heading on the page
    But User should not see other categories of the products

    @baby
  Scenario: User should able to search for the products under baby categories
    Given i visit the website as a guest user
    When  i select the baby option for search dropdown
    And i click on the search icon
    Then i should show the offer of the baby heading on the page
    But User should not see other categories of the products