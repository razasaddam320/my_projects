package practice_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_HTTP_Response {
	@Test
	public void getSingleUser() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		//get requestSpecifation of the request
		RequestSpecification res = RestAssured.given();
	
		//call the method
		Response response = res.get();
		
		int statuscode = response.getStatusCode();
		
		//validate response code
		Assert.assertEquals(statuscode/*actual status code*/ , 200/* expected staus code*/);
		
		//validate status line
		String statusline = response.getStatusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}
	
	 //  Another way BDD Style
	@Test
	public void bDD_Stye() {
		
		RestAssured.given()
		.when().get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK");
		
	}

}
