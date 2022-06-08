import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class IterateArray {

    //Iterate through an arraylist using enhanced for loop
    public static void main(String[] args) {

        ArrayList <String> cohort = new ArrayList();

        cohort.add("one");
        cohort.add("two");
        cohort.add("three");
        cohort.add("four");
        cohort.add("five");
        cohort.add("six");

       for (String s : cohort) {
           System.out.println(s);
             }
    }
}
