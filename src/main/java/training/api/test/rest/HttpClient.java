package training.api.test.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Collections;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.Method.*;

public class HttpClient {

    final private Map<String,String> ACCEPT_JSON_HEADER = Collections.singletonMap("Accept","application/json");

    public HttpClient(){
        RestAssured.defaultParser= Parser.JSON;
    }

    public static Response get(String url, RequestSpecification requestSpecification){
        return doRequest(prepareRequest(requestSpecification),GET,url);
    }

    private static RequestSpecification prepareRequest(){return given().header("Accept","application/json");}

    private static RequestSpecification prepareRequest(RequestSpecification requestSpecification){
        return prepareRequest().spec(requestSpecification);
    }

    private static Response doRequest(RequestSpecification requestSpecification, Method method, String url){
        return requestSpecification.when().request(method,url);
    }
}
