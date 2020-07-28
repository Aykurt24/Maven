package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_Contact {

    @Given("^Navigate to some website$")
    public void navigate_to_some_website()  {
        System.out.println("Navigate to some website");
    }

    @Given("^Click on contact button$")
    public void click_on_contact_button()  {
        System.out.println("Click on contact button");
    }

    @When("^Enter first name last name contact information$")
    public void enter_first_name_last_name_contact_information()  {
        System.out.println("Enter first name last name contact information");

    }

    @When("^Click on save button$")
    public void clikc_on_save_button() {
        System.out.println("Clikc on save button");

    }

    @Then("^Success message displayed$")
    public void success_message_displayed() {
        System.out.println("Success message displayed");

    }


}
