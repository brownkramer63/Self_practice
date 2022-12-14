package GroupWork.December121422;

import java.util.Arrays;

public class UpdateElements {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(updateTheElements(arr)));
    }
    public static int[] updateTheElements(int[] arr){
        if (arr.length<2){
            return arr;
        }
        int[] answer= new int[arr.length];
        answer[0]=arr[0]*arr[1];
        for (int i = 1; i <arr.length-1 ; i++) {
           answer[i]=arr[i-1]*arr[i+1];
        }
        answer[arr.length-1]=arr[arr.length-2]*arr[arr.length-1];
        return answer;
    }
}
