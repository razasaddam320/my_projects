package practice_test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Bearer_Token {
	@Test
	public void bearer_Auth_Token() {
		
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://gorest.co.in/public/v2/users");
		
		JSONObject data = new JSONObject();
		data.put("name"," Shakir");
		data.put("job"," Automater");
		data.put("Location"," hyd");
		data.put("gender","male");
		data.put("email", "jhagias123@gmail.com");// change change every exicution
		data.put("status", "Active");
		
		String AuthToken = "Bearer 23573666bf327cb0784839796b7d2b8a0d86bc2b423ce0ba6cfe3e88456eacd3";
		
		req.headers("Authorization", AuthToken)
		.contentType(ContentType.JSON)
		.body(data.toJSONString());
		
		//perform post request
		Response res = req.post();
		Assert.assertEquals(res.statusCode(), 201);
		System.out.println(res.asPrettyString() + "\n"+ res.statusLine());
	} 
}
