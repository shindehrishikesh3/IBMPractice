package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Temp
{
	public static WebDriver driver=null;

// Launch Browser	
public static void LaunchBrowser(Object[]inputparameters)
{
	String a=(String) inputparameters[0];
	String b=(String) inputparameters[1];
	
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
}

// Open Application
public static void OpenApplication(Object[]inputparameters)
{
	String a=(String) inputparameters[0];
	driver.get(a);
}

// Send Keys
public static void SendKeys(Object[]i)
{
	String a=(String) i[0];
	String b=(String) i[1];
	WebElement c=driver.findElement(By.xpath(a));
	c.sendKeys(b);	
}

// Click on Element
public static void Click(Object[]inputparameters)
{
	String a=(String) inputparameters[0];
	WebElement b=driver.findElement(By.xpath(a));
	b.click();
}
	
// Validation
public static void Validation(Object[]inputparameters)
{
	String a=(String) inputparameters[0];
	
	WebElement c=driver.findElement(By.xpath(a));
	String d=c.getText();

  if(d.equalsIgnoreCase("Forgotten password?"))
  {
	  System.out.println("PASS");
  }else
  {
	  System.out.println("FAIL");
  }
	
}




// "E:\\2022\\Automation Support 1\\chromedriver.exe"	
// "E:\\2022\\Automation Support 1\\OLD Drivers\\msedgedriver.exe"	
	
	
public static void main(String[] args) 
{

// Launch Browser	
Object[] input=new Object[2];
input[0]="Chrome";
input[1]="E:\\2022\\Automation Support 1\\chromedriver.exe";
LaunchBrowser(input);

// Open Application
Object[] input1=new Object[1];
input1[0]="https://www.facebook.com/";
OpenApplication(input1);

// Enter Username
Object[] input2=new Object[2];
input2[0]="//*[@type='text']";
input2[1]="Hrishi1234";
SendKeys(input2);

//Enter Password
Object[] input3=new Object[2];
input3[0]="//*[@type='password']";
input3[1]="Hrishi5678";
SendKeys(input3);

//Click on Element
Object[] input4=new Object[1];
input4[0]="//*[@name='login']";
Click(input4);
	
//Validation
Object[] input5=new Object[1];
input5[0]="//*[@class='_97w4']";
Validation(input5);
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
}
