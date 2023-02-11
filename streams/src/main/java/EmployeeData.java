import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@frank.com", Arrays.asList("2029124532", "2029124556")),
                        new Employee(101, "Joel", "joel@frank.com", Arrays.asList("2029124556", "2029124513")),
                        new Employee(102, "Can", "can@frank.com", Arrays.asList("2029124500", "2029124533"))
        );
    }
}
