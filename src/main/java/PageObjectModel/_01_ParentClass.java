package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_ParentClass {

//    In this class we need two thinks one is driver second one is a WebDriverWait

    WebDriver driver;
    WebDriverWait wait;

    public _01_ParentClass(){

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);

    }

    //    Click on element method
    public void clickFunction(WebElement element){

        waitUntilClickable(element);
        element.click();

    }


    //    WaitForClickable
    public void waitUntilClickable(WebElement elmentToWait){

        wait.until(ExpectedConditions.elementToBeClickable(elmentToWait));
    }

}