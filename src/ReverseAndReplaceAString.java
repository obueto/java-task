public class ReverseAndReplaceAString {

    public static void main(String[] args) {
        reverseString("torbid8");
        System.out.println();
        replaceChar("torbid8","ta658vobh9");
        }

    public  static String reverseString(String sentence) {
        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));

        }
            return sentence ;

           // return sentence.replace("ta658vobh9 ", "--");
        }
//public static  String replaceString(String sentence){
//
//    String replaceString =  sentence.replaceAll("ta658vobh9","--");
//
//    System.out.print(replaceString);
//
//    return replaceString;
//
//
//
//}

    public static void replaceChar(String sentence, String target){

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (String.valueOf(sentence.charAt(i)).equals(String.valueOf(target.charAt(j)))){

                  sentence=  sentence.replace(String.valueOf(sentence.charAt(i)),"--");

                }
            }
// s   t   r   i   n  g =s --ring
//  0   1  2   3   4   5
//target
        }
        System.out.println(sentence);

    }

}







