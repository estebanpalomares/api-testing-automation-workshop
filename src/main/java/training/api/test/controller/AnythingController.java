package training.api.test.controller;

import io.restassured.response.Response;
import training.api.test.model.BodyExample;
import training.api.test.services.AnythingService;

public class AnythingController {

    private AnythingService anythingService = new AnythingService();

    public BodyExample createBodyExample(String name, String lastName, Integer age){return this.anythingService.getNewBodyExample(name,lastName,age);}

    public Response useGETMethodOnAnythingURL(BodyExample bodyExample){return this.anythingService.getMethodToAnything(bodyExample);}

    public Response usePOSTMethodOnAnythingURL(BodyExample bodyExample){return this.anythingService.postMethodToAnything(bodyExample);}
}
