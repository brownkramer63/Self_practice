package practice03302023;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
    int[] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        int answer=0;
        for (Integer each:nums
             ) {
            if (each!=val){
                arr.add(each);
            }else{
                answer++;
            }
        }
        for (int i = 0; i <arr.size() ; i++) {
            nums[i]=arr.get(i);
        }
        return nums.length-answer;//
    }
}
