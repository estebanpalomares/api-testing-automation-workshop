package training.api.test.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import org.apache.http.client.methods.RequestBuilder;

public class BaseRequest {

    protected HttpClient httpClient = new HttpClient();

    public BaseRequest(){RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();}

    public RequestSpecBuilder generateRequestBuilder(){
        RestAssuredConfig config = RestAssuredConfig.config();

        return new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setConfig(config.headerConfig((HeaderConfig.headerConfig().overwriteHeadersWithName("Content-Type"))))
                .addHeader("Content-Type","application/json");

    }
}
