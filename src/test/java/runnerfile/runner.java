package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    features = "D:\\automation\\workspace\\BDD1\\src\\test\\resources\\senarious\\testcasestep.feature",
    plugin = {"pretty", "html:target/cucumber-reports.html",
              "json:target/cucumber.json",
              "rerun:target/rerun.txt"} //Creates a text file with failed scenarios
              ,tags = "@homepage",glue="stepdefenationfile"
           )

public class runner {

}
