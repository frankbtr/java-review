package review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CarTest {

    public static void main(String[] args) {

        List<Car> carList  = new ArrayList<Car>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 210, 2018));

        System.out.println("List of fast cars " + filterFastCar(carList));
        System.out.println("List of new cars: " + filterNewCar(carList));


        System.out.println("--------------------------------------------");
        System.out.println("List of fast cars " + filter(carList, new CarFastPredicate()));
        System.out.println("List of new cars " + filter(carList, new CarNewPredicate()));


        //Durable car, if a car is Toyota, it is durable
        System.out.println("List of durable cars: " + filter(carList, new CarDurablePredicate()));


        System.out.println("---------Lambda------------");
        // -> fat arrow, lambda implementation
        CarPredicate newCarLambda = car-> car.getYear() >2015;
        List<Car> newCars = filter(carList, newCarLambda);
        System.out.println("New cars: " + newCars);

        List<Car> fastCars = filter(carList, car-> car.getTopSpeed() >160);
        System.out.println("Fast cars: " + newCars);


    }

    // this is not a good practice, you need to write new method foreach different implementations
    private static List<Car> filterFastCar (List<Car> cars){
        List<Car> filterCars = new ArrayList<Car>();
        for (Car car: cars){
            if (car.getTopSpeed() > 160){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    // this is not a good practice, you need to write new method foreach different implementations
    private static List<Car> filterNewCar (List<Car> cars){
        List<Car> filterCars = new ArrayList<Car>();
        for (Car car: cars){
            if (car.getYear() > 2015){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    // pass the behaviors to the method
    // this one will work for both, this is a better approach!
    // Depence on different predicate it takes different function
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCars = new ArrayList<Car>();
        for (Car car: cars){
            if (carPredicate.test(car)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }


}
