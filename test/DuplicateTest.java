import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateTest {
    Duplicate duplicate;
    @BeforeEach
    void setUp() {
        duplicate = new Duplicate();
    }

    @Test void duplicateExistTest(){
        assertNotNull(duplicate);
    }

    @Test void checkDuplicateTest(){
        String word = "pen";
        boolean isDuplicate = duplicate.isDuplicate(word);
        assertFalse(isDuplicate);

    }

    @Test void checkAnotherDuplicateTest(){
        String word = "Pineapple";
        assertTrue(duplicate.isDuplicate(word));
    }
}