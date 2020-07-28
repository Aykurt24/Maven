package stepdefination;

import Utilities.Driver;
import Utilities.ReusableMethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _05_CitiesSteps {
    WebDriver driver;
    ReusableMethod method = new ReusableMethod();
    @Given("^Navigate to cities page$")
    public void navigate_to_cities_page()  {
        driver = Driver.getDriver();

        WebElement setupButton = driver.findElement(By.cssSelector("div.group-items>:first-child>a"));
        setupButton.click();

        WebElement parametersButton = driver.findElement(By.cssSelector(".open > div>:first-child>a"));
        parametersButton.click();

        WebElement citiesButton = driver.findElement(By.cssSelector(".open>div>:first-child>div>:nth-child(2)>a"));
        citiesButton.click();
    }

    @Then("^User create a city$")
    public void user_create_a_city() throws InterruptedException {

        WebElement addCityButton = driver.findElement(By.cssSelector("ms-add-button > div > button"));
        addCityButton.click();

        WebElement country = driver.findElement(By.cssSelector("mat-form-field[formgroupname='country']"));
        country.click();

        Thread.sleep(1500);
        List<WebElement> countries = driver.findElements(By.cssSelector("#mat-select-4-panel>mat-option"));
        System.out.println(countries.size());

        countries.get(method.RandomNumber(countries.size())).click();

        WebElement cityName = driver.findElement(By.cssSelector("input[id='ms-text-field-1']"));
        cityName.sendKeys("Daresselam");

        WebElement saveButton = driver.findElement(By.cssSelector(" ms-save-button > button"));
        saveButton.click();

        Thread.sleep(1500);
        WebElement newName = driver.findElement(By.cssSelector("tbody >:first-child >td:nth-child(2)"));
        Assert.assertTrue(newName.getText().equalsIgnoreCase("Daresselam"));


    }

}
