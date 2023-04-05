package practice03302023;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if ((arr[i]+arr[j])==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,1};
    }
}
