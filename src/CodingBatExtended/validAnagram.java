package CodingBatExtended;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public static void main(String[] args) {
    String s="anagram";
    String t="nagaram";

        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();

        for (Character each:s.toCharArray()
             ) {
            if (hash1.containsKey(each)){
                hash1.put(each,hash1.get(each)+1);
            }else {
                hash1.put(each,1);
            }
        }
        //----------------
        for (Character each:t.toCharArray()
        ) {
            if (hash2.containsKey(each)){
                hash2.put(each,hash2.get(each)+1);
            }else {
                hash2.put(each,1);
            }
        }
        //-------------------
       if (hash1.equals(hash2)){
           return true;
       }
       return false;
    }
}
