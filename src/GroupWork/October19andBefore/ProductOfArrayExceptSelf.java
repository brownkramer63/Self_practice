package GroupWork.October19andBefore;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] arr = {10,3,5,6,2};

        System.out.println(Arrays.toString(productExceptSelf(arr,5)));
    }

    //a is the length of the array duh
    public static int[] productExceptSelf(int[] arr, int a){


        int[] left = new int[a];
        int[] right = new int[a];
        int[] answer= new int[a];

        //left most element of array
        left[0]=1;
        //right most element of array
        right[a-1]=1;

        //this will do all of the elements on left side
        for (int i = 1; i <a ; i++) {
            left[i] = arr[i-1]*left[i-1];
        }

        //for the right side need to count down instead of up
        for (int j = a-2; j >=0 ; j--) {
            right[j]=arr[j+1]*right[j+1];
        }

        //this will add both sides up and return the new array
        for (int i = 0; i <a ; i++) {
            answer[i]=left[i]*right[i];
        }
//this is the correct way to do this
        return answer;




    }
}
