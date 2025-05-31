package sdet_;

import java.util.HashMap;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class Post_Reqest_Multiple_ways {
	@Test
	public void hash_Map_way() {
		
		HashMap data = new HashMap();
		data.put("name", "saddam");
		data.put("job", "QA");
		
		
		 given()
				.header("Content-Type" ,"Application/json")
				.body(data)
		
		.when()
			.post("https://reqres.in/api/users")
		
		.then()
			.statusCode(201)
			.log().all();
			
		
	}

}
