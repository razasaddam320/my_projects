package practice_test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.response.Response;

// print status code , body , time , header
public class Get_Method {
	@Test
	public void tc() {
		
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(" Status code is "+response.getStatusCode()+ " body is " + response.getBody().asString() +" time is "
	+response.getTime()+(" ms")+ " header is "+ response.getHeader("content-type"));
	//validate the status code 
		
		int Expected_status_coed = 200;
		int actual_Status_code = response.getStatusCode();
		assertEquals(Expected_status_coed, actual_Status_code);
	}	
		@Test
		public void tc2() {
			// BDD given, when, then
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given()
		.queryParam("page", "2")
		.when().get()
		.then().statusCode(200);
		
		// if you want to remove restAssured name then in import write static and at last give .*
		
		
		
	}
}
