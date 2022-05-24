package training.api.test.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import training.api.test.mapper.BodyExampleMapper;
import training.api.test.model.BodyExample;

public class AnythingRequest extends BaseRequest{

    private String reqConsumerUrl = "https://www.httpbin.org/anything";
    private RequestSpecBuilder requestSpecBuilder = this.generateRequestBuilder();

    public Response getMethod (BodyExample bodyExample){
        requestSpecBuilder.setBody(BodyExampleMapper.INSTANCE.toDto(bodyExample));

        return HttpClient.get(reqConsumerUrl,requestSpecBuilder.build());
    }
}
