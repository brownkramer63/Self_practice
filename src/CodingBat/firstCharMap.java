package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class firstCharMap {
    public static void main(String[] args) {
        String[] arr1 ={"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println(firstChar(arr1));
    }
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map1 = new HashMap<>();
        int count = 0;
        String special="";

        for (String each:strings
             ) {
            for (String each2:strings
                 ) {
                if (each.substring(0,1).equals(each2.substring(0,1)) && each!=each2 && (!map1.containsKey(each.substring(0,1)))){
                    map1.put(each.substring(0,1),each+each2);

                }
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count>1){
                for (int i = 0; i <count ; i++) {
                    special+=each;
                    map1.put(each.substring(0,1),special);
                }
            }
count=0;
            special="";
        }
        for (String end:strings
             ) {
            if (map1.containsKey(end.substring(0,1))){
                continue;
            }else {
                map1.put(end.substring(0,1),end);
            }
        }

        return map1;
    }
}
