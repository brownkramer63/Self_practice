package LeetCode;

import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {

    }
    public static int reverse(int x) {
        if (x==0 ){
            return 0;
        }
       int counter=1;
        if (x<0){
            counter=-1;
        }
        String str = Integer.toString(x);
       char[] arr= str.toCharArray();
       String holder = "";
        Stack<Character> stacker = new Stack<>();
        for (char each:arr
             ) {
            if (each!='0' && each!='-'){
                stacker.push(each);
            }

        }//review this later
        while (!stacker.isEmpty()){
            holder=holder+stacker.pop();

        }
       int answer= Integer.parseInt(holder);
      answer= answer*counter;
      return answer;
    }
}
