package RestAssured.CareferTask;

import org.testng.annotations.Test;

public class LoginTest  extends LoginPage{
	
	
	@Test	

	public void RunLoginAPI() {
		
		LoginPage test = new LoginPage();
		test.CheckLogin();
	
	} 
	
	
}
	