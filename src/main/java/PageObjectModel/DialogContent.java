package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends LeftNavElements {

    public DialogContent(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "ms-add-button > div > button")
    private WebElement addButton;

    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {

            case "AddButton":
                myElement = addButton;
                break;
        }

        clickFunction(myElement);

    }

}
