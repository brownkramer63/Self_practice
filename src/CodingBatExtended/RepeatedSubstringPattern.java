package CodingBatExtended;

import java.util.ArrayList;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aba"));
    }
    public static boolean repeatedSubstringPattern(String s) {
        ArrayList<String> arr = new ArrayList<>();
        if (s.length()==2){
        if (s.charAt(0)==s.charAt(1)){
            return true;
        }}
        for (int i = 1; i <s.length() ; i++) {
            arr.add(s.substring(i));
        }
        for (String each:arr
             ) {
            if (s.contains(each)){
                String answer=s.replaceFirst(each,"");
                if (answer.contains(each) && each.length()>1){
                    return true;
                }else {
                    answer=s;
                }

            }
        }
        return false;
    }
}
