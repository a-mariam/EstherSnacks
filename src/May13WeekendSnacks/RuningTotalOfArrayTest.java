package May13WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RuningTotalOfArrayTest {
    @Test
    public void testTotalOfArray(){
        int [] arra = {2,2,2,2,2,10};
        RuningTotalOfArray.totalOfArray(arra);
        assertEquals(RuningTotalOfArray.totalOfArray(arra),RuningTotalOfArray.totalOfArray(arra));
    }

}