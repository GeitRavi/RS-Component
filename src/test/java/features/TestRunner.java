package features;

/**
 * Created by RaviK on 07/10/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = "steps",
        plugin =  {
                "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json",
                "junit:target/junit-report.xml"
        }
    )
public class TestRunner {
}
