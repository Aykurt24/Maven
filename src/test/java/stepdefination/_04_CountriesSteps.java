package stepdefination;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _04_CountriesSteps {
    WebDriver driver;

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate to countries page$")
    public void navigate_to_countries_page(){

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

    }

    @Then("^User create a country$")
    public void user_create_a_country()  {

        dialogContent.findElementAndClickFunction("addButton");

//        WebElement addCountryButton = driver.findElement(By.cssSelector(" ms-add-button > div > button"));
//        addCountryButton.click();

        WebElement countryName = driver.findElement(By.cssSelector("#ms-text-field-2>input"));
        countryName.sendKeys("Tanzania");

        WebElement countryCode = driver.findElement(By.cssSelector("#ms-text-field-3>input"));
        countryCode.sendKeys("TZ");

        WebElement saveButton = driver.findElement(By.cssSelector(" ms-save-button > button"));
        saveButton.click();
    }


}
