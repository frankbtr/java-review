package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        //  inventory.add(Orange.builder().weight(200).build());   // you can skipp color use Builde
        inventory.add(Orange.builder().weight(320).color(Color.RED).build());
        inventory.add(Orange.builder().weight(150).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(333).color(Color.RED).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + " g";
        prettyPrintOrange(inventory, simpleFormatter);

        System.out.println("---------------------------");

        // pass the action directly to the method, that is the point of functional programming!
        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + " g");


        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        System.out.println("------Fancy Formatter-------");
        prettyPrintOrange(inventory, fancyFormatter);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
