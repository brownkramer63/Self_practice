package practice03302023;

import java.util.HashMap;
import java.util.Map;

public class scoresincreasing {
    public static void main(String[] args) {

    }
    public static boolean scoreincreasing(int[] scores){
        int answer=0;
        for (int i = 1; i <scores.length ; i++) {
            if (scores[i-1]>scores[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean scores100(int[] scores) {
        for (int i = 1; i <scores.length-1 ; i++) {
            if (scores[i-1]==100 && scores[i]==100){
                return true;
            }
            if (scores[i+1]==100 && scores[i]==100){
                return true;
            }
        }
        return false;
    }
    public static boolean scoresClump(int[] scores) {
        for (int i = 1; i <scores.length-1 ; i++) {
            if (scores[i+1]-scores[i]<=2 && scores[i]-scores[i-1]<=2 && scores[i+1]-scores[i-1] <=2 ){
                return true;
            }
        }
        return false;
    }
    public static int wordsCount(String[] words, int len) {
    int count = 0;
        for (String each:words
             ) {
            if (each.length()==len){
                count++;
            }
        }
        return count;
    }
    public static Map<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> hash1 = new HashMap<>();
        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,0);
            }
        }
        return hash1;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> hash1 = new HashMap<>();
        for (String each:strings
        ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,each.length());
            }
        }
        return hash1;
    }
    public Map<String, String> pairs(String[] strings) {
    HashMap<String, String> hash1 = new HashMap<>();
        for (String each:strings
             ) {
            if (!hash1.containsKey(each.substring(0,1))){
                hash1.put(each.substring(0,1),each.substring(each.length()-1));
            }
        }
        return hash1;
    }
    public String wordAppend(String[] strings) {
    HashMap<String,Integer> hash1 = new HashMap<>();
    String answer="";
        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,1);
            }else {
                hash1.put(each,hash1.get(each)+1);
            }
        }
        for (Map.Entry<String,Integer> each:hash1.entrySet()
             ) {
            if (each.getValue()%2==0){
                int times = 0;
                times= each.getValue()/2;
                for (int i = 0; i <times ; i++) {
                    answer=answer+each.getKey();
                }
            }else {
                int other = 0;
                other=each.getValue()-1;
                other=other/2;
                for (int i = 0; i <other ; i++) {
                    answer=answer+each.getKey();
                }
            }
        }
        return answer;
    }


}
