package stepdefination;

import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _04_CountriesSteps {
WebDriver driver;

    @And("^Navigate to countries page$")
    public void navigate_to_countries_page(){

        driver = Driver.getDriver();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement setupButton = driver.findElement(By.cssSelector("div.group-items>:first-child>a"));
        setupButton.click();

        WebElement parametersButton = driver.findElement(By.cssSelector(".open > div>:first-child>a"));
        parametersButton.click();

        WebElement countriesButton = driver.findElement(By.cssSelector(".open>div>:first-child>div>:first-child>a"));
        countriesButton.click();

    }

    @Then("^User create a country$")
    public void user_create_a_country()  {

        WebElement addCountryButton = driver.findElement(By.cssSelector(" ms-add-button > div > button"));
        addCountryButton.click();

        WebElement countryName = driver.findElement(By.cssSelector("#ms-text-field-2>input"));
        countryName.sendKeys("Tanzania");

        WebElement countryCode = driver.findElement(By.cssSelector("#ms-text-field-3>input"));
        countryCode.sendKeys("TZ");

        WebElement saveButton = driver.findElement(By.cssSelector(" ms-save-button > button"));
        saveButton.click();
    }


}
