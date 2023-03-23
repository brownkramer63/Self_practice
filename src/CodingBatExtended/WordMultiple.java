package CodingBatExtended;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {

    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        HashMap<String,Integer> hash1 = new HashMap<>();
        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,1);
            }else {
                hash1.put(each,hash1.get(each)+1);
            }
        }
        HashMap<String,Boolean> ansswer= new HashMap<>();
        for (Map.Entry<String,Integer> set : hash1.entrySet()
             ) {
            if (set.getValue()>1){
                ansswer.put(set.getKey(),true);
            }else {
                ansswer.put(set.getKey(),false);
            }
        }
        return ansswer;
    }
}
