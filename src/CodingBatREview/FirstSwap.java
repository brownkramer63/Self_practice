package CodingBatREview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args) {
String[] strings={"salt", "tea", "soda", "toast"};

    }

//    public static String[] firstSwap(String[] strings) {
//        String[] result =  new String[strings.length];
//        HashMap<Character,Integer> hashmap1= new HashMap<>();
//        for (int i = 0; i < strings.length ; i++) {
//            char c = strings[i].charAt(0);
//            if (hashmap1.containsKey(c)){
//                int point= hashmap1.get(c);
//                hashmap1.remove(c);
//                result[i]=result[point];
//                result[point]=strings[i];
//            }else {
//                result[i]=strings[i];
//                hashmap1.put(c,i);
//            }
//        }
//return result   ;
//    }
//    public Map<String, Integer> wordCount(String[] strings) {
//        HashMap<String,Integer> hashmap1 = new HashMap<>();
//        for(String each: strings){
//            if(hashmap1.containsKey(each)){
//              hashmap1.put(each,hashmap1.get(each)+1);
//            }else{
//                hashmap1.put(each,1);
//            }
//
//        }
//        return hashmap1;
//}
//    public static  Map<String, String> firstChar(String[] strings) {
//        HashMap<String,String> hashmap1=  new HashMap<>();
//        for(String each: strings){
//            if(hashmap1.containsKey(each.substring(0,1))){
//                hashmap1.put("holder",hashmap1.get(each.substring(0,1))+each);
//                hashmap1.put(each.substring(0,1),hashmap1.get("holder"));
//                hashmap1.remove("holder");
//
//            }else{
//                hashmap1.put(each.substring(0,1),each);
//            }
//        }
//        return hashmap1;
//    }
//public  static String[] firstSwap(String[] strings) {
//HashMap<Integer,Character> hash1 = new HashMap<>();
//int holder=0;
//    for (String each:strings
//         ) {
//       hash1.put(holder,each.charAt(0));
//       holder++;
//    }
//    //so we now have a list of maps like
//    //0 s
//    //1 t
//    //2 s
//    //3 t
//
//}
}