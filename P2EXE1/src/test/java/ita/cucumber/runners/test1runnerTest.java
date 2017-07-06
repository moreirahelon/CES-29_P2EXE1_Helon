package ita.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        plugin = {"pretty"},
        tags = "@test1",
        features = "src/test/java/ita/cucumber/features/",
        glue = "ita.cucumber.steps"
)


public class test1runnerTest {
}
