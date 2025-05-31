package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
public class API_Key {
	@Test
	public void api_key_Token() {
		
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://api.openweathermap.org");
		req.queryParam("q", "Mumbai").queryParam("appid", "9eeebf74528c2e6587c6f2e3c930b6b4");
		
		Response res = req.get();
		System.out.println(res.body().asString()+"\n"+res.statusCode()+"\n"+res.statusLine());
	}

}
