package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features={"src/test/resources"},
        //dryRun = false,
        tags = "@important"
)
class TagsDemo extends AbstractTestNGCucumberTests {
}
