import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighestNumber{
    public int findSecondHighestNumber(int[] number) {
        Arrays.sort(number);
        return number[number.length - 2];
    }

    //Write a Java Program to find the second-highest number in an array.

}
