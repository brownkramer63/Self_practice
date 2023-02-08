package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MErgeSortedArray2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,0,0,0};
        int[] nums2={1,2,3};
        int m =3;
        int n=3;

        System.out.println(Arrays.toString(mergeSortedArray(nums,m,nums2,n)));
    }
    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        ArrayList<Integer>arrayList= new ArrayList<>();
        for (int i = 0; i <nums2.length ; i++) {
            arrayList.add(nums1[i]);
            arrayList.add(nums2[i]);
        }
        Collections.sort(arrayList); //hopefully this works
        for (int i = 0; i < nums1.length ; i++) {
            nums1[i]=arrayList.get(i);
        }


return nums1;
    }
}
