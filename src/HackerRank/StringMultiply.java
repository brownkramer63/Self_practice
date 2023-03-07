package HackerRank;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StringMultiply {
    public static void main(String[] args) {
        System.out.println(multiply("498828660196","840477629533"));
    }
    public static String multiply(String num1, String num2) {
//      BigInteger nums1=
//        BigInteger nums2= BigInteger.valueOf(Long.parseLong(num2));
//        BigInteger total= nums1.multiply(nums2);
//
//        String answer= String.valueOf(total);
//        return answer;
        return String.valueOf((new java.math.BigInteger(num1)).multiply(new java.math.BigInteger(num2)));

    }
}
