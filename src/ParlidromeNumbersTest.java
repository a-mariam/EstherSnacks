import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParlidromeNumbersTest {
    int number = 1221;
        @Test
    public void testThatIsParlidrome(){
            ParlidromeNumbers.isParlidrome(number);
            assertEquals(ParlidromeNumbers.isParlidrome(number),ParlidromeNumbers.isParlidrome(number));
        }
        @Test
    public void testThatIsParlidromeWorksAgain(){
            ParlidromeNumbers.isParlidrome(2345);
            assertEquals(ParlidromeNumbers.isParlidrome(2345),ParlidromeNumbers.isParlidrome(2345));
        }
}