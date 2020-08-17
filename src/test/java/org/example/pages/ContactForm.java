package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactForm {
    WebDriver driver;

    By firstNameField = By.name("first_name");
    By lastNameField = By.name("last_name");
    By commentsField = By.name("message");

    public ContactForm(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    void setCommentsField(String comment) {
        driver.findElement(commentsField).sendKeys(comment);
    }
}
