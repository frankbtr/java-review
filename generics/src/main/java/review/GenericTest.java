package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 101));
        studentList.add(new Student("Adam", 101));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 201));

        printInfo(studentList);
     //   printInfo(teacherList);

        printInfo2(studentList);  //List<Student>
        printInfo2(teacherList);  //List<Teacher>

        System.out.println(getLastItem(studentList));
        System.out.println(getLastItem(teacherList));


        System.out.println("----------------");

        MyUtils<Student> obj1 = new MyUtils<>();
        MyUtils<Teacher> obj2 = new MyUtils<>();

        System.out.println(obj1.getLastItem(studentList));
       // System.out.println(obj1.getLastItem(teacherList));
        obj1.printInfo2(studentList);

        System.out.println("----------------");
        obj2.printInfo2(teacherList);
        System.out.println(obj2.getLastItem(teacherList));

    }

    // Write a method that takes list of student, prints each student and the total student count.
    public static void printInfo(List<Student> students){

//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            System.out.println(student);
//
//        }

        for (Student student:students){
            System.out.println(student);
        }

        System.out.println(students.size());
    }


    // Write a method that takes a list and prints each item in it and its total count.
    public static  <T> void printInfo2(List<T> list){
        for (T student: list){
            System.out.println(student);
        }

        System.out.println(list.size());
    }


    //Write a method that takes a list and returns the last item of the list.
    public static <T> T getLastItem(List<T> list){
        return list.get(list.size() - 1);
    }
}
