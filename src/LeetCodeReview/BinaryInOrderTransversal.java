package LeetCodeReview;



import java.util.ArrayList;
import java.util.List;

public class BinaryInOrderTransversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(ConvertSortedArraytoBinarySearchTree.TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        if (root != null) {
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
        return arr;
    }}
