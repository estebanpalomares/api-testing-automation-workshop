package training.api.test.services;

import io.restassured.response.Response;
import training.api.test.rest.BearerRequest;

public class BearerService {

    private final BearerRequest bearerRequest = new BearerRequest();

    public Response getMethodToBearer(String authority){return this.bearerRequest.getMethod(authority);}
}
