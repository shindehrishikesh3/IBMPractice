package Utilities;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumOperations 
{

	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();

	// Launch Browser	
	public static Hashtable<String,Object> LaunchBrowser(Object[]inputparameters)
	{
		String a=(String) inputparameters[0];
		String b=(String) inputparameters[1];
		try {
		if(a.equalsIgnoreCase("Chrome"))
		{	
		   System.setProperty("webdriver.chrome.driver", b);
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		}
		else if(b.equalsIgnoreCase("Edge")) 
		{
		   System.setProperty("webdriver.edge.driver", b);
		   driver=new EdgeDriver();
		   driver.manage().window().maximize();
		}
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Method used: LaunchBrowser,  Input: "+ inputparameters[0]);
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Method used: LaunchBrowser,  Input: "+ inputparameters[0]);
		}
	 return outputparameters;
	}

	// Open Application
	public static Hashtable<String,Object> OpenApplication(Object[]inputparameters)
	{
		
		String a=(String) inputparameters[0];
		try {
		driver.get(a);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Method used: OpenApplication,  Input: "+ inputparameters[0]);
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Method used: OpenApplication,  Input: "+ inputparameters[0]);
		}
		 return outputparameters;
	}

	// Send Keys
	public static Hashtable<String,Object> SendKeys(Object[]i)
	{
		
		String a=(String) i[0];
		String b=(String) i[1];
		try {
		WebElement c=driver.findElement(By.xpath(a));
		c.sendKeys(b);	
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Method used: Send Keys,  Input: "+ i[0]);
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Method used: Send Keys,  Input: "+ i[0]);
		}
		 return outputparameters;
	}

	// Click on Element
	public static Hashtable<String,Object> Click(Object[]inputparameters)
	{
		
		String a=(String) inputparameters[0];
		try {
		WebElement b=driver.findElement(By.xpath(a));
		b.click();
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Method used: ClickOnElement,  Input: "+ inputparameters[0]);
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Method used: ClickOnElement,  Input: "+ inputparameters[0]);
		}
		 return outputparameters;
	}
	
	// Validation
	public static Hashtable<String,Object> Validation(Object[]inputparameters)
	{
		String a=(String) inputparameters[0];
		try {
		WebElement c=driver.findElement(By.xpath(a));
		String d=c.getText();

	  if(d.equalsIgnoreCase("Forgotten password?"))
	  {
		  System.out.println("PASS");
	  }else
	  {
		  System.out.println("FAIL");
	  }
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Method used: Validation,  Input: "+ inputparameters[0]);
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Method used: Validation,  Input: "+ inputparameters[0]);
		}
		 return outputparameters;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
