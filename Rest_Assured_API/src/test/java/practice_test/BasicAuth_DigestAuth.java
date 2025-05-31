package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuth_DigestAuth {
	@Test
	public void basic_Auth() {
		
		RequestSpecification res = RestAssured.given();
		res.baseUri("https://httpbin.org/basic-auth/saddam/saddam");
		
	Response response =	res.auth().basic("saddam", "saddam").get();
	System.out.println(response.statusLine() + " \n" + response.asPrettyString());
	
		
	} 
	@Test
	public void digest_Auth() {
		
		RequestSpecification res =RestAssured.given();
		res.baseUri("https://httpbin.org/digest-auth/undefined/raza/raza/MD5");
		
		Response responce = res.auth().digest("raza", "raza").get();
		System.out.println(responce.statusCode()+ "\n"+ responce.asPrettyString());
	}
}
