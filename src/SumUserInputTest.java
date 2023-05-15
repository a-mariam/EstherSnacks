import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumUserInputTest {
   int userinput = 97484994;
    @Test
    public void testSumUserInput(){
        SumUserInput.sumUserInput(userinput);
        assertEquals(SumUserInput.sumUserInput(userinput),SumUserInput.sumUserInput(userinput));
    }

}