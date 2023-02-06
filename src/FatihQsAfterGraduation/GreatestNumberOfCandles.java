package FatihQsAfterGraduation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GreatestNumberOfCandles {
    public static void main(String[] args) {
        int[] arr={4,2,1,1,2};
        int extras=1;

        System.out.println(Arrays.toString(greatestCandies(arr,extras)));
        //extra stuff below
        System.out.println("-----------------------");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(new int[5]));
        ArrayList<String> list = new ArrayList(Arrays.asList("Ryan", "Julie", "Bob","d","d"));
        int example=list.size();
        System.out.println(example);
    }
    public static boolean[] greatestCandies(int[] arr, int extras){
        boolean[] answer = new boolean[arr.length];
        int greatest=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>greatest){
                greatest=arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
         if (arr[i]+extras>=greatest){
             answer[i]=true;
         }else {
             answer[i]=false;
         }

        }

return answer;
    }
}
