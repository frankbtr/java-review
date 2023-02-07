package review;

@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car);

    default boolean method(){
        return true;
    }

    // this one is still functional interface, no matter how many default method, as long as we have one abstract method it will be fine
}
