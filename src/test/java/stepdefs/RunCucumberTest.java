package stepdefs;
import org.example.*;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:Client.feature"},
        glue = {"stepdefs"}
)
public class RunCucumberTest {
}
