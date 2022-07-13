package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutUser {
@Test
	public void postAuser() {
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\": \"Emmily A.\",\r\n"
						+ "    \"last_name\": \"Schneider\",\r\n"
						+ "    \"email\": \"Emmily@testmail.com\"\r\n"
						+ "\r\n"
						+ "}");
		Response response = requestSpecification.request(Method.PUT,"/employees/42");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		
}
}