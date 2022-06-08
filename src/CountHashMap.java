import java.util.HashMap;

public class CountHashMap {
//    Write a Java Program to count the number of words in a string using HashMap

    public static void main(String[] args) {


        HashMap<String, Integer> myMap = new HashMap<>();
        String anthem = "Go placidly amidst the noise and the haste and remember what peace there may be in silence";

        int counter = 0;


        String[] pairs = anthem.split(" ");
        for (int i=0; i<pairs.length;i++) {
            String pair = pairs[i];
            int value = counter;
            counter++;


            myMap.put(pair, value);
           // System.out.println(myMap.get(value));

        }
        System.out.print(counter);

    }
}
