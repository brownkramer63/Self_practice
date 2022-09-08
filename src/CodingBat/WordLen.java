package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {

    }
    public Map<String, Integer> wordLen(String[] strings) {
Map<String, Integer> map1 = new HashMap<>();

        for (String each:strings
             ) {
            map1.put(each,each.length());
        }
        return map1;
    }
}
