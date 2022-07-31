package cucumbermap;

import java.net.UnknownHostException;

import Utilities.HTMLReportGenerator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{

@Before
public void BeforeMethod(Scenario scenario) throws UnknownHostException	
{
	HTMLReportGenerator.TestSuiteStart("E:\\2022\\Automation Support 1\\Project\\PRIMUS.html", "PRIMUSBANK");
	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getId());
	System.out.println("-----------------------Test Case Start------------------------");
}
	
@After	
public void AfterMethod(Scenario scenario)
{
	System.out.println("-----------------------Test Case End------------------------");
	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
}
	
	
	
	
}
