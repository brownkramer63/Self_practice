package LeetCode;

import java.util.Stack;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        Stack<String> stack1 = new Stack<>();
        int count = 0;
        int answer=0;

        for (int i = s.length(); i <s.length() ; i--) {
            if (s.charAt(i)+""==" " && count==1){
                break;
            }

            if (s.charAt(i)+""!=" " && s.charAt(i-1)+""!=" "){
              stack1.push  (s.charAt(i)+"");
            }
            if (s.charAt(i)+""!=" " && s.charAt(i-1)+""==" "){
                stack1.push  (s.charAt(i)+"");
                count++;
            }
        }
       while (!stack1.isEmpty()){
           stack1.pop();
           answer++;
       }
return answer;
    }
}
