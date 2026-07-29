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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        inorder(root,l);
        return l.get(l.size()-k);
    }
    private void inorder(TreeNode x, List<Integer> res)
    {
        if(x==null)
        return;
        inorder(x.right,res);
        res.add(x.val);
        inorder(x.left,res);
    }
}