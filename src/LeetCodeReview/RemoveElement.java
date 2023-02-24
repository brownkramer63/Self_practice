package LeetCodeReview;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val) {
    ArrayList<Integer> arr = new ArrayList<>();
        for (Integer each:nums
             ) {
            if (!each.equals(val)){
                arr.add(each);
            }
        }
      return arr.size();
    }
}
