package StepDefinition;
import PageObjectModel.DialogContent;
import PageObjectModel._01_ParentClass;
import cucumber.api.java.en.When;

public class _06_CreateEditDeleteCountry extends _01_ParentClass{

    DialogContent dialogContent = new DialogContent();


    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_to(String nameOfCountryBeforeEdit, String nameOfCountryAfterEdit){

        dialogContent.editAndDeleteFunction(nameOfCountryBeforeEdit , "edit");
        dialogContent.findElementAndSendKeysFunction("NameInput" , nameOfCountryAfterEdit);
        dialogContent.findElementAndClickFunction("SaveButton");

    }

    @When("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String nameOfCountryToDelete){

        waiting(3000);
        dialogContent.editAndDeleteFunction(nameOfCountryToDelete , "delete");
        dialogContent.findElementAndClickFunction("yesButton");

    }








//      Before the first method we were using this one
//    @When("^User edit the \"([^\"]*)\"$")
//    public void user_edit_the(String nameOfCountry){
//
//        dialogContent.editFunction(nameOfCountry);
//        dialogContent.findElementAndSendKeysFunction("NameInput" , "edittedcountry");
//        dialogContent.findElementAndClickFunction("SaveButton");
//
//    }



}