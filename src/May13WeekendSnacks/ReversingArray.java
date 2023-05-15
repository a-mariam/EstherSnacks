package May13WeekendSnacks;

import java.util.Arrays;
import java.util.Collections;

public class ReversingArray {
    public  static int [] reversedArray(int [] sampleArray){
        int [] sample2 = new int[sampleArray.length];
    String string = "";
        for (int count = sampleArray.length - 1; count >= 0; count--){
           string += sampleArray[count];
        }
        for (int count = 0; count < sample2.length; count++){
            sample2[count] = Integer.parseInt(String.valueOf(string.charAt(count)));
        }
        System.out.println(Arrays.toString(sample2));
       return sample2;
    }

    public static void main(String[] args) {
        int [] sammple = {32,45,6,7,6};
        int test [] = {1,2,3,4,5};
        reversedArray(sammple);
    }
}
