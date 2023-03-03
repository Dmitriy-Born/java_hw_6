import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = preorderTraversal(root);
        System.out.println(result);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.val); // посещаем корень
            result.addAll(preorderTraversal(root.left)); // обходим левое поддерево
            result.addAll(preorderTraversal(root.right)); // обходим правое поддерево
        }
        return result;
    }
}


