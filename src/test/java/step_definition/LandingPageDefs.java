package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LandingPageDefs {

      LoginPage login = new LoginPage();


    @Given("Customer is logged in")
    public void customer_is_logged_in() {
                login.LoginMethod();
    }

    @When("Customer clicks the setting button")
    public void customer_clicks_the_setting_button() {

    }

    @When("Customer clicks the User info tab")
    public void customer_clicks_the_user_info_tab() {

    }

    @Then("Customer edit info fields to add updated info")
    public void customer_edit_info_fields_to_add_updated_info() {

    }

    @Then("Verify to the changes")
    public void verify_to_the_changes() {


    }
}
