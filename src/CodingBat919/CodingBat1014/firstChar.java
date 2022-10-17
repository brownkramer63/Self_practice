package CodingBat919.CodingBat1014;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {

    }
    public Map<String, String> firstChar(String[] strings) {
Map<String, String >Map3 = new HashMap<>();
String empty="";
//need to fix
//i need to check each string againest all other strings im thinking nested loop
        for (String each:strings
             ) {
            for (String each2:strings
                 ) {
                if (each2.charAt(0)==each.charAt(0) && (!empty.contains(each))){
                    empty+=each2+each;
                }
            }
            Map3.put(each.charAt(0)+"",empty);
            empty="";
        }
        return Map3;
    }
}
