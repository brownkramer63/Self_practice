package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class jewelsAndStones {
    public static void main(String[] args) {

    }
    public int numJewelsInStones(String J, String S) {
        if (J == null || J.length() == 0) {
            return 0;
        }
        int res = 0;
        Map<Character, Character> map =  new HashMap<>();
        char[] jArr = J.toCharArray();
        for (char c : jArr) {
            map.put(c,c);
        }
        char[] sArr = S.toCharArray();
        for (char c : sArr) {
            if (map.containsKey(c)) {
                res++;
            }
        }
        return res;
    }
}
