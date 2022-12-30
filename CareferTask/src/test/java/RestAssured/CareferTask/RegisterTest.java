package RestAssured.CareferTask;

import org.testng.annotations.Test;


public class RegisterTest extends RegisterPage  {


	@Test	

	public void CheckRegisterAPI() {

		RegisterPage test = new RegisterPage();
		test.CheckRegister();
	} 
}
