package com.test.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import static io.restassured.specification.RequestSpecification.*;

public class GetAllUserBDD {
@Test

	public void getAllUsersBDD() {
		RestAssured.given().baseUri("http://localhost:3000").when().get("/employees").prettyPrint();
		
	}
}
