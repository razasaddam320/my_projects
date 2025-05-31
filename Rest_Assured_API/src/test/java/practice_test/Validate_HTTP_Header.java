package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_HTTP_Header {
	@Test
	public void header() {
		
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://reqres.in/api/users/2");
		
		//create get request
		Response response = req.get();
		
		//validate response header
//	String contentdata = response.getHeader("Content-Type");
//		System.out.println(" content-Tpye is :-"+contentdata);
		
		//for print  all headers list
	Headers header = response.getHeaders();
	
		for (Header headerlist : header) {
			
			System.out.println(headerlist.getName()+ " -- " + headerlist.getValue());
		}
		
	} 
	
	@Test
	public void bDDStyle() {
		
	System.out.println("---------------------------------------------------------------------------");	
		RestAssured.given()
		.when().get("https://reqres.in/api/users/2")
		.then()
		//print all headers data
		.log().headers()
		
		// we can validate the header 
			.header("Content-Type", "application/json; charset=utf-8");
			
	}
}
