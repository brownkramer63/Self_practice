package CodingWars;

import java.util.ArrayList;

public class LongestConsec {
    public static void main(String[] args) {

        String[] strarr= {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};

        System.out.println(longestConsec(strarr,2));
    }


        public static String longestConsec(String[] strarr, int k) {
            if (strarr.length == 0 || k > strarr.length || k <= 0)
                return "";

            String longestStr = "";
            for (int index = 0; index < strarr.length - k + 1; index++) {
                StringBuilder sb = new StringBuilder();
                for (int i = index; i < index + k; i++) {
                    sb.append(strarr[i]);
                }
                if (sb.toString().length() > longestStr.length()) {
                    longestStr = sb.toString();
                }
            }
            return longestStr;
        }
}
