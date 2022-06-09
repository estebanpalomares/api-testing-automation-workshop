package training.api.test.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import training.api.test.mapper.BodyExampleMapper;
import training.api.test.model.BodyExample;

public class AnythingRequest extends BaseRequest{

    private final String reqConsumerUrl = "https://www.httpbin.org/anything";
    private final RequestSpecBuilder requestSpecBuilder = this.generateRequestBuilder();

    public Response getMethod (BodyExample bodyExample){
//        requestSpecBuilder.setBody(BodyExampleMapper.INSTANCE.toDto(bodyExample));
        requestSpecBuilder.setBody(bodyExample);

        return HttpClient.get(reqConsumerUrl,requestSpecBuilder.build());
    }

    public Response postMethod (BodyExample bodyExample){
//        requestSpecBuilder.setBody(BodyExampleMapper.INSTANCE.toDto(bodyExample));
        requestSpecBuilder.setBody(bodyExample);

        return HttpClient.post(reqConsumerUrl,requestSpecBuilder.build());
    }
}
