package CodingBat919;

public class has22 {
    public static void main(String[] args) {

    }
    public boolean has22(int[] nums) {
        if(nums.length-1<1){
            return false;
        }
        if (nums[0]==2 && nums[1]==2){
            return true;
        }
        for (int i = 1; i <nums.length-1 ; i++) {

            if (nums[i]==2 && nums[i+1]==2){
                return true;
            }
            if (nums[i]==2 && nums[i-1]==2){
                return true;
            }
        }
        return false;
    }
}
