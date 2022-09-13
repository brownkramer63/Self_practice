package CodingBat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class loneSum {
    public static void main(String[] args) {

        System.out.println(loneSum(3,2,3));

    }
    public static int loneSum(int a, int b, int c) {
ArrayList<Integer> list = new ArrayList<>();
list.add(a);
list.add(b);
list.add(c);
int sum =0;

        for (int each: list
             ) {
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)==each){

                }
            }
        }
       sum= list.get(0)+list.get(1)+list.get(2);

        return sum;
    }
}
