package practice03302023;

import java.util.ArrayList;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("foo","bar"));
    }
    public static boolean isIsomorphic(String s, String t) {
//two parts one will be an arraylist for both strings laying out them in just numbers
        //then we will also have two different hashmaps that will contain the amounts of each actually may 
        //only need the arraylists. 
        //egge 1221
        // e 1 g 2
        if (s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();
        int holder =0;
        for (int i = 0; i <s.length() ; i++) {
            if (!arr1.contains(s.charAt(i))){
                arr1.add(s.charAt(i));
                holder++;
                arr2.add(holder);
                hash1.put(s.charAt(i),holder);
            }
            else {
                arr1.add(s.charAt(i));
                arr2.add(hash1.get(s.charAt(i)));
            }
        }//p
        //first part
        holder=0;
        ArrayList<Character> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        for (int i = 0; i <t.length() ; i++) {
            if (!arr3.contains(t.charAt(i))){
                arr3.add(s.charAt(i));
                holder++;
                arr4.add(holder);
                hash2.put(t.charAt(i),holder);
            }
            else {
                arr3.add(s.charAt(i));
                arr4.add(hash2.get(t.charAt(i)));
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if (arr2.get(i)!=arr4.get(i)){
                return false;
            }
        }
        return true;
    }
}
