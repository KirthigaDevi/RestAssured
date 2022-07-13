package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchUser {
@Test
	public void patchUser() {
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json")
				.body("{  \r\n"
						+ "    \"last_name\": \"John\"\r\n"
						+ "}");
		Response response = requestSpecification.request(Method.PATCH,"/employees/42");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		
}
}