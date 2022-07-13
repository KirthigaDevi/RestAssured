package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteUser {
@Test
	public void deleteUser() {
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json");
				
		Response response = requestSpecification.request(Method.DELETE,"/employees/42");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		
}
}