package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args) {

    }
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map1 = new HashMap<>();

        for (String each:strings
             ) {
            map1.put(each,0);
        }
        return map1;
    }
}
