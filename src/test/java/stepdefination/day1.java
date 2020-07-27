package stepdefination;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class day1 extends BaseDriver {

    @Given("^Task1$")
    public void task1(){
        driver.navigate().to("https://www.saucedemo.com/");
        List<String> userNames = new ArrayList<>();
        userNames.add("standard_user");
        userNames.add("problem_user");
        userNames.add("performance_glitch_user");
        userNames.add("locked_out_user");


        for (String userN:userNames) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement userName = driver.findElement(By.id("user-name"));
            userName.sendKeys(userN);
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("secret_sauce");
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
            driver.navigate().back();
        }



    }


    @Given("^navigate$")
    public void navigate()  {

        System.out.println("hello");
    }

    @Given("^pull$")
    public void pull() throws Throwable {

        System.out.println("Dogan");

    }
    @Given("^pulling$")
    public void pulling() throws Throwable {

        System.out.println("ay");

    }


    @Given("^push$")
    public void push() throws Throwable {

        System.out.println("ay");

    }

}