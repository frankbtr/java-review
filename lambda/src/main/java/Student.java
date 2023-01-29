import lombok.*;

//@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;

    //3 types of constructor: 1. no arg
                            //2. all arg
                            //3. required arg

    // We can also make private constructor


    // @Data -> generate required arg cons, getter and setter, also toString


}
