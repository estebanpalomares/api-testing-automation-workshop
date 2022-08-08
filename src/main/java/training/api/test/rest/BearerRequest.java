package training.api.test.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import training.api.test.model.BodyExample;

public class BearerRequest extends BaseRequest{

    private final String reqConsumerUrl = "https://www.httpbin.org/bearer";
    private final RequestSpecBuilder requestSpecBuilder = this.generateRequestBuilder();

    public Response getMethod (String authority){
        requestSpecBuilder.addHeader("Authorization", authority);
        return HttpClient.get(reqConsumerUrl,requestSpecBuilder.build());
    }
}
