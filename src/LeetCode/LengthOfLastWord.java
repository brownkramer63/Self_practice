package LeetCode;

import java.util.Stack;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        Stack<String> stack1 = new Stack<>();
        int count = 0;
        int answer = 0;
        int loop = s.length() - 1;

        while (count != 1) {
            if ((!(s.charAt(loop) + "").equals(" ")) && (s.charAt(loop - 1) + "").equals(" ")) {
                count++;
                break;
            }

            if (!(s.charAt(loop) + "").equals(" ")) {
                stack1.push(s.charAt(loop) + "");
            }
        loop--;
        }
        while (!stack1.isEmpty()) {
            stack1.pop();
            answer++;

        }
        return answer+1;
    }

}
