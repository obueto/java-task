
public class Palindrome {


    public boolean stringPalindrome(String userInput) {
        StringBuilder builder = new StringBuilder(userInput);

        if (userInput.equals(builder.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkNumberPalindrome(int userInput) {
        int firstDigit = (userInput / 10000);
        int secondDigit = (userInput % 10000) / 1000;
        int thirdDigit = (userInput % 1000) / 100;
        int fourthDigit = (userInput % 100) / 10;
        int lastDigit = (userInput % 10);

        if ((firstDigit == lastDigit) && (secondDigit == fourthDigit)){
                return true;
            } else {
            return false;
        }
    }
}