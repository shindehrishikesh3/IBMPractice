package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/BUSINESS LOGIC/Feature2.feature",
	glue="cucumbermap"
		

		
		
		
		
)

public class Runner2 {

}
