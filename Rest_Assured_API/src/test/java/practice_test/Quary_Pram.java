package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Quary_Pram {
	@Test 
	public void queryParam() {
		
		RequestSpecification req = RestAssured.given();
		//give url
		req.baseUri("https://reqres.in/api/users");
		req.queryParam("page ", 2);
		//perform get request
		Response res = req.get();
		
		String querydata = res.asPrettyString();
		System.out.println(querydata);
	
	}	
		@Test
		public void bddstyle_QueryParam () {
			
		RestAssured.given().queryParam("per_page", 1)
		.when().get("https://reqres.in/api/users")
		.then().log().body();
		
	}
}
