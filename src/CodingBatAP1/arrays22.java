package CodingBatAP1;

import java.util.Arrays;

public class arrays22 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
    public static int[] reverse3(int[] nums) {
        int count=0;
       int[] arr= new int[nums.length];
        for (int i = nums.length-1; i > -1 ; i--) { //2

            arr[count]=nums[i];
            count++;
        }
        return arr;
    }

}
