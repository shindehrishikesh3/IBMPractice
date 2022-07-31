package cucumbermap;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trial 
{
	
	
public static void get()
{
System.out.println("get cllled");
}
	
public static void main(String[] args) 
{

System.setProperty("webdriver.chrome.driver", "E:\\2022\\Automation Support 1\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
	
driver.findElementById("email").sendKeys("admin");
driver.findElementByXPath("//*[@name='pass']").sendKeys("admin1");


Actions act=new Actions(driver);

WebElement a=driver.findElementByXPath("//*[@name='login']");

act.moveToElement(a).build().perform();


Alert z=driver.switchTo().alert();


	
	
}
}
