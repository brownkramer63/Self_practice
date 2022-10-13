package CodingBat919;

public class sum13 {
    public static void main(String[] args) {
int[] nums = {1, 2, 2, 1, 13};

    }
    public int sum13(int[] nums) {
        int sum=0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=13){
                sum+=nums[i];
            }
            if (nums[i]==13){
                i++;
            }
        }
        return sum;
    }

}
