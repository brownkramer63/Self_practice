package LeetCodeReview;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target){
        int[] answer = new int[]{0, 0};
        for(int i=0; i<arr.length;i++){
            for(int j=1; j<arr.length; j++){
                if(i!=j && (arr[i]+arr[j])==target){
                    return answer= new int[]{i,j};
                }

            }

        }

        return answer;
        }

    }

