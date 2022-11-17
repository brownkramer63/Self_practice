package CodingBat1014;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class loneSum {
    public static void main(String[] args) {

    }
    public static int loneSum(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a,b,c};
        List<Integer> listss = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!listss.contains(arr[i])){
                listss.add(arr[i]);
            }
            if (listss.contains(arr[i])){
                listss.remove(arr[i]);
            }
        }
        for (int each:listss
             ) {
          answer= answer+each;
        }
        return answer;
    }

}
