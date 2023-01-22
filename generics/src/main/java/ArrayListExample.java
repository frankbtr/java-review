import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args) {

        // Java 5, there was no type checking
        ArrayList<Integer> item = new ArrayList<Integer>();

        item.add(0);
        item.add(1);
        item.add(2);
        item.add(3);
      //  item.add("apple");

        printList(item);

    }
        private static void printList(ArrayList<Integer> item){

//            for (Object i:item){
//                System.out.println((Integer) i * 2);
//            }

            for (int i:item){
                System.out.println(i * 2);
            }
        }


}
