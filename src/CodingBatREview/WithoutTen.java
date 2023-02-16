package CodingBatREview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
int[] nums={1,10,10,2};
        System.out.println(Arrays.toString(withoutTen(nums)));
    }
    public static int[] withoutTen(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (Integer each:nums
             ) {
            if (each!=10){
                arr.add(each);
            }
        }
        int[] arr1= new int[nums.length];
        for (int i = 0; i < arr1.length ; i++) {
           if (i<arr.size()){
               arr1[i]=arr.get(i);
           }else {
               arr1[i]=0;
           }
        }
        return arr1;
    }
}
