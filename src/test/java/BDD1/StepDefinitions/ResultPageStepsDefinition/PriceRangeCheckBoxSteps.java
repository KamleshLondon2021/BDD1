package BDD1.StepDefinitions.ResultPageStepsDefinition;

import BDD1.BaseClassPackage.DriverFectory;
import BDD1.PageObject.PriceRangeCheckBox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeCheckBoxSteps  {

    PriceRangeCheckBox obj = new PriceRangeCheckBox();


    @Given("User is on the result page of the argos website")
    public void user_is_on_the_result_page_of_the_argos_website() {

    }

    @Then("USer should be able to see all the items within that price rage")
    public void u_ser_should_be_able_to_see_all_the_items_within_that_price_rage() {

    }


    @When("Users clicks on  five pound to ten pound price range check box")
    public void usersClicksOnFivePoundToTenPoundPriceRangeCheckBox() {
        obj.PriceCheckbox();

    }
}
