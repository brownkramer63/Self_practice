package GroupWork.November1116;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="())";
        System.out.println(validParentheseswrong(s));

    }


    public static int validParentheseswrong(String s){
        int count = 0;
        char[] chars=s.toCharArray();
        if (chars.length<2){
            return 0;
        }
        if (chars.length==2 && chars[0]=='(' && chars[1]==')' ){
            return 2;
        }
        if (chars.length==2 && chars[0]!='('){
            return 0;
        }
        for (int i = 1; i < chars.length ; i++) {
            if (chars[i]==')' &&chars[i-1]=='('){
                count=count+2;
            }
            if (chars[i]=='(' && chars[i+1]==')'){
                count=count+2;
            }

        }
       return count/2;

    }
    public static int longestValidParentheses(String s){
        if(s==null){
            return 0;
        }
        Stack<Integer> stack = new Stack();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }
}
