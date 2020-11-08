package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

            plugin = {
                    "json:target/cucumber.json",
                    "html:target/cucumber-report.html",
            },
            features = "src/test/resources/features",
            glue = "src/test/java/stepDefinitions",

            tags ="firstStep"







    )

    public class CukesRunner {
    }
