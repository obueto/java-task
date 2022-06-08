import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondHighestNumberTest {
    SecondHighestNumber secondHighestNumber;
    @BeforeEach
    void setUp() {
        secondHighestNumber = new SecondHighestNumber();
    }

    @Test void setSecondHighestNumberExistTest(){
        assertNotNull(secondHighestNumber);
    }

    @Test void setSecondHighestNumberTest(){
        int[] number = {1,2,4,5,6,7,8};
        int numbers  = secondHighestNumber.findSecondHighestNumber(number);
        assertEquals(7,numbers);
    }
}