package CodingBatAP1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class time {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(matchingStrings(List.of(new String[]{ "aba", "baba","aba","xzxb"}), List.of(new String[]{ "aba", "xzxb","ab"})));
    }
    public static String timeConversion(String s) {
        // Write your code here
        String a=s.substring(s.length()-2);
        if (s.substring(s.length() - 2).equals( "AM")) {
            if (s.substring(0, 2).equals( "12")) {
                return "00" + s.substring(2, s.length() - 2);
            } else {
                return s.substring(0, s.length() - 2);
            }
        }
        if (s.substring(s.length() - 2).equals("PM")) {
            if (s.substring(0, 2).equals("12")) {
                return "12" + s.substring(2, s.length() - 2);
            } else {
                String ss = s.substring(0, 2);
                int sss = Integer.parseInt(ss);
                sss = 12 + sss;
                String answer = Integer.toString(sss);
                return answer + s.substring(2, s.length() - 2);
            }
        }

        return s;
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        HashMap<String, Integer> hashmap1= new HashMap<>();
        for (String each : strings) {
            if(!hashmap1.containsKey(each)){
                hashmap1.put(each, 1);
            }else {
                hashmap1.put(each,hashmap1.get(each)+1);
            }
        }
        ArrayList<Integer> answer= new ArrayList<>();
        for (String each1:queries
             ) {
            if (hashmap1.containsKey(each1)){
                answer.add(hashmap1.get(each1));
            }else {
                answer.add(0);
            }
        }
        return answer;
    }
}
