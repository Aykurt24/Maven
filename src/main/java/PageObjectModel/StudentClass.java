package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentClass extends _01_ParentClass{



    public StudentClass (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (css = "ms-text-field[formcontrolname='firstName']>input")
    private WebElement FirstName;

    @FindBy (css = "ms-text-field[formcontrolname='lastName']>input")
    private WebElement LastName;

    @FindBy (css = "ms-text-field[formcontrolname='middleName']>input")
    private WebElement MiddleName;

    @FindBy (css = "input[data-placeholder ='Date of Birth']")
    private WebElement DateOfBirth;

    @FindBy (css = "input[data-placeholder ='Student ID']")
    private WebElement StudentID;

    @FindBy (css = "input[data-placeholder ='Mobile Phone']")
    private WebElement MobilePhone;

    @FindBy (css = "input[data-placeholder ='Email']")
    private WebElement Email;

    @FindBy(xpath = "input[data-placeholder ='Document Number']")
    private WebElement DocumentNumber;

    @FindBy(xpath = "input[data-placeholder ='Personal ID']")
    private WebElement PersonalID;

    @FindBy(xpath = "input[data-placeholder ='Date of Issue']")
    private WebElement DateOfIssue;

    @FindBy(xpath = "input[data-placeholder ='Expiry Date']")
    private WebElement ExpiryDate;

    @FindBy(xpath = "input[data-placeholder ='Given by']")
    private WebElement GivenBy;

    @FindBy (css = "input[data-placeholder ='Previous School']")
    private WebElement PreviousSchool;

    @FindBy (css = "mat-select[aria-label='Gender']")
    private WebElement Gender;

    @FindBy(xpath = "//mat-select[@aria-label='Grade Level']")
    private WebElement GradeLevel;

    @FindBy(xpath = "//mat-select[@aria-label='School Department']")
    private WebElement SchoolDepartment;

    @FindBy(xpath = "//mat-select[@aria-label='Section']")
    private WebElement Section;

    @FindBy(xpath = "//mat-select[@aria-label='Citizenship']")
    private WebElement Citizenship;

    @FindBy(xpath = "//mat-select[@aria-label='Nationality']")
    private WebElement Nationality;

    @FindBy(xpath = "//mat-select[@aria-label='Document Type']")
    private WebElement DocumentType;

    WebElement myElement;

    public void findElementAndSendKeysFunction(String ElementName , String value){

//        Find the element in this class and send the element to sendKeysFunction
        switch (ElementName){
            case "FirstName":
                myElement = FirstName;
                break;
            case "LastName":
                myElement = LastName;
                break;
            case "MiddleName":
                myElement = MiddleName;
                break;
            case "DateOfBirth":
                myElement = DateOfBirth;
                break;
            case "StudentID":
                myElement = StudentID;
                break;
            case "MobilePhone":
                myElement = MobilePhone;
                break;
            case "Email":
                myElement = Email;
                break;
            case "DocumentNumber":
                myElement = DocumentNumber;
                break;
            case "PersonalID":
                myElement = PersonalID;
                break;
            case "DateOfIssue":
                myElement = DateOfIssue;
                break;
            case "ExpiryDate":
                myElement = ExpiryDate;
                break;
            case "GivenBy":
                myElement = GivenBy;
                break;
            case "PreviousSchool":
                myElement = PreviousSchool;
                break;

        }
//            Create a method in parentClass which is going to wait first and sendKeys

        sendKeysFunction(myElement , value);

    }

    public void findElementAndClickFunction(String ElementName) {

//        Find the element in this class and send the element to sendKeysFunction
        switch (ElementName) {
            case "Gender":
                myElement = Gender;
                break;
            case "GradeLevel":
                myElement = GradeLevel;
                break;
            case "SchoolDepartment":
                myElement = SchoolDepartment;
                break;
            case "Section":
                myElement = Section;
                break;
            case "Citizenship":
                myElement = Citizenship;
                break;
            case "Nationality":
                myElement = Nationality;
                break;
            case "DocumentType":
                myElement = DocumentType;
                break;
        }
        clickFunction(myElement);
    }
    public void options (String x){

            WebElement Option1 = driver.findElement(By.xpath("(//mat-option)"+"["+x+"]"));
        Option1.click();

    }

}











