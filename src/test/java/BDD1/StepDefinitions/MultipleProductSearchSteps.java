package BDD1.StepDefinitions;

import BDD1.PageObject.MultipleProductSearch;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleProductSearchSteps {

    MultipleProductSearch obj = new MultipleProductSearch();


    @When("User search for {string}")
    public void user_search_for(String item) {
        obj.multipleSearch(item);


    }
    @Then("User should be able to see all the products related to searched")
    public void user_should_be_able_to_see_all_the_products_related_to_searched() {

    }



}
