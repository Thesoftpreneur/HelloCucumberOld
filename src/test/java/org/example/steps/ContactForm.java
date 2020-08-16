package org.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactForm {
    WebDriver driver;

    @When("I access webdriver university")
    public void iAccessWebdriverUniversity() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("http://webdriveruniversity.com/");
    }

    @Then("I click on the contact us button")
    public void iClickOnTheContactUsButton() {
        driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1")).click();
    }

    @And("I enter a first name")
    public void iEnterAFirstName() {
        @SuppressWarnings("unused")
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.name("first_name")).sendKeys("Nanananana");
    }

    @And("I enter a last name")
    public void iEnterALastName() {
        driver.findElement(By.name("last_name")).sendKeys("bobobob");
    }

    @And("I enter email address")
    public void iEnterEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("asd@xyz.pl");
    }

    @And("I enter comments")
    public void iEnterComments(DataTable arg1) {
        List<List<String>> data = arg1.asLists();

        driver.findElement(By.name("message")).sendKeys(data.get(0).get(0)+"\n");
        driver.findElement(By.name("message")).sendKeys(data.get(0).get(1)+"\n");
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