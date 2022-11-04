package CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public static void main(String[] args) {

    }
    public Map<String, Integer> wordLen(String[] strings) {

        HashMap<String,Integer>map2 = new HashMap<>();

        for (String each:strings
             ) {
         if (!map2.containsKey(each)){
             map2.put(each,each.length());
         }
        }

    return map2;
    }

}
