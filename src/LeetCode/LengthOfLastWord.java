package LeetCode;

import java.util.Stack;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("  day"));
    }

    public static int lengthOfLastWord(String s) {
        Stack<String> stack1 = new Stack<>();
        int count = 0;
        int answer = 0;

        String x = s.trim();
        if (x.length()==1){
            return 1;
        }

        for (int i = x.length()-1; i >=0 ; i--) {
            if (!(x.charAt(i)+"").equals(" ")){
                stack1.push(x.charAt(i)+"");
            }
            if ((x.charAt(i)+"").equals(" ")){
                break;
            }
        }
        //study this for interviews
while (!stack1.isEmpty()){
    stack1.pop();
    answer++;
}
return answer;
    }

}
