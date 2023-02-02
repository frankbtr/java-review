package double_colon_operator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        System.out.println("-------reference to the static method");
        //Reference to a static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100, 35);


        System.out.println("-------reference to the instance method");
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x, y);
        m1.calculate(5, 6);

        Calculate m2 = new Calculator()::findMultiply;
        m2.calculate(6, 6);


        System.out.println("--------------------------------------");
        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer", 6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));


        System.out.println("--------------------------------------");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);


        System.out.println("-----------------------------");
        // if you give the Class type to the functional interface, you do not need to write New class type
        BiFunction<MyClass, Integer, Double> v2 = MyClass::method;
        BiFunction<String, String, String> v3 = String::concat;
    }
}
