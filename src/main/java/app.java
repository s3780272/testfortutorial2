package main.java;

public class app {
    public static void main(String[] args) {
        bubblesort bs = new bubblesort();
        int a[] = {70, 61, 83, 38};
        int b[] = {7, 2, 76, 4, 99};
        bs.bubblesort(a);
        bs.bubblesort(b);
        System.out.println("sorted Array");
        bs.printArray(a);
        bs.printArray(b);
    }
}
