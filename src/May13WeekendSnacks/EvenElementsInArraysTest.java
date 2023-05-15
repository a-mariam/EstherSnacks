package May13WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EvenElementsInArraysTest {
    @Test
    public void testEvenElementsInArrays(){

    int sample2[] = {22,32,44,1,4,5,7,99,9};
    EvenElementsInArrays.evenNumbersInArrays(sample2);
    assertEquals(EvenElementsInArrays.evenNumbersInArrays(sample2),EvenElementsInArrays.evenNumbersInArrays(sample2));
    }
}