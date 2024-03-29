package LeetCodeReview;

public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    private TreeNode CreateBST(int nums[], int left, int right) {
        if (left > right) return null;
        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = CreateBST(nums, left, m - 1);
        root.right = CreateBST(nums, m+ 1, right);
        return root;
    }
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
