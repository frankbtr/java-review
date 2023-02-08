import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        myList.forEach(x-> System.out.println(x));
        myList.forEach(System.out::println); //same


        // Stream is an interface, has some intermediate and terminate operations
        System.out.println("Intermediate operation for stream: Filter");
        // Filter
        myList.stream()
                .filter(i -> i %3 ==0)
                .forEach(System.out::println); // forEach is one of the terminate methods.
                                               // Iterable also has a method is called forEach, it is different


        System.out.println("Limit: ");
        myList.stream()
                .filter( i -> i%2 == 0)
                .limit(1)  // limit the number of element
                .forEach(System.out::println);


        System.out.println("Skip: ");
        myList.stream()
                .filter( i -> i%2 ==0)
                .skip(2) // skip the number of element
                .forEach(System.out::println);


        System.out.println("Map: "); // in development, we will use map a lot!
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3 ==0)
                .forEach(System.out::println);

    }
}
