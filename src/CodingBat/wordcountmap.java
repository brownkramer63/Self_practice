package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordcountmap {
    public static void main(String[] args) {

    }
    public Map<String, Integer> wordCount(String[] strings) {
Map<String, Integer> map1 = new HashMap<>();
int count = 0;

        for (String each :strings
             ) {
            for (String each2:strings
                 ) {
                if (each.equals(each2)){
                    count++;
                }
            }
            map1.put(each,count);
            count=0;
        }
return map1;
    }
}
