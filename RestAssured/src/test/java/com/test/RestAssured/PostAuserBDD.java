package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAuserBDD {
	@Test
	public void postAuserBDD() {

		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"first_name\": \"Emmily E.\",\r\n"
				+ "    \"last_name\": \"Schneider\",\r\n"
				+ "    \"email\": \"Emmily@testmail.com\"\r\n"
				+ "}")
		.post("/employees").asPrettyString();
	}
}