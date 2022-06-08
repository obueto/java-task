

public class PrimeNumber {




   public boolean isPrimeNumber(int number) {
        boolean isPrime = false;
       int count = 0;
       for (int i = 1; i <= number; i ++){
           if (number < 2){
               return false;
           }
           else if (number % i == 0){
               count++;
           }
       }

        return count == 2;
    }





}

