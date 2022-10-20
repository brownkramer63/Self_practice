package GroupWork.October19andOnward;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
    int[] nums ={4,1,2,1,2};
        System.out.println(singleNumber(nums));


    }
    public static int singleNumber(int[] nums){
        int numslength= nums.length;
        Map<Integer, Integer>map1 = new HashMap<>();
        //simply making the hash map and adding in the nums[i] as key and amount they show up as value in count
        for (int i = 0; i <numslength ; i++) {
            Integer count= map1.get(nums[i]);

            if (count==null){
                count=1;
            }
            else {
                count++;
            }
            map1.put(nums[i],count);
        }
        //returning the value that is not a duplicate
        for (Integer key:nums
             ) {
            if (map1.get(key)==1){
                return key;
            }
        }




        return 911;
    }
}
