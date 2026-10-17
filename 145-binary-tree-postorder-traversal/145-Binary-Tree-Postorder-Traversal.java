
import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorder(root.left, result);   // 1. Visit left subtree
        postorder(root.right, result);  // 2. Visit right subtree
        result.add(root.val);           // 3. Visit root
    }
}
