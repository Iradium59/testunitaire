package cda.java.exercice7;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/exercice7",
        glue = "cda.java.exercice7",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        publish = false
)
public class RunCucumberTest {
}

