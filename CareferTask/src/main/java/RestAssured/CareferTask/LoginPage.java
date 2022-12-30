package RestAssured.CareferTask;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.File;

public class LoginPage {


	//Adding Headers parameters
	Header PlatformHeader = new Header("Platform","careferProviderApplication2Ej!%");
	Header AcceptHeader = new Header("Accept","application/json");
	Header ContentHeader = new Header("Content-Type","application/json");

	Headers InfoHeaders = new Headers(PlatformHeader,AcceptHeader,ContentHeader);

	//Adding Response body JSON File format
	File body = new File(System.getProperty("user.dir")+"/Resources/Login.json");

	// Adding URL Parameters
	String BaseUrl = "https://provider.test.carefer.co/api/provider";
	String API = "/v1/auth/login";

	public void CheckLogin() {

		given()
		.baseUri(BaseUrl)
		.headers(InfoHeaders)
		.body(body)
		.log().all()
		.when().post(API)
		.then().log().all()
		.assertThat().statusCode(200)
		.assertThat().body("data.name",is(equalTo("Hussien's Warsha 2022")))
		.assertThat().body("data.is_verified",is(equalTo(1)));
	}


}



