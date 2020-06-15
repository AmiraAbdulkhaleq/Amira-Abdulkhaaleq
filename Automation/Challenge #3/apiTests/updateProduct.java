package apiTests;

import org.json.simple.JSONObject;
import org.testing.Assert;
import org.testing.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateProduct {
    @Test
	public void update()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("price", "100");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3030/products/127687");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);

	}
}
