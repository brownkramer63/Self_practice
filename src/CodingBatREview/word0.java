package CodingBatREview;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args) {

    }
    public Map<String, Integer> word0(String[] strings) {
         HashMap<String,Integer> hashmap1= new HashMap<>();

        for(int i=0; i<strings.length; i++){
            if(!hashmap1.containsKey(strings[i])){
                hashmap1.put(strings[i],0);
            }

        }
        return hashmap1;

    }
}
