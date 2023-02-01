package double_colon_operator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


       //Zero-argument
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());
        System.out.println(c1.get().getMake());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());
        System.out.println(c2.get().getMake());

        //One argument
        Function<Integer, Car> f1 = model -> new Car(model);
        System.out.println(f1.apply(2009).getModel());

        Function<Integer, Car> f2 = Car::new;
        System.out.println(f2.apply(2015).getModel());


        //Two argument
         BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
         System.out.println(b1.apply("Honda", 2007).getMake());

        BiFunction<String, Integer, Car> b2 = Car::new;
        System.out.println(b2.apply("Nissan", 2001).getMake());


    }
}
