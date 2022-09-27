package CodingBat919;

import java.util.ArrayList;
import java.util.Arrays;

public class centeredAverage {
    public static void main(String[] args) {

        int[] nums = {1, 1, 5, 5, 10, 8, 7};

        System.out.println(centeredAverage(nums));

    }
    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> sorter = new ArrayList<>();
        for (int i = 1; i < nums.length-1 ; i++) {
            sorter.add(nums[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int each: sorter
             ) {
         if (each!= sorter.get(0) || each!=sorter.get(sorter.size()-1)){
             ans.add(each);
            }else{
             if (each==sorter.get(0) && !ans.contains(each)){
                 ans.add(each);
                 if (each==sorter.get(sorter.size()-1) && !ans.contains(each)){
                     ans.add(each);
                 }
             }

         }
        }
int answer= 0;
        for (int each2 :ans
                ) {
            answer+=each2;
        }
answer=answer/ans.size();
        return answer;
    }
}
