package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/BUSINESS LOGIC/Feature1.feature",
	glue="cucumbermap",
	tags="@Sprint01 and @SmokeTest"
		

		
		
		
		
)

public class Runner1 {

}
