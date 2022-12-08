package GroupWork.DECEMBER120822;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums ={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
       Arrays.sort(nums);
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (Integer each:nums
             ) {
            arrayList.add(each);
        }
        if(arrayList.get(0).equals(1)){ // added this for leetcode
            return 0;
        }

        for (int i = 0; i <arrayList.size() ; i++) {
            if (!arrayList.contains(arrayList.get(i)+1)){
                return arrayList.get(i)+1;
            }
        }


//review with group.
return 0;
    }
}
