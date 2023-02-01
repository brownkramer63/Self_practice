package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(twosum(nums,9)));

    }
    public static int[]twosum(int[] arr,int target){

        HashMap<Integer,Integer> map1 = new HashMap<>();
        int counter= 0;
        for (int i = 0; i <arr.length ; i++) {
            counter= target-arr[i];
            if (map1.containsKey(counter)){
                return new int[]{i,map1.get(counter)};
            }
            map1.put(arr[i],i);

        }
        return new int[]{0,0};
    }
}
