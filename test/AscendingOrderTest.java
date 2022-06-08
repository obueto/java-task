import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderTest {
    AscendingOrder ascendingOrder;
    @BeforeEach
    void setup(){
         ascendingOrder = new AscendingOrder();
    }
    @Test
    void setAscendingOrderExistTest(){
        assertNotNull(ascendingOrder);
    }

    @Test
    void setAscendingOrderTest(){
        int[] number ={0,2,1,2,1,2,0,1,2,0};
        int numbers = ascendingOrder.findAscendingOrder(number);
        assertEquals(0,numbers);
    }
    @Test
    void setThatTwoDimensionalArrayCanBeSorted(){
        int [][] number = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        //int numbers = ascendingOrder.sort(number);

    }

}