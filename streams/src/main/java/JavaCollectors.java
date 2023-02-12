import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        //toCollection(Supplier): is used to crate a collection using collector
        System.out.println("--------toCollection()----------");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println("-----Set()----");
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList(): returns a Collector interface that gathers the input data into a new List
        // We will use toList a lot!
        System.out.println("--------toList()---------");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);


        //toSet(): returns a Collector interface that gathers the input data into a new Set
        System.out.println("--------toSet()---------");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new Map
        System.out.println("--------toMap()---------");
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //counting(): returns a Collector that counts the number of the elements
        System.out.println("--------counting---------");
        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        //summingInt(ToIntFunction): returns a Collector that produces the sum of an integer-valued func
        System.out.println("--------summingInt(ToIntFunction)---------");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averageInt(ToIntFunction): returns a Collector that produces the sum of an integer-valued func
        System.out.println("--------averageInt(ToIntFunction)---------");
        Double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);

        //joining(): is used to join various elements of a character or string array into a single string object
        System.out.println("--------joining()---------");
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String courses1 = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(courses1);

        //partitioningBy(): is used to partition a stream of object (or set of elements) based on a given predicate
        System.out.println("--------partitioningBy()---------");
        Map<Boolean, List<Dish> >veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy(): is used for grouping objects by some property and sorting results in a map instance
        System.out.println("--------groupingBy()---------");
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
