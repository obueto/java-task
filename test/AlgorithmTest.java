import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    Algorithm algorithm;

    @BeforeEach
    void setup(){
        algorithm= new Algorithm();
    }

    @Test
    void setAlgorithmCanTest(){
        assertNotNull(algorithm);
    }

    @Test
    void setAlgorithmCanCheckTwoSetOfOverlappingElements(){
        int [] firstIntSet = {12,13,6,10};
        int [] secondIntSet = {13,10,16,15};
        int numbers = algorithm.findOverLappingElements(firstIntSet,secondIntSet);
        assertEquals(46,numbers);
    }

    @Test
    void setAlgorithmCanCheckForDistinctElements(){
        int [] firstSet = {3,1,7,9};
        int [] secondSet = {2,4,1,9,3};
        int number = algorithm.findDistinctElements(firstSet,secondSet);
        assertEquals(13,number);
    }

}