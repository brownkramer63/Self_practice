package GroupWork.November28;

public class SameTree {
    public static void main(String[] args) {
//we have to make a tree class
        //we have to transverse both trees from root left right

    }

    public static boolean isSameTreeThing(TreeNode root1, TreeNode root2) { //2

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.value != root2.value) {
            return false;
        }
        boolean isLeftTrue=isSameTreeThing(root1.leftChild, root2.leftChild);
        boolean isRightTrue=isSameTreeThing(root1.rightChild, root2.rightChild);

        return isLeftTrue && isRightTrue;

    }

}
