/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        postorder(root,a);
        return a;
    }
    static void postorder(TreeNode node,List<Integer> a){
        if(node==null){
            return;
        }
        postorder(node.left,a);
        postorder(node.right,a);
        a.add(node.val);
    }
}