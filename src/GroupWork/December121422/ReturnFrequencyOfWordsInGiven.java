package GroupWork.December121422;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ReturnFrequencyOfWordsInGiven {
    public static void main(String[] args) {
        String s=" this          is an eXample!! of an example....";
        System.out.println(returnFrequencyOfWords(s));
    }
    public static Map<String,Integer> returnFrequencyOfWords(String s){
        s=s.toLowerCase();

  s=s.replaceAll("[^a-zA-Z\\s]","");
 s=s.trim();

 Map<String,Integer> map1 = new HashMap<>();
 String[] arr = s.split(" ");

        for (int i = 0; i <arr.length ; i++) {

            if (map1.containsKey(arr[i])){
                map1.put(arr[i],map1.get(arr[i])+1 );
            }else {
                map1.put(arr[i],1 );
            }

        }
        map1.remove("");

return map1;
    }
}
