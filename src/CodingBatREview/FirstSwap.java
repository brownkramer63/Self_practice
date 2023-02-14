package CodingBatREview;

import java.util.Arrays;
import java.util.HashMap;

public class FirstSwap {
    public static void main(String[] args) {
String[] strings={"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println(Arrays.toString(firstSwap(strings)));
    }

    public static String[] firstSwap(String[] strings) {
        String[] result =  new String[strings.length];
        HashMap<Character,Integer> hashmap1= new HashMap<>();
        for (int i = 0; i < strings.length ; i++) {
            char c = strings[i].charAt(0);
            if (hashmap1.containsKey(c)){
                int point= hashmap1.get(c);
                hashmap1.remove(c);
                result[i]=result[point];
                result[point]=strings[i];
            }else {
                result[i]=strings[i];
                hashmap1.put(c,i);
            }
        }
return result   ;
    }}