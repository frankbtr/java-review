package functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(User.builder().firstName("Frank").lastName("Batur").age(30).build());
        users.add(User.builder().firstName("Tony").lastName("Erick").age(20).build());
        users.add(User.builder().firstName("Mike").lastName("Sun").age(18).build());
        users.add(User.builder().firstName("Ali").lastName("Erkan").age(40).build());


        //Print all elements in the list (if there is a condition, that means boolean, we can use Predicate)
        printName(users, p -> true);

        System.out.println("------------------------------");

        //Print all users that last name start with E (if there is a condition, that means boolean, we can use Predicate)
        printName(users, user -> user.getLastName().startsWith("E"));
    }


    private static void printName (List<User> users, Predicate<User> p){
        for (User user: users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
