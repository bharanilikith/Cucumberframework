package scripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/testcase.feature"
,glue= {"stepdefinition"})
public class Runner {
	
//runner
}
