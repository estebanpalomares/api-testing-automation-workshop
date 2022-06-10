package training.api.test.datamanager;

import training.api.test.model.BodyExample;

public class BodyExampleRepository {

    public BodyExample newBodyExample(String name, String lastName, Integer age){
        BodyExample bodyExample = new BodyExample();
        bodyExample.setName(name);
        bodyExample.setLastName(lastName);
        bodyExample.setAge(age);

        return bodyExample ;
    }
}
