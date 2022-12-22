package LeetCode.Medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
int[] height={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxarea = 0;
        for (int left = 0; left < height.length; left++) {
            for (int right = left + 1; right < height.length; right++) {
                int width = right - left;
                maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            }
        }
        return maxarea;
    }
}
