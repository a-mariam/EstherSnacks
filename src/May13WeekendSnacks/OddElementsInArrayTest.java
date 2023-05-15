package May13WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddElementsInArrayTest {
    int [] sample = {2,5,8,9,11,15,7};
  @Test
  public void testOddElementsInAnArray(){
      OddElementsInArray.OddNumberInAnArray(sample);
      assertEquals(OddElementsInArray.OddNumberInAnArray(sample),OddElementsInArray.OddNumberInAnArray(sample));
  }

}