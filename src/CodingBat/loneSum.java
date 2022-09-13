package CodingBat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class loneSum {
    public static void main(String[] args) {

    }
    public int loneSum(int a, int b, int c) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        int answer= 0;

        for (Integer each: list
             ) {
            for (Integer each2:list
                 ) {
                if (each2==each){
                    list.remove(each2);
                }
            }
        }
        for (Integer each3:list
             ) {
            answer+=each3;
        }
       return answer;

    }
}
