import java.util.Arrays;

public class AscendingOrder {

    public int findAscendingOrder(int [] number){
        Arrays.sort(number);
        return number[0];
    }

    public static void sort(int[][] m){

        Arrays.sort(m);

    }
}
