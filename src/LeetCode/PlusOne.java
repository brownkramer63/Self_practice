package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits={1,2,9};
        int[] digits1={1,2,3};
        System.out.println(Arrays.toString(plusOne(digits1)));
    }
    public static int[] plusOne(int[] digits) {
if (digits.length==1){
    int[] answer={1,0};
    if (digits[0]<9){
        digits[0]=digits[0]+1;
        return digits;
    }else {
        return answer;
    }

}

        if (digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
        }else {
            digits[digits.length-1]=0;
            digits[digits.length-2]=digits[digits.length-2]+1;
        }

return digits;
    }
//    leetcode solution below
//    int n = digits.length;
//    for(int i=n-1; i>=0; i--) {
//        if(digits[i] < 9) {
//            digits[i]++;
//            return digits;
//        }
//
//        digits[i] = 0;
//    }
//
//    int[] newNumber = new int [n+1];
//    newNumber[0] = 1;
//
//    return newNumber;
}
