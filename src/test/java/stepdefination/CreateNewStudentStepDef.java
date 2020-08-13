package stepdefination;

import PageObjectModel.DialogContent;
import PageObjectModel.StudentClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.But;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Random;

public class CreateNewStudentStepDef {

    StudentClass studentClass = new StudentClass();
    DialogContent dialogContent = new DialogContent();

    @When("^User sending the keys in the student class$")
    public void User_sending_the_keys_in_the_student_class(DataTable elements){

        List<List<String>> AllElementsNameAndValue= elements.asLists(String.class);

        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            studentClass.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));

        }
    }

    @But("^Click in the studentClass class$")
    public void Click_in_the_studentClass_class(DataTable eachElement) {

        List<String> eachElements = eachElement.asList(String.class);

        for (int i = 0; i < eachElements.size(); i++) {
                if (i%2 == 1 ) {
                    studentClass.options(eachElements.get(i));
                }else {
                    studentClass.findElementAndClickFunction(eachElements.get(i));
                }

            }

        }

}
