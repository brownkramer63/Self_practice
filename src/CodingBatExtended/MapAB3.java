package CodingBatExtended;

import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if((!map.containsKey("b")) && (!map.containsKey("a"))){
            return map;
        }
        if(!map.containsKey("b")){
            map.put("b",map.get("a"));
        }
        if(!map.containsKey("a")){
            map.put("a",map.get("b"));
        }
        return map;
    }
}
