package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Median {
    public static void main(String[] args) {

    }
    // Write your code here
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        ArrayList<Integer> store = new ArrayList<>();
        for (Integer each: a){
            if(store.contains(each)){
                store.remove(each);
            }else{
                store.add(each);
            }

        }
        int answer = store.get(0);
        return answer;
    }
}

