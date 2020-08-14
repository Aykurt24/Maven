package StepDefinition;

        import PageObjectModel.DialogContent;
        import PageObjectModel.LeftNavElements;
        import PageObjectModel._01_ParentClass;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;

public class _09_Discounts extends _01_ParentClass {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate to discount page$")
    public void navigate_to_discount_page()  {
        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("Discounts");

    }

    @When("^User create a discount description as \"([^\"]*)\" integration code as \"([^\"]*)\" priority as \"([^\"]*)\"$")
    public void user_create_a_discount_description_as_a_integration_code_as_a_priority_as_a(String description, String iCode, String priority) {

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndClickFunction("GotItButton");
        dialogContent.findElementAndClickFunction("Description");
        dialogContent.findElementAndSendKeysFunction("Description",description);
        dialogContent.findElementAndSendKeysFunction("IntegrationCode",iCode);
        dialogContent.findElementAndSendKeysFunction("PriorityInput",priority);

    }


    @Then("^Then Success message should be displayed$")
    public void then_Success_message_should_be_displayed()  {
        dialogContent.findElementAndClickFunction("SaveButton");
        dialogContent.findElementAndVerifyElementContainText("SuccessfullyMessage","successfully");

    }
    @When("^User edit a discount description as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_a_discount_description_as_to(String description, String newDiscription) {


        waiting(4000);
        dialogContent.editAndDeleteFunction(description,"edit");
        dialogContent.findElementAndClickFunction("Description");
        dialogContent.findElementAndSendKeysFunction("Description",newDiscription);
        dialogContent.findElementAndClickFunction("SaveButton");

    }


}
