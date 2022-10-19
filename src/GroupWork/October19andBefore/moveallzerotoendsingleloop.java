package GroupWork.October19andBefore;

import java.util.Arrays;

public class moveallzerotoendsingleloop {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 7,8,0};
        System.out.println(Arrays.toString(moveallzero(arr)));
    }

    public static int[] moveallzero(int[] array) {

        int fast = 0;
        int slow = 0;

        while (fast < array.length - 1) {

            if (array[slow] != 0) {
                slow++;
            }
            if (fast <= slow || array[fast] == 0) {
                fast++;
            }

            if (array[slow] == 0 && array[fast] != 0) {

                array[slow] = array[fast];
                array[fast] = 0;
            }
        }
        return array;
    }
}
