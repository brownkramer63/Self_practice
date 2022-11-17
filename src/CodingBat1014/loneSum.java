package CodingBat1014;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class loneSum {
    public static void main(String[] args) {

        System.out.println(loneSum(3,2,3));
    }
    public static int loneSum(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a,b,c};
        List<Integer>listss = new ArrayList<>();
      Arrays.sort(arr);

        if (arr[0]!=arr[1] && arr[0]!=arr[2]){
            listss.add(arr[0]);
        }
        if (arr[1]!=arr[0] && arr[1]!=arr[2]){
            listss.add(arr[1]);
        }
        if (arr[2]!=arr[0] && arr[2]!=arr[1]){
            listss.add(arr[2]);
        }
        for (int each:listss
             ) {
            answer=answer+each;
        }
return answer;
    }

}
