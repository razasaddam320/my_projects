package practice_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Validate_JSON_ResponseBody {
	@Test
	public void json_Body () {
		
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://reqres.in/api/users/2");
		
		//perform the get request
		 Response response = req.get();
		 
		 //read response body
		ResponseBody resbody = response.getBody();
		
		
		String bodydata =	resbody.asPrettyString();
		System.out.println(bodydata);
		
	}
	
	@Test
	public void bDDStyle() {
		
		RestAssured.given()
		.when().get("https://reqres.in/api/users/2")
		.then().log().body();
		
		
	}

}
