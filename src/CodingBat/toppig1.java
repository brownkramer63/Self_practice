package CodingBat;

import java.util.Map;

public class toppig1 {
    public static void main(String[] args) {

    }
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }

        map.put("bread","butter");
        return map;
    }

}
