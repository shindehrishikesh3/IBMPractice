package cucumbermap;

import Utilities.SeleniumOperations;
import Utilities.Temp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature1 
{
	

	@When("^user open \"([^\"]*)\" browser$")
	public void user_open_browser(String bname) throws Throwable 
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]="E:\\2022\\Automation Support 1\\chromedriver.exe";
		SeleniumOperations.LaunchBrowser(input);
       
	}

	@When("^user open URL as \"([^\"]*)\"$")
	public void user_open_URL_as(String url) throws Throwable 
	{
	  Object[] input1=new Object[1];
	  input1[0]=url;
	  SeleniumOperations.OpenApplication(input1);
	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String uname) throws Throwable 
	{
      Object[] input2=new Object[2];
      input2[0]="//*[@type='text']";
      input2[1]=uname;
      SeleniumOperations.SendKeys(input2);
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String pass) throws Throwable 
	{
	      Object[] input3=new Object[2];
	      input3[0]="//*[@type='password']";
	      input3[1]=pass;
	      SeleniumOperations.SendKeys(input3);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
	      Object[] input4=new Object[1];
	      input4[0]="//*[@name='login']";
	      SeleniumOperations.Click(input4);
	}

	@Then("^user can able to see user profile$")
	public void user_can_able_to_see_user_profile() throws Throwable 
	{
	     Object[] input5=new Object[1];
	     input5[0]="//*[@class='_97w4']";
	     SeleniumOperations.Validation(input5);
	}	
	

	@When("user enter {string} as username")
	public void user_enter_as_username(String uname) 
	{
	      Object[] input7=new Object[2];
	      input7[0]="//*[@type='text']";
	      input7[1]=uname;
	      SeleniumOperations.SendKeys(input7);
	}
	
	@When("user enter {string} as password")
	public void user_enter_as_password(String pass) 
	{
	      Object[] input8=new Object[2];
	      input8[0]="//*[@type='password']";
	      input8[1]=pass;
	      SeleniumOperations.SendKeys(input8);
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	     Object[] input9=new Object[1];
	     input9[0]="(//*[@type='image'])[4]";
	     SeleniumOperations.Click(input9);
	}
	
	@Then("user able to see user profile")
	public void user_able_to_see_user_profile() 
	{
	
	}
	
	
	

}
