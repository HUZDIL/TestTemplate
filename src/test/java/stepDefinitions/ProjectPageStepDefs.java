package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProjectsPage;

public class ProjectPageStepDefs {

    ProjectsPage projectsPage =new ProjectsPage();
    @When("Click on the second option \\(Projects) in the left")
    public void click_on_the_second_option_projects_in_the_left() {
        projectsPage.projectModule();

    }

    @Then("Click to expand the default project.")
    public void click_to_expand_the_default_project() {
        projectsPage.defaultProjectModule();
    }

    @Then("Click on the Operations tab under this project")
    public void click_on_the_operations_tab_under_this_project() {
            projectsPage.operationsModule();


    }

    @Then("Select Result = Pass")
    public void select_result_pass() {
        projectsPage.resultModule();

    }
    @Then("Click to Expand All button")
    public void click_to_expand_all_button() {
     projectsPage.expandAllModule();

    }

    @Then("Verify to Zero Result")
    public void verify_to_zero_result() {

       projectsPage.verify();

    }







}
