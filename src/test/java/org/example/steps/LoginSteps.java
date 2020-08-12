package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Before()
    public void setup() {
        //System.setProperty("webdriver.gecko.driver", "[path//to//driver.exe]");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

    }

    @Given("User navigates to stackoverflow website")
    public void userNavigatesToStackoverflowWebsite() {
        driver.get("https://stackoverflow.com/");
    }

    @And("User clicks on the login button on homepage")
    public void userClicksOnTheLoginButtonOnHomepage() {
        driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
    }

    @And("User enters a valid username")
    public void userEntersAValidUsername() {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Takilogin");
    }

    @And("User enters a valid password")
    public void userEntersAValidPassword() {

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
    }

    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"openid-buttons\"]/button[contains(., \"Facebook\")]")).click();
    }

    @Then("User should be taken to the successful login page")
    public void userShouldBeTakenToTheSuccessfulLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement zalogujSieDoFB = driver.findElement(By.xpath("//*[contains(text(), \"Zaloguj się do Facebooka\")]"));
        Assert.assertTrue(zalogujSieDoFB.isDisplayed());

    }
}
