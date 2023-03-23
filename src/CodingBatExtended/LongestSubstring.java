package CodingBatExtended;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {

        int answer=0;
        String holder="";
        if (s.length()==1){
            return 1;
        }
        for (int i = 0; i <s.length() ; i++) {


            if (!holder.contains(s.charAt(i)+"")){
                holder=holder+s.charAt(i);
            }else {
                if (holder.length()>answer){
                    answer=holder.length();
                   holder=s.charAt(i)+"";
                }
            }
        }
        if (holder.length()>answer){
            return holder.length();
        }

    return answer;
    }
}
