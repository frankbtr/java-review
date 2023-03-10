package functional_interfaces;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
