package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {

    }
    public Map<String, String> pairs(String[] strings) {
Map<String, String> map1 = new HashMap<>();

        for (String each:strings
             ) {
            map1.put(each.substring(0,1),each.substring(each.length()-1));
        }
        return map1;
    }
}
