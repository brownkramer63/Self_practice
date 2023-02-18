package CodingBatAP1;

import java.util.ArrayList;
import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }
    public static Object[] seriesUp(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int index=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                arr.add(j);
            }
        }

        Object[] obj= arr.toArray();
        return obj;
       }
    }

