package May13WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversingArrayTest {
@Test
    public  void testReversedArray(){
    int [] sammple = {32,45,6,7,6};
    ReversingArray.reversedArray(sammple);
    assertEquals( ReversingArray.reversedArray(sammple),ReversingArray.reversedArray(sammple));
}
}