package test;

import org.testng.annotations.*;


public class day3 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void login1(String urlname){
		System.out.println("Login-1 for the url " + urlname);
	}
	
	@Test(dataProvider="getData")
	public void login2(String usrname, String passwd){
		System.out.println("userName is " +usrname);
		System.out.println("Password is " +passwd);
	}
	
	@Test(groups={"Smoke"})
	public void login3(){
		System.out.println("Login-3");
	}
	
	@DataProvider()
	public Object getData() {
		Object[][] data1 = new Object[3][2];
		
		data1[0][0] = "username1";
		data1[0][1] = "password1";
		data1[1][0] = "username2";
		data1[1][1] = "password2";
		data1[2][0] = "username3";
		data1[2][1] = "password3";
		
		return data1;
		
		
	}

}
