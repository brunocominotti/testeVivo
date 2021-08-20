package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//Vivo.feature",
glue = "Steps",
plugin = "pretty",
monochrome = true,
snippets = SnippetType.CAMELCASE,
dryRun = false)

public class RunnerTest {
}
