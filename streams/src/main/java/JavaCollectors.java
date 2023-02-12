import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        //toCollection(Supplier): is used to crate a collection using collector
        System.out.println("--------toCollection----------");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println("-----Set----");
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList: returns a Collector interface that gathers the input data into a new List
        // We will use toList a lot!
        System.out.println("--------toList---------");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);


        //toSet: returns a Collector interface that gathers the input data into a new Set
        System.out.println("--------toSet---------");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);
    }
}
