package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First_TC {
	@Test
	public void tc1 () {
	Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asPrettyString());
		
	}

}
