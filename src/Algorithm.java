import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Algorithm {


    public int findOverLappingElements(int[] firstIntSet, int[] secondIntSet) {
        int total = 0;

        for (int i = 0; i < firstIntSet.length; i++) {
            for (int j = 0; j < secondIntSet.length; j++) {

                if (firstIntSet[i] == secondIntSet[j]){
                     total += firstIntSet[i] + secondIntSet[j];

                }

            }

        }
       return  total;
    }


   public int findOverLappingElementWithHashMap(int [] firstIntSet, int [] secondIntSet){
       HashMap<Integer, Integer> myElement = new HashMap<>();
      int [] number= {12,13,6,10};
      int [] number1 = {13,10,16,15};
      int counter = 0;
      return 0;
    }

    public int findDistinctElements(int[] firstSet, int[] secondSet) {
        int total = 0 ;
        Set<Integer> distinct = new HashSet<>();

        for (int i = 0; i < firstSet.length; i++) {
            int count = 0;
            for (int j = 0; j < secondSet.length; j++) {


                if (firstSet[i] != secondSet[j]){
                    count++;
                }
          }
            if (count == secondSet.length){
                distinct.add(firstSet[i]);
            }

        }

    for(int i = 0; i < secondSet.length; i++) {
        int count = 0;
        for (int j = 0; j < firstSet.length; j++) {


            if (secondSet[i] != firstSet[j]){
                count++;
            }
        }
        if (count == firstSet.length){
            distinct.add(secondSet[i]);
        }

    }
        for (int numbers:distinct) {
            total += numbers;
        }
        return total;

}
}



