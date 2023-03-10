package HackerRank;

import java.util.ArrayList;
import java.util.Stack;

public class SingleNumber {

    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        ArrayList<Integer> ss= new ArrayList<>();
        for (Integer each:nums
             ) {
            if (ss.contains(each)){
                ss.remove(each);
            }else {
                ss.add(each);
            }
        }
        return ss.get(0);
    }
}
