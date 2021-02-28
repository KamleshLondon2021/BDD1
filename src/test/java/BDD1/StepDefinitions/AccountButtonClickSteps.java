package BDD1.StepDefinitions;

import BDD1.PageObject.AccountButtonClick;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountButtonClickSteps {

    AccountButtonClick obj1 = new AccountButtonClick();

    @When("User Click on the Account Button")
    public void user_click_on_the_account_button() {
        obj1.AccountButtonClick();


    }


    @Then("User should be able to nevigate on  Account page")
    public void user_should_be_able_to_nevigate_on_account_page() {
        obj1.IntheAccountpage();


    }



}
