public class Duplicate {

    public boolean isDuplicate(String word) {

         int count = 1;

            char[] character = word.toCharArray();
        for (int i = 0; i < word.length(); i++){
            for (int j = i + 1; j < word.length(); j++){
                if (character[i] == character[j]){
                    count++;
                }
            }
        }
       if (count > 1)
           return true;
       else
           return  false;
    }
}
//B O O K
//0 1 2 3
