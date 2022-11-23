package LeetCode;

import java.util.Stack;

public class PalindromNumber {
    public static void main(String[] args) {

        isPalindrome(987654321);
    }
    public static boolean isPalindrome(int x) {
        boolean negative = false;
if (x<0){
    negative=true;
   x= x*(-1);
}
      String str=Integer.toString(x);
      char[] arr = str.toCharArray();
      String holder ="";
        Stack<Character>stack1 = new Stack<>();

        for (Character each:arr
             ) {
            stack1.push(each);
        }
while (!stack1.isEmpty()){
    holder=holder+stack1.pop();
}
int answer = Integer.parseInt(holder);
if (negative==true){
    answer=answer*(-1);
}

if (answer==x){
    return true;
}
return false;

    }
}
