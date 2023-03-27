package CodingBatExtended;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args) {

    }
    public Map<String, Integer> word0(String[] strings) {
        HashMap<String,Integer> hash1 = new HashMap<>();

        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,each.length());
            }
        }
        return hash1;
    }

}
