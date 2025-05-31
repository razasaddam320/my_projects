package practice_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete {
	@Test
	public void tc5() {
	RestAssured.baseURI ="https://reqres.in/api/users/974";
	RestAssured.when().delete()
	.then().log().all().statusCode(204);
   }
}
