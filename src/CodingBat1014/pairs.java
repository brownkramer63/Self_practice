package CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args) {

    }
    public Map<String, String> pairs(String[] strings) {
        HashMap<String,String>map3 = new HashMap<>();
        for (String each:strings
             ) {
            if (!(map3.containsKey(each.substring(0,1)) && (map3.get(each.substring(0,1))==each.substring(each.length()-1))));
            {
                map3.put(each.substring(0,1),each.substring(each.length()-1));
            }

        }
        return map3;
    }
}
