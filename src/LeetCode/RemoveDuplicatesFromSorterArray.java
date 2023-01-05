package LeetCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSorterArray {
    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}