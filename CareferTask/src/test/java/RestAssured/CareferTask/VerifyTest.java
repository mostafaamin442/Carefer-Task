package RestAssured.CareferTask;

import org.testng.annotations.Test;

public class VerifyTest  extends VerifyPage{ 


	@Test	

	public void CheckVerifyAPI() {


		VerifyPage test = new VerifyPage();
		test.CheckVerify();
	}
} 
