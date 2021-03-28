package Runner;

import Pages.DriverWeb;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = {"@Rob"},
        glue = {""},
        plugin =
                "pretty"
        ,
        //strict = true,dryRun = true
        monochrome = true)

public class RunnerTest {

}
