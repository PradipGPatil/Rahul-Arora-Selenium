package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/login.feature", glue= {"steps"})
public class RunCuke extends AbstractTestNGCucumberTests{
	
	// we are extending the testngCucumber 
	//2 with the helpf of cucumber option we need to tell where is cucumber option file is
	// with glues tell where is your steps
	
	
	

}
