public class ReverseAString2 {

    public static void main(String[] args) {

        String cohort = "nine";
        for (int i = cohort.length()-1; i >= 0; i--){
            System.out.print(cohort.charAt(i));
        }

    }
}
