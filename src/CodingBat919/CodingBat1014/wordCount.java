package CodingBat919.CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {

    }
    public Map<String, Integer> wordCount(String[] strings) {
        HashMap<String,Integer> map4 = new HashMap<>();
        int count =0;
        for (String each:strings
             ) {
            for (int i = 0; i <strings.length ; i++) {
                if (strings[i]==each){
                    count++;
                }
                if (i==strings.length-1){
                   map4.put(each,count);
                   count=0;

                }

//review later
            }

        }
        return map4;
    }

}
