import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] number = new int[3][3][3];

        int num = 10;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                for (int k = 0; k < number[i][j].length; k++) {
                   number[i][j][k] += num;
                   num ++;

//                    System.out.print(number[i][k]);
                    System.out.print(number[i][j][k] + " ");
                }

            }
            System.out.println();

        }
//        System.out.println(Arrays.deepToString(number));
    }
    }
