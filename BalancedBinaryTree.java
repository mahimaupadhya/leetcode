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
    public boolean isBalanced(TreeNode root) {
        if(isBal(root)==-1){return false;}
        else{return true;}
}
    public static int isBal(TreeNode root)
    {
        
        if(root==null)
        {
            return 0;
        }
        int l=isBal(root.left);
        if(l==-1){return -1;}
        int r= isBal(root.right);
        if(r==-1){return -1;}
        if(Math.abs(r-l)<=1){return Math.max(l,r)+1;}
        else{return -1;}
        
    }
} 
