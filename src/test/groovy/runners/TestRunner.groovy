package runners

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions (features = ["src/test/groovy/features/"]
        // , monochrome = true
        //, plugin = ["pretty","html:target/cucumber"]
        , glue = ["src/test/groovy/steps"]
)
public class TestRunner {
}