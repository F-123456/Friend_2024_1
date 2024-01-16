package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UkbaStepDef extends BaseUtil{
    private BaseUtil base;

    public UkbaStepDef(BaseUtil base) {
        this.base = base;
    }




    @Given("I am on UKba Website")
    public void i_am_on_u_kba_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I select reason as {string}")
    public void i_select_reason_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
