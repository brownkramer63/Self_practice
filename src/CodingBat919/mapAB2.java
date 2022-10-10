package CodingBat919;

import java.util.Map;

public class mapAB2 {
    public static void main(String[] args) {

    }
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (!(map.containsKey("b") || map.containsKey("a"))){
     return map;
        }
        if (map.containsKey("a") && map.containsKey("b")){
if (map.get("a").contains(map.get("b"))){
    map.remove("a");
    map.remove("b");
}}
return map;
    }
}
