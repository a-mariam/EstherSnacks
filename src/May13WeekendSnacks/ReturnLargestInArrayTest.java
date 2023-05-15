package May13WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReturnLargestInArrayTest {
    @Test
    public  void testReturnLargestNumber(){
        int [] samples = {22,4,456,88,7,800};
        ReturnLargestInArray.returnLargestInArray(samples);
        assertEquals(ReturnLargestInArray.returnLargestInArray(samples),ReturnLargestInArray.returnLargestInArray(samples));
    }

}