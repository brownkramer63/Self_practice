package CodingBat;

import java.util.List;

public class Square {
    public static void main(String[] args) {

    }
    public List<Integer> square(List<Integer> nums) {
 nums.replaceAll(n -> n*n);
 return nums;
    }
}
