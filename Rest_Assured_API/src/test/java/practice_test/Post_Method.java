package practice_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_Method {
	@Test
	public void tc2() {
		
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "saddam");
		jsonData.put("job", "QA");
		// we are writting BDD
		
		RestAssured.baseURI ="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type", "Application/json")
		.body(jsonData.toString())
		.when().post()
		.then().log().all().statusCode(201);
		
	}
}
