package apiTests;
import org.json.simple.JSONObject;
import org.testing.Assert;
import org.testing.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateStore {
	@Test
	public void create()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "TestStore");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3030/stores");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
	}
}
