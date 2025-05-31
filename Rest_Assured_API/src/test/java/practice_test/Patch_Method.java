package practice_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Patch_Method {
	@Test
	public void tc2() {
		
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Raza");
		jsonData.put("job", "Tester");
		// we are writting BDD
		
		RestAssured.baseURI ="https://reqres.in/api/users/974";
		RestAssured.given().header("Content-Type", "Application/json")
		.body(jsonData.toString())
		.when().patch()
		.then().log().all();
		
	}

}
