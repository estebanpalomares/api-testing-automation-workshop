package training.api.test.services;

import io.restassured.response.Response;
import training.api.test.datamanager.BodyExampleRepository;
import training.api.test.model.BodyExample;
import training.api.test.rest.AnythingRequest;

public class AnythingService {

    private final BodyExampleRepository bodyExampleRepository = new BodyExampleRepository();
    private final AnythingRequest anythingRequest = new AnythingRequest();

    public BodyExample getNewBodyExample(String name, String lastName, Integer age){return this.bodyExampleRepository.newBodyExample(name,lastName,age);}

    public Response getMethodToAnything(BodyExample bodyExample){return this.anythingRequest.getMethod(bodyExample);}

    public Response postMethodToAnything(BodyExample bodyExample){return this.anythingRequest.postMethod(bodyExample);}

    public Response putMethodToAnything(BodyExample bodyExample){return this.anythingRequest.putMethod(bodyExample);}

    public Response patchMethodToAnything(BodyExample bodyExample){return this.anythingRequest.patchMethod(bodyExample);}

    public Response deleteMethodToAnything(BodyExample bodyExample){return this.anythingRequest.deleteMethod(bodyExample);}
}
