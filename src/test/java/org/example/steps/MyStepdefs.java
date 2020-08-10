package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("The driver has a driving license")
    public void theDriverHasADrivingLicense() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName);
    }

    @Given("A child gets into the car")
    public void aChildGetsIntoTheCar() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName);
    }

    @And("The driver drives to {string}")
    public void theDriverDrivesTo(String arg0) {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + arg0);
    }

    @When("The driver drives safetly")
    public void theDriverDrivesSafetly() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName);
    }

    @Then("The driver is at {string}")
    public void theDriverIsAt(String arg0) {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName+arg0);
    }
}
