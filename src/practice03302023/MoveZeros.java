package practice03302023;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]!=0){
                arr.add(nums[i] );
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            if (i<arr.size()){
                nums[i]=arr.get(i);
            }else {
                nums[i]=0;
            }
        }
    }
}
