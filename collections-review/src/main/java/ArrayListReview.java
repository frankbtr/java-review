import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        // Add Elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Saved"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));
        System.out.println(students);


        // Iteration on Arraylist
            // 1. For loop with get(index)
        for (int i = 0; i < students.size() -1; i++) System.out.println(students.get(i));

            // 2. Iterator
                // 2.1 Forward Iteration
        System.out.println("Printing with Iterator Forward...");
            Iterator iter = students.listIterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
            }

                // 2.2 Backwards Iteration
        System.out.println("Printing with Iterator Backwards...");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

            // 3. for each loop
        System.out.println("Printing with for each loop...");
        for (Student student: students) System.out.println(student);;

            // 4. Lambda
        System.out.println("Printing with lambda......");
        students.forEach(student -> System.out.println(student));

        // Sorting Elements in List
        System.out.println("Printing with sorted List by comp...");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        System.out.println("Printing with sorted List by comp...");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
