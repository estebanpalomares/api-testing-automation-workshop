package training.api.test.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BodyExampleDto {
    private String name;
    private String lastName;
    private Integer age;
}
