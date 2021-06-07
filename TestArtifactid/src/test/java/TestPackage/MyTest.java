package TestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Basicpackage.Baseclass;


public class MyTest extends Baseclass{
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("In Before Method");
	}
	
	@Parameters("Browser")
	@Test
	public void Test1(String Browsername){
	Baseclass.setup(Browsername);	
	System.out.println("First Test Method");
	}
	
	@Test
	public void secondTest() {
		System.out.println("I am in second test method");
	}
}
