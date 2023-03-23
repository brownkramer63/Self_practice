package CodingBatExtended;

import java.util.*;

public class AllSwap {
    public static void main(String[] args) {
        String[] strings= {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"};
        System.out.println(Arrays.toString(allSwap(strings)));
    }

    public static String[] allSwap(String[] strings) {
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c))
            {
                int p=map.get(c);
                map.remove(c);
                ;
                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                map.put(c,i);
            }
        }
        return result;
    }
}
