import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    @Test
    public void checkIfPrimeNumberTest(){
        PrimeNumber primeNumber = new PrimeNumber();
        assertTrue(primeNumber.isPrimeNumber(23));
    }

    @Test
    public void checkPrimeNumberTest(){
        PrimeNumber primeNumber = new PrimeNumber();
        assertFalse(primeNumber.isPrimeNumber(4));
    }
}
