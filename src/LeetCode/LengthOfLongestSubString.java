package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public static void main(String[] args) {

    }
    public static int LengthOfLSS(String str){
        int holder = str.length();
        int answer=0;
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0, j=0; i <holder ; j++) {
            if (map1.containsKey(str.charAt(j))){
                i=Math.max(map1.get(str.charAt(j)),i);
            }
            answer=Math.max(answer,j-i+1);
            map1.put(str.charAt(j),j+1);
        }
        return answer;
    }

    public static int LLS(String str){

        return 0;
    }
}
