package CodingWars;

import java.util.HashSet;
import java.util.Set;

public class OddNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,12};

    }
    public static int findit(int[] a){

        int count = 0;
        int answer=0;
        for (int each: a
             ) {
            for (int each2:a
                 ) {
               if (each==each2){
                   count++;
               }
            }
        if (count%2==1){
            answer=each;
        }
        }


return answer;
    }


}
