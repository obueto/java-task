public class Fibonaci {
    public static void main(String[] args) {

        fibonacci(5);
    }



   public static void fibonacci(int fibonacci)
    {
        int number = 0;
        int secondNumber = 1;

        int counter = 0;

        while (counter < fibonacci) {

            System.out.print(number + " ");


            int temp = secondNumber + number;
            number = secondNumber;
            secondNumber = temp;
            counter = counter + 1;
        }
    }
}
