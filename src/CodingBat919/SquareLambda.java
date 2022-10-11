package CodingBat919;

import java.util.List;
import java.util.stream.Collectors;

public class SquareLambda {
    public static void main(String[] args) {

    }
    public List<Integer> square(List<Integer> nums) {
nums.replaceAll(n-> n*n);
return nums;

    }
}
