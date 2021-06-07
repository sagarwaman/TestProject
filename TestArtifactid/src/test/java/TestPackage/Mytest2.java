package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basicpackage.Baseclass;

public class Mytest2 extends Baseclass{

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("In Before Method");
	}
	
	@Test
	public void Test2() {
		Baseclass.setup();
		driver.findElement(By.name("q")).sendKeys("Mumbai");
	}

}
