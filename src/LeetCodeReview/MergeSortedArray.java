package LeetCodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2={2,5,6};

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        for (int i = nums1.length-nums2.length; i <nums1.length ; i++) {
            nums1[i]=nums2[count];
            count++;
        }
      List<Integer> arr1 = new ArrayList<>();
        for (Integer each:nums1
             ) {
            arr1.add(each);
        }

        arr1=arr1.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < nums1.length ; i++) {
            nums1[i]=arr1.get(i);
        }

    }
}
