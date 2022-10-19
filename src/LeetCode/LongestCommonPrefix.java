package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs ={"kramer","krape","krum","kramers"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        int size= strs.length;
        if (size==0){
            return "";
        }
        if (size==1){
            return strs[0];
        }
        //sort in ascending order
        Arrays.sort(strs);
        //takes in begining and end of array and returns the smallest of the two
        //this will show us the min length they will all have in common
        int end = Math.min(strs[0].length(),strs[size-1].length());

        //we will use a while loop for the next part
        int amount=0;
        while (amount<end && strs[0].charAt(amount)==strs[size-1].charAt(amount)){
            amount++;
        }
        //finds the length of the longest shared value in all of the strings
        //if we have a string that doesnt match like crabs in my example it will return ""
        String answer=strs[0].substring(0,amount);
        return answer;



    }
}
