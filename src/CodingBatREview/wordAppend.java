package CodingBatREview;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args) {
 String[] words= {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend(words));
    }
    public static String wordAppend(String[] strings) {
        String result="";
        Map<String, Integer> map=new HashMap<String, Integer>();

        for (String currentString:strings) {
            int i=0;
            if (map.containsKey(currentString)) {
                i=map.get(currentString)+1;
                map.put(currentString, i);
                if (i%2==0) {
                    result=result+currentString;
                }
            } else {
                map.put(currentString, i+1);
            }

        }

        return result;
}}
