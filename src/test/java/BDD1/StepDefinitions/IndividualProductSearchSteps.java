package BDD1.StepDefinitions;

import BDD1.PageObject.IndividualProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProductSearchSteps {

    IndividualProductSearch obj = new IndividualProductSearch();


    @Given("User is on the home page of the argos website")
    public void user_is_on_the_home_page_of_the_argos_website() {

    }
    @When("User types nike in the search box")
    public void user_types_nike_in_the_search_box() {
        obj.dosearch("Nike");

    }
    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        obj.searchbuttonclick();

    }
    @Then("User should be able to see all the nike products")
    public void user_should_be_able_to_see_all_the_nike_products() {


    }

}
