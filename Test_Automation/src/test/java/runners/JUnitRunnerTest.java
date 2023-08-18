package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {"pretty", "json:target/report.json", "summary"},
//snippets = camelcase,
monochrome= true,
//dryRun = false,
glue = "stepDefinitions",
features = "features/flipkart.feature"
//tags = "@invokingChrome and not @quit"

		)
public class JUnitRunnerTest {

}
