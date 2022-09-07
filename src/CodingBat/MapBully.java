package CodingBat;

import java.util.Map;

public class MapBully {
    public static void main(String[] args) {

    }
    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }
}
