package com.cucumber.automation.pages.android;

import com.cucumber.automation.utils.AppiumBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.NoSuchElementException;

import static io.restassured.RestAssured.given;


public class ServicesTest extends AppiumBase {

    public void testResponseCode200(String url) {
        given().when().get(url).then().assertThat().statusCode(200);
    }

}