package Basicpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void setup() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
	System.out.println("Browser is launched successfully");

}
	
	@BeforeSuite
	public void BSuiteMethod() {
		System.out.println("I am in BsuiteMethod");
	}
	
	@AfterSuite
	public void ASuiteMethod() {
		System.out.println("I am in AsuiteMethod");
	}
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("I am in Before Test Method");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("I am in After Test Method");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("I am in After Class Method");
	}
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("I am in Before Class Method");
	}
	
	@AfterMethod
	public void AfterMethodTest() {
		System.out.println("I am in After method");
		driver.quit();
	}
}
