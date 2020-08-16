package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ContactForm {
    WebDriver driver;

    @Before()
    public void setup() {
        //System.setProperty("webdriver.gecko.driver", "[path//to//driver.exe]");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

    }

    @When("I access webdriver university")
    public void iAccessWebdriverUniversity() {
        driver.get("http://webdriveruniversity.com/");
    }

    @Then("I click on the contact us button")
    public void iClickOnTheContactUsButton() {
        driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
    }

    @And("I enter a first name")
    public void iEnterAFirstName() {
    }

    @And("I enter a last name")
    public void iEnterALastName() {
    }

    @And("I enter email address")
    public void iEnterEmailAddress() {
    }

    @And("I enter comments")
    public void iEnterComments() {
    }

    @When("I click on the submit button")
    public void iClickOnTheSubmitButton() {
    }

    @Then("the information should successfully e submitted via the contact us form")
    public void theInformationShouldSuccessfullyESubmittedViaTheContactUsForm() {
    }

    @When("I click on the reset button")
    public void iClickOnTheResetButton() {
    }

    @Then("all information which were listed by the user on the contact us form should be now removed")
    public void allInformationWhichWereListedByTheUserOnTheContactUsFormShouldBeNowRemoved() {
    }
}