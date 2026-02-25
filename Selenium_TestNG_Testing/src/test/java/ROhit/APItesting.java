package ROhit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APItesting {
		@Test
		public void getUserTest() {
			
			// getting single record from data
//			get("https://dummyjson.com/products/2") // the link we need to automate it send get request to url calls the api and gets the response from the server
//			.then() // this is used for validating and extracting response
//			.log().all()  // it prints the output in the console
//			.statusCode(200) //it is a response code from api means request complete successfully
//			.body("id",equalTo(2)); // id is a jason field and eauals to means compare the id 
			
			// gettind all record from data
//			get("https://dummyjson.com/products?limit=194")
//			.then()
//			.log().all()
//			.statusCode(200)
//			.body("id", equalTo(25));
			
			//POST a single record means add a single record
//			String requestBody = "{ \"title\": \"New Phone\", \"price\": 500 }"; 
//	        given()
//	            .contentType(ContentType.JSON)
//	            .body(requestBody)
//	        .when()
//	            .post("https://dummyjson.com/products/add")
//	        .then()
//	        .log().all()
//	            .statusCode(201);
	        
			// Put
//	        String requestBody = "{ \"title\": \"New Phone\", \"price\": 5 }";
//	        given()
//	            .contentType(ContentType.JSON)
//	            .body(requestBody)
//	        .when()
//	            .put("https://dummyjson.com/products/1")
//	        .then()
//	            .log().all()
//	            .statusCode(200);
	        
	        //Delete
	        delete("https://dummyjson.com/products/195")
	        .then()
	          .log().body()
	            .statusCode(200);  
	        System.out.println("DELETE PRODUCT");
		}
}
