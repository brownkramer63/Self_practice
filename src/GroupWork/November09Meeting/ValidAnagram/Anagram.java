package GroupWork.November09Meeting.ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(ValidAnagramMethod2("anagram", "tagaram"));
        System.out.println(ValidAnagramMethod2("car", "rar"));
        System.out.println(validAnagramMethod3("anagram", "aaagram"));
    }

    public static boolean validAnagramMethod(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str1.contains(str2.charAt(i) + "")) {
                continue;
            } else {
                return false;
            }
        }


        return true;
    }

    public static boolean ValidAnagramMethod2(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars); //acr
        Arrays.sort(chars1); //acr
        return Arrays.equals(chars, chars1);

    }

    public static boolean validAnagramMethod3(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!(map1.containsKey(c))) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }
        System.out.println(map1);

        for (int i = 0; i < str2.length(); i++) {
            char s = str2.charAt(i);
            if (map1.containsKey(s)) {
                if (map1.get(s) != 1) {
                    map1.put(s, map1.get(s) - 1);
                    System.out.println(map1);
                } else {
                    map1.remove(s);
                    System.out.println(map1);
                }


            } else {
                return false;
            }
        }


        return map1.isEmpty();

    }


}
