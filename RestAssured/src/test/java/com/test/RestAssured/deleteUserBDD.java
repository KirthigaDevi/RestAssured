package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteUserBDD {
@Test
	public void deleteUserBDD() {
		
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.when()
	.header("Content-Type","application/json")
	.delete("/employees/43").asPrettyString();
			
		
}
}