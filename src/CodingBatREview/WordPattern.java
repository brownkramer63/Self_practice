package CodingBatREview;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }
//    public static boolean checkPattern(String pattern, String s) {
//        List<Character> charSet = new ArrayList<>();
//        for (Character character : pattern.toCharArray()) {
//            charSet.add(character);
//        }
//        List<String> stringSet = new ArrayList<>();
//        for (String sequence : s.split(" ")) {
//            stringSet.add(sequence);
//        }
//        Map<Character, String> setMap = new HashMap<>();
//        List<String> usedValues = new ArrayList<>();
//        int index = 0;
//       for (Character ch : charSet) {
//           if (setMap.containsKey(ch)) {
//               String setString = setMap.get(ch);
//               if (usedValues.contains(setString)) {
//                   return false;
//               }
//               if (!stringSet.get(index).equals(setString)) {
//                   return false;
//               }
//           } else {
//               setMap.put(ch, stringSet.get(index));
//               usedValues.add(stringSet.get(index));
//           }
//           index++;
//       }
//       return true;
//    }

    public static boolean wordPattern(String pattern, String s) {
    ArrayList<Character>arr = new ArrayList<>();
    ArrayList<String>arr1 = new ArrayList<>();
        for (Character each:pattern.toCharArray()
             ) {
            arr.add(each);
        }
        for (String each1:s.split(" ")
             ) {
            arr1.add(each1);
        }
        if (arr.size()!=arr1.size()){
            return false;
        }

       HashMap<Character, Integer> hash1 = new HashMap<>();
       int holder =1;
        for (Character each:arr
             ) {
            if (!hash1.containsKey(each)){ // so a=1 b=2 now they have values
                hash1.put(each,holder);
                holder++;
            }
        }
        int holder2=1;
        HashMap<String, Integer> hash2 = new HashMap<>();
        for (String ss:arr1
             ) {
            if (!hash2.containsKey(ss)){
                hash2.put(ss,holder2);
                holder2++;
            }
        }
        // now cat=1 dog=2
        //have two arrays now of these
        ArrayList<Integer> count1 = new ArrayList<>();
        ArrayList<Integer> count2 = new ArrayList<>();
        for (Character each:arr
             ) {
           if (hash1.containsKey(each)){
               count1.add(hash1.get(each));
           }
        }
        for (String gg:arr1
             ) {
            if (hash2.containsKey(gg)){
                count2.add(hash2.get(gg));
            }
        }
        //now we compare the lists with number values
        for (int i = 0; i <pattern.length() ; i++) {
            if (count1.get(i)!=count2.get(i)){
                return false;
            }
        }
        return true;
    }
}
