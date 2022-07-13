package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchUserBDD {
@Test
	public void patchUserBDD() {
		
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.when()
	.header("Content-Type","application/json")
	.body("{\r\n"
			+ "        \"last_name\": \"CarterJohn\"\r\n"
			+ "}")
	.patch("/employees/43").asPrettyString();
		
}
}