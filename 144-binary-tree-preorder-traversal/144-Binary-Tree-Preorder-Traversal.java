
import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);          // 1. Visit root
        preorder(root.left, result);   // 2. Visit left subtree
        preorder(root.right, result);  // 3. Visit right subtree
    }
}
