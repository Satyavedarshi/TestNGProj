package test;


import org.testng.Assert;
import org.testng.annotations.*;

public class day4 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"},dependsOnMethods= {"loginphone"})
	public void loginmobile(String urlname){
		System.out.println("Login-4 fopr URL - " +urlname);
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"Smoke"})
	public void loginphone(){
		System.out.println("Login-5");
	}
	
	@Test
	public void APIlogin(){
		System.out.println("Login-6");
	}
	
	@BeforeSuite
	public void befores(){
		System.out.println("Before Suite message");
	}
	
	@AfterSuite
	public void afters(){
		System.out.println("After Suite message");
	}
	
	@BeforeTest
	public void beforet(){
		System.out.println("Before Test message");
	}
	
	@AfterTest
	public void aftert(){
		System.out.println("After Test message");
	}
	
	@BeforeMethod
	public void beforem(){
		System.out.println("Before every Method message");
	}
	
	@BeforeClass
	public void beforec(){
		System.out.println("Before Class message");
	}
	
	@AfterClass
	public void afterc(){
		System.out.println("After Class message");
	}

}
