package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class CountingSort1 {
    public static void main(String[] args) {

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        ArrayList<Integer> listsss= new ArrayList<>();
        int count=0;
        for (Integer each:ar
             ) {
            if (!listsss.contains(each)){
                listsss.add(each);
            }else {
                listsss.remove(each);
                count++;
            }
        }
        return count;
    }

}
