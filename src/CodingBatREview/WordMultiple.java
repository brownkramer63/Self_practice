package CodingBatREview;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {

    }
    public Map<String, Boolean> wordMultiple(String[] strings) {

        HashMap<String, Integer> hash1 = new HashMap<>();
        int holder=1;
        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,1);
            }else {
                hash1.put(each,hash1.get(each)+1);
            }
        }
        HashMap<String, Boolean> answer = new HashMap<>();
        for (Map.Entry<String, Integer> ss:hash1.entrySet()
             ) {
            if (ss.getValue()>1){
                answer.put(ss.getKey(),true);
            }else {
                answer.put(ss.getKey(),false);
            }
        }
        return answer;
    }
}
