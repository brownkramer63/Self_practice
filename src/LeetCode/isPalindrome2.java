package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class isPalindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1121));
    }
    public static boolean isPalindrome(int x) {
        // Base condition
        if (x < 0) {
            return false;
        }
        // Store the number in a variable
        int number = x;
        // This will store the reverse of the number
        String str = Integer.toString(x);
        char[] array1 = str.toCharArray();
        ArrayList<Character> char1 = new ArrayList<>();
        Stack<Character> stack1 = new Stack<>();
        for (Character each:array1
             ) {
            char1.add(each);
            stack1.add(each);
        }
        //iterate each as see if they equal each other
        for (int i = 0; i < array1.length ; i++) {
            if (!(char1.get(i)==stack1.pop())){
                return false;
            }
        }
        return true;
    }
}
