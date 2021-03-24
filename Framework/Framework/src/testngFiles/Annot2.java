package testngFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	public WebDriver driver = null;   //set global variable for driver
	
	@Test
	public void login ()throws IOException
	{
		Properties prop= new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Suparna Shil\\git\\TestNG-Works\\Framework\\Framework\\src\\testngFiles\\datadriven.properties");
		prop.load(file);
		
		System.out.println(prop.getProperty("username"));
		//driver.findElement(By.xpath).sendkeys(username)
		//
		
		
		
		if(prop.getProperty("browser").equals("chrome"))     //takes briver as variable from properties file then throw it to a if else statement
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driver_location"));
			driver = new ChromeDriver();
					}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	
		
		driver.get(prop.getProperty("url"));

		
	}
	
	
	@Test
	public void software()
	{
		System.out.println("I am the Test");
	}
	@AfterSuite
	public void deinstallsoftware()
	{
		System.out.println("I am the Last");
	}
	
}
