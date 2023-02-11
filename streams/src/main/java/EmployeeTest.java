import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        //Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        System.out.println("------------First way to get phone number one by one-----------");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        System.out.println("------------Second way to get phone number one by one-----------");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
