import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingWhiteSpaceTest {

    RemovingWhiteSpace space;
    @BeforeEach
    void setUp() {
        space = new RemovingWhiteSpace();
    }

    @Test void whiteSpaceExistTest(){
        assertNotNull(space);
    }

    @Test void spaceCanBeRemovedTest(){
        String sentence = "My name is Judith";
        String newSentence = space.removeWhiteSpace(sentence);
        assertEquals("MynameisJudith",newSentence);
    }

    @Test void spaceCanBeRemovedWithoutReplaceTest(){
        String sentence = "My name is Judith";
        String newSentence = space.remove(sentence);
        assertEquals("MynameisJudith",newSentence);
    }
}