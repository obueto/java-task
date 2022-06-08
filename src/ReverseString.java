public class ReverseString {

//    Reverse this string of words “cohort_nine”

    public static void main(String[] args) {

        String name = "cohort_nine";

        for (int i = name.length()-1; i >= 0; i--){
            System.out.print(name.charAt(i));
        }


    }
}
