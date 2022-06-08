import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    void stringIsPalindromeTest(){
        Palindrome palindrome = new Palindrome();
       assertTrue(palindrome.stringPalindrome("madam"));
    }

    @Test
    void intIsPalindromeTest(){
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.checkNumberPalindrome(12321));
    }

}