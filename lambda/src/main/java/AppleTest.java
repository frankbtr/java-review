import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(300, Color.RED));



        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        System.out.println("Using Predicate.....");
        List<Apple> greenApple2 =  filterApples2(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple2);

        System.out.println("Using Predicate heavy apple...");
        List<Apple> heavyApple2 =  filterApples2(inventory, apple -> apple.getWeight() > 150);
        System.out.println(heavyApple2);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

    private static List<Apple> filterApples2(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}
