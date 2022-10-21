package edabit;
import java.util.*;


public class ArrayOfMultiples {
    public static void main(String[] args) {

    }
    public static int[] arrayOfMultiples(int num, int length) {
ArrayList<Integer> answer= new ArrayList<>();

        for (int i = 1; i <length+1 ; i++) {
            answer.add(num*i);
        }
        int[] arr = new int[answer.size()];

        for (int i = 0; i <answer.size() ; i++) {
            arr[i]=answer.get(i);
        }
        return arr;

    }
}
