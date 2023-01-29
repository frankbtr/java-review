public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
   //     as.sort();

        QuickSort qs = new QuickSort();
        BubleSort bs = new BubleSort();

        qs.sort();
        bs.sort();

        MyLambda myLambda = () -> System.out.println("Sorting the array");
        Sorting myLambda2 = () -> System.out.println("Sorting the array");
        myLambda2.sort();

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);
        as.sort(() -> System.out.println("Quick sorting"));

        Sorting bubleSort = () -> System.out.println("Buble sorting");
        as.sort(bubleSort);
        as.sort(() -> System.out.println("Buble sorting"));
    }

    private void sort(Sorting sorting){
        sorting.sort();
    }


    @FunctionalInterface
    interface MyLambda{
        void print();
    }
}
