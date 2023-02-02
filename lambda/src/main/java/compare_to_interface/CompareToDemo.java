package compare_to_interface;

import java.util.*;

import static java.util.Comparator.comparing;

public class CompareToDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        // all in one step, just passed the implementation, skip the middle layer
        Collections.sort(list, (o1, o2) -> (o1>o2) ? -1: (o1<o1) ? 1 :0);
        System.out.println(list);

        //Ascending
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);




    List<Apple> myInventory = Arrays.asList(
            new Apple(50, Color.GREEN),
            new Apple(155,Color.RED),
            new Apple(120, Color.GREEN)
    );

    //Comparing the apple based on weight
    Comparator<Apple> sortApple = comparing((apple) -> apple.getWeight());
    myInventory.sort(sortApple);
    System.out.println(myInventory);

    // import static method and implement double colon operator
    myInventory.sort(comparing(apple -> apple.getWeight()));
    myInventory.sort(comparing(Apple::getWeight));


    //Reversed
    myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);

    //Chaining
        myInventory
                .sort(comparing(Apple::getColor)
                        .reversed()
                        .thenComparing(Apple::getWeight));
        System.out.println(myInventory);





    }
}