import java.util.HashMap;

public class DuplicateCharacters {
    //Write a Java Program to find the duplicate characters in a string.
    public static void main(String[] args) {

        findDuplicate("semicolon");

    }
        static int findDuplicate(String name){

        int duplicate = -1;

        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    duplicate = i;
                    break;
                }
            }
            if (duplicate != -1)
                break;
        }

        return duplicate;
    }

        }

