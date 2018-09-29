package idpro.module.signUp;

import org.testng.annotations.DataProvider;

import idpro.generic.lib.Idpro_AppData;

public class SignUp_TestData extends Idpro_AppData{
	
		
		String firstName = "Nihar";
		String lastName = "Sahu";
		String  mobileNum = "9999999";

	
	@DataProvider
	public Object[][] testData_TC001() {
		
		Object[][] data = new Object[2][6];
		data[0][0] = "Nihar"; 
		
		return data;
		
		
	}
	

}
