package apiTests;
import org.json.simple.JSONObject;
import org.testing.Assert;
import org.testing.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProduct {
	@Test
	public void delete()
	{
		RequestSpecification request = RestAssured.given();
		Response response = request.delete("http://localhost:3030/products/48530");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
	}
}

