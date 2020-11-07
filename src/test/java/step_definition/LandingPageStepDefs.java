package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.LandingPage;
import pages.LoginPage;
import utilities.Driver;

public class LandingPageStepDefs {

      LoginPage login = new LoginPage();
      LandingPage landingPage = new LandingPage();


    @Given("Customer is logged in")
    public void customer_is_logged_in() {
                login.LoginMethod();
    }

    @When("Customer clicks the setting button")
    public void customer_clicks_the_setting_button() {
        landingPage.settingModule();

    }

    @When("Customer clicks the User info tab")
    public void customer_clicks_the_user_info_tab() {
        landingPage.userInfoModule();
    }

    @Then("Customer edit info fields to add updated info")
    public void customer_edit_info_fields_to_add_updated_info() {

        Driver.getDriver().manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)");
        landingPage.setFirstName();
        landingPage.setMiddleName();
        landingPage.setLastName();
        landingPage.setUrl();
        landingPage.setCompany();
        landingPage.setBio();
        landingPage.updateInfo();
    }

    @Then("Verify to the changes")
    public void verify_to_the_changes() {

        landingPage.verifyClick();


    }
}
