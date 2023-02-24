package LeetCodeReview;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeNumber {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int x) {
    String s= Integer.toString(x);
    char[] arr = s.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        ArrayList<Character> arrlist = new ArrayList<>();
        for (Character each:arr
             ) {
            stack1.push(each);
            arrlist.add(each);
        }
        for (int i = 0; i <arrlist.size() ; i++) {
            if (!arrlist.get(i).equals(stack1.pop())){
                return false;
            }
        }
        return true;
    }
}
