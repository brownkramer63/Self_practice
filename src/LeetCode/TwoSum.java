package LeetCode;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[]twosum(int[] arr,int target){
int[] answer={0,0};
        for (int each:arr
             ) {
            for (int each2:arr
                 ) {
                if (each+each2==target){
                   answer[0]=each;
                   answer[1]=each2;
                }
            }
        }
        return answer;
    }
}
