package CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {

    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {
Map<String,Boolean> map1 = new HashMap<>();

        for (String each:strings
             ) {
            if (!map1.containsKey(each)){
                map1.put(each,false);
            }else {
                map1.put(each,true);
            }
        }

        return map1;
    }

}
