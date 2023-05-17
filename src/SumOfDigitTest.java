import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitTest {
    int number = 1234;
    @Test
    public void testSumOfFourDigit(){
    SumOfDigit.sumOfFourDigit(number);
    assertEquals(SumOfDigit.sumOfFourDigit(number),SumOfDigit.sumOfFourDigit(number));
    System.out.println(SumOfDigit.sumOfFourDigit(number));
}
}