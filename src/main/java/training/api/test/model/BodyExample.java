package training.api.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BodyExample {
    private String name;
    private String lastName;
    private Integer age;
}
