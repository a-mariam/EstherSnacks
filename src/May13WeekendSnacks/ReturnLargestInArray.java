package May13WeekendSnacks;

import java.util.Arrays;

public class ReturnLargestInArray {
    public static void main(String[] args) {
        int [] sample = {2,34,22,88,0,8,7};
        returnLargestInArray(sample);
    }
    public static int returnLargestInArray(int [] array){
        Arrays.sort(array);
        return array[array.length -1];
    }
}
