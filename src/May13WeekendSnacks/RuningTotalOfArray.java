package May13WeekendSnacks;

public class RuningTotalOfArray {
public static int totalOfArray(int [] array) {

    int total = 0;
    for (int count = 0; count <= array.length - 1; count++) {
        total += array[count];
    }

    System.out.println("Total of Runing Array is: " + total);
    return total;
}
    public static void main(String[] args) {
    int [] arra = {1,2,2,9};
        totalOfArray(arra);
    }
}
