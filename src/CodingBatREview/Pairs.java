package CodingBatREview;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {

    }
    public Map<String, String> pairs(String[] strings) {
        HashMap<String,String> hash1 = new HashMap<>();
        for (String each:strings
             ) {
            hash1.put(each.charAt(0)+"",each.charAt(each.length()-1)+"");
        }
        return hash1;
    }
}
