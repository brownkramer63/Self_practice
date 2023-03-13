package LeetCodeReview;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash1 = new HashMap<>();
        for (Integer each:nums
             ) {
            if (hash1.containsKey(each)){
                hash1.put(each,hash1.get(each)+1);
            }else {
                hash1.put(each,1);
            }

        }
        int holder=0;
        int answer=0;
       for (Map.Entry<Integer,Integer> set: hash1.entrySet()){
           if (set.getValue()>holder){
               holder=set.getValue();
               answer=set.getKey();
           }

       }
       return answer;
    }
}
