package functional_interfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        System.out.println("***********PREDICATE*************");

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);

                                                        // Implementation of test method that belongs to the Predicate interface
        Predicate<Integer> lesserThan =  a ->  a < 18; // lambda expression defines implementation of function!
        System.out.println(lesserThan.test(50));

        // if we want to accept one type and return boolean we do not need to create an interface, use ready Predicate!
        // But method signature should be same!


        System.out.println("**************CONSUMER***********");
        // if you accept a type and do not return anything, basically print something you can use ready Consumer!
        Consumer<Integer> display = i -> System.out.println("i");
        display.accept(50);

        // They just accept any type! Integer, double, String, Apple, Orange, Student.....
        System.out.println("**************BICONSUMER***********");
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100, 200);

        System.out.println("**************FUNCTION***********");
        Function<String, String> fun = s -> "Hello " + s;
        // you can modify accept, may accept one String one Integer, and return a String....
        System.out.println(fun.apply("Ozzy"));


        // Do not accept any type, but return one type!
        System.out.println("**************SUPPLIER***********");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
