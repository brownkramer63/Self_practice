package CodingBatAP1;

public class codingbatpractice {
    public static void main(String[] args) {

    }
    public int maxSpan(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2 && nums[0]!=nums[1]){
            return 1;
        }
        if(nums[0]==nums[nums.length-1]){
            return nums.length;
        }
        return nums.length-1;
    }

}
