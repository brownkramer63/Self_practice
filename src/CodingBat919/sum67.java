package CodingBat919;

public class sum67 {
    public static void main(String[] args) {

    }

    public static int sum67(int[] nums) {
//first i need a loop i think a for i loop and a while loop nested
int answer=0;


        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]!=6){
                answer+=nums[i];
            }
            if (nums[i]==6){
                continue;
            }
        }

        for (int i = nums.length-1; i >0 ; i--) {
            if (nums[i]!=7){
                answer+=nums[i];
            }
            if (nums[i]==7){
                continue;
            }
        }

        return answer;
    }
}
