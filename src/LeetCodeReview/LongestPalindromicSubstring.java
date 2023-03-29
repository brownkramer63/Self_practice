package LeetCodeReview;

import java.util.ArrayList;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

    }
    public static int longestPalindrome(String s) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    arr.add(s.substring(i,j));

                }
            }
        }
        //added all potential palin to ararylist
        ArrayList<String> backward= new ArrayList<>();
        String answer="";
        String holder="";
        for (String each:arr
             ) {
            for (int i = each.length(); i >0 ; i--) {
                holder=holder+each.charAt(i);
            }
            if (holder.equals(each)){
                backward.add(holder);
            }
        }
        for (String each:backward
             ) {
            if (each.length()>answer.length()){
                answer=each;
            }
        }
        return answer.length();
    }
}
