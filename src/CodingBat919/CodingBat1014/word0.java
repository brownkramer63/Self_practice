package CodingBat919.CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args) {

    }
    public Map<String, Integer> word0(String[] strings) {
        //for each loop follwed by if statement checking for strings in array
        //if string is not present make map with value 0; then return map
        HashMap<String,Integer> map1 = new HashMap<>();

        for (String each:strings
             ) {
            if (!map1.containsKey(each)){
                map1.put(each,0);
            }
        }


        return map1;
    }
}
