package LeetCodeReview;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] arr, int target){
        int[] answer = new int[]{0, 0};
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]!=arr[j] && (arr[i]+arr[j])==target){
                    return answer= new int[]{i,j};
                }

            }

        }

        return answer;
        }

    }

