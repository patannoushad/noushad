package stepdefinition;

import io.cucumber.java.en.*;

public class SearchProduct {

    @Given("^i visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user(){
        System.out.println(">>--Given  i visit the website as a guest user");
    }

    @When("^i select the books option for search dropdown$")
    public void i_select_the_books_option_for_search_dropdown() {
        System.out.println(">>--When  i select the books option for search dropdown");
    }

    @When("^i select the baby option for search dropdown$")
    public void i_select_the_baby_option_for_search_dropdown(){
        System.out.println(">>--when  i select the baby option for search dropdown");
    }
    @And("^i click on the search icon$")
    public void i_click_on_the_search_icon(){
        System.out.println(">>--And  i click on the search icon");
    }
    @Then("^i should show the Amazon best reader heading on the page$")
    public void i_should_show_the_amazon_best_reader_heading_on_the_page(){
        System.out.println(">>--Then  i should show the amazon best reader heading on the page");
    }

    @Then("^i should show the offer of the baby heading on the page$")
    public void i_should_show_the_offer_of_the_baby_heading_on_the_page(){
        System.out.println(">>--Then i should show the offer of the baby heading on the page");
    }

    @But("^User should not see other categories of the products$")
    public void user_should_not_see_other_categories_of_the_products() {
        System.out.println(">>--But user should not see other catergies of the products");
    }
}


