public class RemovingWhiteSpace {

    public String removeWhiteSpace(String sentence) {
        return  sentence.replace(" ","");
    }

    public String remove(String sentence){
        StringBuilder newWord = new StringBuilder();
       for (int i = 0; i < sentence.length(); i++){
           if (String.valueOf(sentence.charAt(i)).equals(" ")){
           continue;
           }
           newWord.append(sentence.charAt(i));
       }
       return newWord.toString();
    }
}
